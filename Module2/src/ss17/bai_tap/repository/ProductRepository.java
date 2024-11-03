package ss17.bai_tap.repository;

import ss17.bai_tap.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static  List<Product> products = new ArrayList<>();
//    static {
//        products.add(new Product(01,"Phone",8000000,"Xiaomi","Cảm ứng"));
//        products.add(new Product(02, "TV", 15000000, "Samsung", "Smart"));
//    }
    File filePath = new File("src/ss17/bai_tap/Product.csv");
    public void saveToFile(Product product, String file ) {
            getProduct(file);
        products.add(product);
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public  List<Product> getProduct(String file) {
         File file1 = new File(file);
        if (file1.exists()) {
            try (FileInputStream fis = new FileInputStream(file);
                 ObjectInputStream ois = new ObjectInputStream(fis)) {
                try {
                    products = (List<Product>) ois.readObject();
                } catch (ClassCastException e) {
                    System.out.println("Error");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println( e.getMessage());
            }
        }
        return products;
    }
    public List<Product> displayProducts() {
        return products;
    }

}
