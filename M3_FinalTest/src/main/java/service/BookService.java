package service;

import databaseConnect.ConnectDB;
import model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService{
    ConnectDB connectDB = new ConnectDB();
    private static final String SHOW_ALL_BOOK = "SELECT * FROM book";
    @Override
    public List<Book> getAllBook() {
        List<Book> books = new ArrayList<>();
        Connection connection = null;
        try {
            connection = connectDB.connectDB();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SHOW_ALL_BOOK);
            while (rs.next()){
                int bookID = rs.getInt("bookID");
                String bookName = rs.getString("bookName");
                String authorName = rs.getString("authorName");
                String des = rs.getString("des");
                int quantity = rs.getInt("quantity");
                Book book = new Book(bookID,bookName,authorName,des,quantity);
                books.add(book);

            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return books;
    }
}
