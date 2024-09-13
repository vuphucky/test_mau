package controller;

import model.Book;
import model.Student;
import service.BookService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "book", value = "/BookServlet")
public class BookServlet extends HttpServlet {
  BookService bookService = new BookService();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            default:
                showAllBook(request,response);
                break;
        }
    }

    private void showAllBook(HttpServletRequest request, HttpServletResponse response) {
        try {
            List<Book> books = new ArrayList<>();
            books = bookService.getAllBook();
            request.setAttribute("bookList", books);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listBook.jsp");
            dispatcher.forward(request,response);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}