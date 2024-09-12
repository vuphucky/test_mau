package model;

public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;
    private  int colorID;
    private int categoryID;

    public Product() {
    }

    public Product(String productName, double price, int quantity, int colorID, int categoryID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.colorID = colorID;
        this.categoryID = categoryID;
    }

    public Product(int productID, String productName, double price, int quantity, int colorID, int categoryID) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.colorID = colorID;
        this.categoryID = categoryID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getColorID() {
        return colorID;
    }

    public void setColorID(int colorID) {
        this.colorID = colorID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", colorID=" + colorID +
                ", categoryID=" + categoryID +
                '}';
    }
}
