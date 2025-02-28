package case_study.repository;

import case_study.entity.Product;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository {
    private static List<Product> products = new ArrayList<Product>();
//    static {
//        products.add(new Product("B01478", "H.A.Intensifier", 98, 2592075, "Serum cấp ẩm", "Dược mỹ phẩm", "SkinCeuticals"));
//        products.add(new Product("D90321", "Anessa Perfect UV Sunscreen", 198, 762375, "Kem chống nắng", "Hóa mỹ phẩm", "Shiseido"));
//        products.add(new Product("A00218", "Effaclar Duo", 178, 686137, "Trị mụn", "Dược mỹ phẩm", "La Roche-Posay"));
//        products.add(new Product("A00319", "Cicaplast Baume B5", 230, 406600, "Phục hồi da", "Dược mỹ phẩm", "La Roche-Posay"));
//        products.add(new Product("A90123", "Senka Perfect Whip", 200, 304950, "Sữa rửa mặt", "Hóa mỹ phẩm", "Shiseido"));
//        products.add(new Product("A00220", "Obagi-C Fx System", 162, 3176563, "Chăm sóc da", "Dược mỹ phẩm", "Obagi"));
//
//    }
    File filePath = new File("src/case_study/WarehouseDetail.csv");
    public void saveToFile(String filePath, Product product) {
        getProducts(filePath);
        products.add(product);
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    public List<Product> getProducts(String file) {
        File file1 = new File(file);
        if(file1.exists()){
            try (
                    FileInputStream fis = new FileInputStream(file1);
                    ObjectInputStream ois = new ObjectInputStream(fis)){
                try {
                    products = (List<Product>) ois.readObject();
                }catch (ClassCastException e){
                    System.out.println("Error");
                }
            } catch (IOException | ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
        return products;
    }
    public List<Product> displayProducts() {
        return products;
    }
    public List<Product> sortProductsById() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getId().compareTo(product2.getId());
            }
        });
        return products;
    }
    public List<Product> sortProductsByName() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getName().compareTo(product2.getName());
            }
        });
        return products;
    }
    public List<Product> sortProductsByQuantity() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Integer.compare(product1.getQuantity(), product2.getQuantity());
            }
        });
        return products;
    }
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return Integer.compare(product1.getPrice(), product2.getPrice());
            }
        });
        return products;
    }

    public boolean removeProduct(String id) {
        Product oldProduct = new Product();
        for(int i = 0; i < products.size(); i++){
            oldProduct = products.get(i);
            if(oldProduct.getId().equals(id)){
                products.remove(i);
                try (FileOutputStream fos = new FileOutputStream(filePath);
                     ObjectOutputStream oos = new ObjectOutputStream(fos)){
                    oos.writeObject(products);
                } catch (IOException e) {
                    System.out.println("Error" + e.getMessage());
                }
                return true;
            }
        }
        return false;
    }
    public boolean updateProduct(Product product){
        Product oldProduct = new Product();
        for(int i = 0; i < products.size(); i++){
            oldProduct = products.get(i);
            if((oldProduct.getId()).equals(product.getId())){
                oldProduct.setName(product.getName());
                oldProduct.setPrice(product.getPrice());
                oldProduct.setQuantity(product.getQuantity());
                oldProduct.setBenefit(product.getBenefit());
                oldProduct.setCategory(product.getCategory());
                oldProduct.setSupplier(product.getSupplier());
                products.set(i, oldProduct);
                return true;
            }
        }
        return false;
    }
}

