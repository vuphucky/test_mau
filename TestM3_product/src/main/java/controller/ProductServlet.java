package controller;

import model.Product;
import service.ProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    ProductService productService = new ProductService();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "showAll":
                System.out.println("chay lennh hien danh sach");
                showAllProduct(request,response);
                break;
            case "create":
                try {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                break;
            case "delete":
                int id = Integer.parseInt(request.getParameter("id"));
                productService.deleteProduct(id);
                response.sendRedirect("index.jsp");
            default:
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                String name =request.getParameter("productName");
                double price = Double.parseDouble(request.getParameter("price"));
                int quantity = Integer.parseInt(request.getParameter("quantity"));
                int colorID = Integer.parseInt(request.getParameter("color"));
                int categoryID = Integer.parseInt(request.getParameter("category"));
                Product product = new Product(name,price,quantity,colorID,categoryID);
                productService.addProduct(product);
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                try {
                    dispatcher.forward(request,response);
                } catch (ServletException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Product> products = new ArrayList<>();
            products = productService.getAllProduct();
            request.setAttribute("ProductList", products);
            RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
            dispatcher.forward(request, response);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}