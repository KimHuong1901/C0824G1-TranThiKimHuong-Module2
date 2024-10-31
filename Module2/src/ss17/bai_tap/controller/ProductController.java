package ss17.bai_tap.controller;

import ss17.bai_tap.entity.Product;
import ss17.bai_tap.services.ProductServices;
import java.util.List;

public class ProductController {
    private ProductServices productServices = new ProductServices();
    public void getProduct(String file){
        productServices.getProducts(file);
    }
    public List<Product> displayProduct(){
        return productServices.displayProducts();
    }
    public boolean addProduct(Product product, String file){
        return productServices.addProduct(product, file);
    }
    public Product findProductById(String file, int id){
       return productServices.findProductById(file, id);
    }
}
