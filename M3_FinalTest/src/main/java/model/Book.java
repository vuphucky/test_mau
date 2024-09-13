package model;

public class Book {
    int bookID;
    String bookName;
    String authorName;
    String des;
    int quantity;

    public Book() {
    }

    public Book(String bookName, String authorName, String des, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.des = des;
        this.quantity = quantity;
    }

    public Book(int bookID, String bookName, String authorName, String des, int quantity) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.des = des;
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
