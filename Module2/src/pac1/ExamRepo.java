package pac1;

import case_study.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExamRepo {
    private static List<Product> products = new ArrayList<Product>();
    static {
        products.add(new Product("B01478", "H.A.Intensifier", 98, 2592075, "Serum cấp ẩm", "Dược mỹ phẩm", "SkinCeuticals"));
        products.add(new Product("D90321", "Anessa Perfect UV Sunscreen", 198, 762375, "Kem chống nắng", "Hóa mỹ phẩm", "Shiseido"));
        products.add(new Product("A00218", "Effaclar Duo", 178, 686137, "Trị mụn", "Dược mỹ phẩm", "La Roche-Posay"));
        products.add(new Product("A00319", "Cicaplast Baume B5", 230, 406600, "Phục hồi da", "Dược mỹ phẩm", "La Roche-Posay"));
        products.add(new Product("A90123", "Senka Perfect Whip", 200, 304950, "Sữa rửa mặt", "Hóa mỹ phẩm", "Shiseido"));
        products.add(new Product("A00220", "Obagi-C Fx System", 162, 3176563, "Chăm sóc da", "Dược mỹ phẩm", "Obagi"));

    }
    File filePath = new File("src/case_study/ExamProduct.csv");
    public void saveToFile(Product product, String filePath) {
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
}
