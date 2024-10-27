package ss12.bai_tap.repository;

import ss12.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {
     private static  List<Product> products = new ArrayList<>();
     static {
          products.add(new Product(10, "tr", 4, 5));
          products.add(new Product(12, "tr1", 9, 5));
          products.add(new Product(13, "tr2", 7, 5));
     }
     public List<Product> getValue(){
          List<Product> productList = new ArrayList<>();
          for(Product newProduct: products ){
              productList.add(newProduct);
          }
          return productList;
     }
     public boolean addProduct(Product product){
          products.add(product);
          return true;
     }
     public boolean editProduct(Product product){
          Product oldProduct = new Product();
          for( int i = 0; i < products.size(); i++){
               oldProduct = products.get(i);
               if ( product.getId() == oldProduct.getId()){
                    oldProduct.setName(product.getName());
                    oldProduct.setPrice(product.getPrice());
                    oldProduct.setQuantity(product.getQuantity());
                    products.set(i, oldProduct);
                    return true;
               }
          }
          return false;
     }
     public boolean removeProduct(int id){
          Product oldProduct = new Product();
          for (int i = 0; i < products.size(); i++ ){
               oldProduct = products.get(i);
               if ( oldProduct.getId() == id){
                    products.remove(i);
                    return true;
               }
          }
          return false;
     }
     public List<Product> findProduct(String name){
               List<Product> foundProductList = new ArrayList<>();
          for(Product newProduct: products){
               if (newProduct.getName().equals(name)){
                    foundProductList.add(newProduct);
               }
          }
          return foundProductList;
     }
     public List<Product> sortProductIncre(){
          Collections.sort(products, new Comparator<Product>() {
               @Override
               public int compare(Product product1, Product product2) {
                    return product1.getPrice() > product2.getPrice() ? 1 : -1;
               }
          });
          return products;
     }
     public List<Product> sortProductDescre(){
          Collections.sort(products, new Comparator<Product>() {
               @Override
               public int compare(Product product1, Product product2) {
                    return product1.getPrice() < product2.getPrice() ? 1 : -1;
               }
          });
          return products;
     }

}
