package case_study.controller;

import case_study.entity.Product;
import case_study.services.IProductServices;
import case_study.services.ProductServicesFactory;
import case_study.util.ServiceEnum;

import java.util.List;

public class WareHouseController {
    private static IProductServices productServices = ProductServicesFactory.getInstance(ServiceEnum.PRODUCT);
    public void getProducts(String file){
        productServices.getProducts(file);
    }
    public List<Product> displayProduct(){
        return productServices.displayProducts();
    }
    public boolean addProduct(String file, Product product){
        return productServices.addProduct(file, product);
    }
    public Product findProduct(String file, String data){
        return productServices.findProductByData(file, data);
    }
    public List<Product> sortProductById(){
       return productServices.sortProductById();
    }
    public List<Product> sortProductByName(){
        return productServices.sortProductByName();
    }
    public List<Product> sortProductByPrice(){
        return productServices.sortProductByPrice();
    }
    public List<Product> sortProductByQuantity(){
        return productServices.sortProductByQuantity();
    }
    public boolean removeProduct(String id){
        return productServices.removeProduct(id);
    }
    public boolean updateInfoProduct(Product product){
        return productServices.updateInfoProduct(product);
    }

}
