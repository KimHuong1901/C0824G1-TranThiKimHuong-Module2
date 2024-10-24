package ss12.bai_tap.controller;

import ss12.bai_tap.entity.Product;
import ss12.bai_tap.service.ProductManagerService;

import java.util.ArrayList;

public class ProductController {
        public ArrayList<Product> products = new ArrayList<Product>();
        ProductManagerService productManager = new ProductManagerService();
        public ArrayList<Product> getProducts() {
            return productManager.getNewProduct();
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
       public ArrayList<Product> findAllProducts(String name) {
            return productManager.findAllProduct(name);
       }
}
