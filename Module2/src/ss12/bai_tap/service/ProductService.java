package ss12.bai_tap.service;

import ss12.bai_tap.entity.Product;
import ss12.bai_tap.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductServices{
    private ProductRepository productManager = new ProductRepository();
    private List<Product> newProduct = new ArrayList<>();

    @Override
    public List<Product> getValue() {
        return productManager.getValue();
    }

    @Override
    public boolean addProduct(Product product) {
        return productManager.addProduct(product);
    }

    @Override
    public boolean removeProduct(int id) {
        return productManager.removeProduct(id);
    }

    @Override
    public boolean editProduct(Product product) {
        return productManager.editProduct(product);
    }

    @Override
    public List<Product> findAllProduct(String name) {
        return productManager.findProduct(name);
    }

    @Override
    public List<Product> sortProductIncre() {
        return (List<Product>) productManager.sortProductIncre();
    }

    @Override
    public List<Product> sortProductDescre() {
        return (List<Product>) productManager.sortProductDescre();
    }


//    @Override
//    public List<Product> getValue() {
//        return newProduct = productManager.getValue();
//    }
//
//    public boolean addProduct(Product product) {
//        return productManager.addProduct(product);
//    }
//
//    @Override
//    public boolean removeProduct(int id) {
//        return productManager.removeProduct(id);
//    }
//
//    @Override
//    public boolean editProduct(Product product) {
//        return productManager.editProduct(product);
//    }
//
//    @Override
//    public ArrayList<Product> findAllProduct(String name) {
//        return productManager.findProduct(name);
//    }
}
