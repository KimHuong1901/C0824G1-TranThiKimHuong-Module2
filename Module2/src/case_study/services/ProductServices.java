package case_study.services;

import case_study.entity.Product;
import case_study.repository.ProductRepository;


import java.util.List;

public class ProductServices implements IProductServices {
    private static ProductRepository productRepository = new ProductRepository();
    private static ProductServices instance = new ProductServices();
    private ProductServices() {}
    public static ProductServices getInstance() {
        return instance;
    }
    @Override
    public List<Product> getProducts(String file) {
        return productRepository.getProducts(file);
    }

    @Override
    public List<Product> displayProducts() {
        return productRepository.displayProducts();
    }

    @Override
    public boolean addProduct(String file, Product product) {
        ProductServices productService = new ProductServices();
        if (productService.findProductByData(file, product.getId()) == null){
            productRepository.saveToFile(file, product);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeProduct(String id) {
        return productRepository.removeProduct(id);
    }

    @Override
    public Product findProductByData(String file, String data) {
        List<Product> products = productRepository.getProducts(file);
        for (int i = 0; i < products.size(); i++) {
            if((products.get(i).getId()).equals(data)){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean updateInfoProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    @Override
    public List<Product> sortProductById() {
        return productRepository.sortProductsById();
    }

    @Override
    public List<Product> sortProductByName() {
        return productRepository.sortProductsByName();
    }

    @Override
    public List<Product> sortProductByPrice() {
        return productRepository.sortProductsByPrice();
    }

    @Override
    public List<Product> sortProductByQuantity() {
        return productRepository.sortProductsByQuantity();
    }
}
