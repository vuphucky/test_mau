package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();
    void deleteProduct(int id);
    void addProduct(Product product);

}
