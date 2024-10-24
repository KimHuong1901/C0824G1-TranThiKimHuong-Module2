package ss12.bai_tap.repository;

import ss12.bai_tap.entity.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductManagerList {
     static public  ArrayList<Product> products = new ArrayList<>();
     static {
          products.add(new Product(10, "tr", 4, 5));
          products.add(new Product(12, "tr1", 9, 5));
          products.add(new Product(13, "tr2", 7, 5));
     }
     public ArrayList<Product> getValue(){
          ArrayList<Product> productList = new ArrayList<>();
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
     public ArrayList<Product> findProduct(String name){
               ArrayList<Product> foundProductList = new ArrayList<>();
          for(Product newProduct: products){
               if (newProduct.getName().equals(name)){
                    foundProductList.add(newProduct);
               }
          }
          return foundProductList;
     }
}
