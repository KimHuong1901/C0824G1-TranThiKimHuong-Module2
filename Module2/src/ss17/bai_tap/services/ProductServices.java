package ss17.bai_tap.services;
import ss17.bai_tap.entity.Product;
import ss17.bai_tap.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductServices implements IProductServices {
    private ProductRepository productRepository = new ProductRepository();
    List<Product> newProduct = new ArrayList<>();

    @Override
    public List<Product> getProducts(String file) {
        return productRepository.getProduct(file);
    }

    @Override
    public List<Product> displayProducts() {
        return productRepository.displayProducts();
    }

    @Override
   public boolean addProduct(Product product, String file) {
         ProductServices productService = new ProductServices();
        if (productService.findProductById(file, product.getId()) == null){
            productRepository.saveToFile(product,file);
            return true;
        }
       return false;
    }

    @Override
    public Product findProductById(String file, int id) {
        newProduct = productRepository.getProduct(file);
        for (int i = 0; i < newProduct.size(); i++) {
            if(newProduct.get(i).getId() == id){
                return newProduct.get(i);
            }
        }
        return null;
    }
}
