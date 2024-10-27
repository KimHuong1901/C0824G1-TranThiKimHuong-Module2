package ss12.bai_tap.service;

import ss12.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductServices {
    List<Product> getValue();
    boolean addProduct(Product product);
    boolean removeProduct(int id);
    boolean editProduct(Product product);
    List<Product> findAllProduct(String name);
    List<Product> sortProductIncre();
    List<Product> sortProductDescre();
}
