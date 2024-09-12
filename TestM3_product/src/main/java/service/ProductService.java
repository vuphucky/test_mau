package service;

import db_conect.ConectDB;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
     ConectDB conectDB = new ConectDB();
     private static final String SHOW_ALL_PRODUCT = "select * from product";
     private static final String ADD_PRODUCT = "insert into product(product_name,price,quantity,color_id,category_id) values(?,?,?,?,?)";
     private static final String DELETE_PRODUCT_BYID = "delete from product where product_id = ?";
    @Override
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
       try{
           Connection connection = null;
           connection = conectDB.connectDB();
           Statement statement = connection.createStatement();
           ResultSet rs = statement.executeQuery(SHOW_ALL_PRODUCT);
           while (rs.next()){
               int productID = rs.getInt("product_id");
               String productName =rs.getString("product_name");
               double price = rs.getDouble("price");
               int quantity = rs.getInt("quantity");
               int colorID = rs.getInt("color_id");
               int  categoryID = rs.getInt("category_id");
               Product product = new Product(productID,productName,price,quantity,colorID,categoryID);
               products.add(product);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
       return products;
    }

    @Override
    public void deleteProduct(int id) {
        try{
            Connection connection = conectDB.connectDB();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT_BYID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void addProduct(Product product) {
       try{
           Connection connection = conectDB.connectDB();
           PreparedStatement preparedStatement = connection.prepareStatement(ADD_PRODUCT);
           preparedStatement.setString(1,product.getProductName());
           preparedStatement.setDouble(2,product.getPrice());
           preparedStatement.setInt(3,product.getQuantity());
           preparedStatement.setInt(4,product.getColorID());
           preparedStatement.setInt(5,product.getCategoryID());
           preparedStatement.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
