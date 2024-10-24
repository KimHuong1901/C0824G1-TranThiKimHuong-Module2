package ss12.bai_tap.service;

import ss12.bai_tap.entity.Product;
import ss12.bai_tap.repository.ProductManagerList;

import java.util.ArrayList;

public class ProductManagerService {
    ProductManagerList productManager = new ProductManagerList();
    ArrayList<Product> newProduct = new ArrayList<>();
    public ArrayList<Product> getNewProduct() {
        newProduct = productManager.getValue();
        return newProduct;
    }
    public boolean addProduct(Product product) {
        return productManager.addProduct(product);
    }
    public boolean editProduct(Product product) {
        return productManager.editProduct(product);
    }
    public boolean removeProduct(int id) {
        return productManager.removeProduct(id);
    }
    public ArrayList<Product> findAllProduct(String name) {
        return productManager.findProduct(name);
    }
}
