package ss17.bai_tap.services;

import ss17.bai_tap.entity.Product;

import java.io.File;
import java.util.List;

public interface IProductServices {
    List<Product> getProducts(String file);
    List<Product> displayProducts();
    boolean addProduct(Product product, String file);
    Product findProductById(String file, int id);
}
