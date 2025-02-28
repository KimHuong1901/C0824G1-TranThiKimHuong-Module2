package ss12.bai_tap.controller;

import ss12.bai_tap.entity.Product;
import ss12.bai_tap.service.ProductService12;

import java.util.List;

public class ProductController {
       private ProductService12 productManager = new ProductService12();
        public List<Product> getProducts() {
            return productManager.getValue();
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
       public List<Product> findAllProducts(String name) {
            return productManager.findAllProduct(name);
       }
       public List<Product> sortProductsIncre() {
            return productManager.sortProductIncre();
       }
       public List<Product> sortProductsDescre() {
        return productManager.sortProductDescre();
    }
}
