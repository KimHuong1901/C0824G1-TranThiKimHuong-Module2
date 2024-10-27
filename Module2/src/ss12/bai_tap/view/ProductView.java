package ss12.bai_tap.view;

import ss12.bai_tap.controller.ProductController;
import ss12.bai_tap.entity.Product;

import java.util.*;

public class ProductView {
    public static void main(String[] args) {
        Product product = new Product();
        ProductController productController = new ProductController();
        List<Product> displayProduct = productController.getProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hệ thống quản lý sản phẩm");
        System.out.println("1. Thêm sản phẩm: ");
        System.out.println("2. Sửa thông tin sản phẩm: ");
        System.out.println("3. Xóa sản phẩm: ");
        System.out.println("4. Hiển thị danh sách sản phẩm: ");
        System.out.println("5. Tìm kiếm sản phẩm: ");
        System.out.println("6. Sắp xếp sản phẩm: ");
        System.out.println("Nhập tùy chọn");
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Mời bạn nhập thông tin sản phẩm mới.");
                System.out.println("Id sản phẩm");
                product.setId(Integer.parseInt(sc.nextLine()));
                System.out.println("Tên sản phẩm: ");
                product.setName(sc.nextLine());
                System.out.println("Giá sản phẩm");
                product.setPrice(Integer.parseInt(sc.nextLine()));
                System.out.println("Số lượng sản phẩm");
                product.setQuantity(Integer.parseInt(sc.nextLine()));
                if (productController.addProduct(product)){
                    System.out.println("Thêm mới thành công");
                }
                System.out.println(displayListProduct(productController));
                break;
            case 2:
                try {
                    System.out.println("mời bạn nhập id sản phẩm cần sửa");
                    int idFound = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên mới cho sản phẩm");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá mới cho sản phẩm");
                    int newPrice = Integer.parseInt(sc.nextLine());
                    System.out.println("Cập nhật số lượng sản phầm");
                    int newQuantity = Integer.parseInt(sc.nextLine());
                    Product newProduct = new Product(idFound, newName, newPrice, newQuantity);
                    if (productController.editProduct(newProduct)){
                        System.out.println("Sửa thành công");
                        System.out.println(displayListProduct(productController));
                    }else {
                        System.out.println("Sửa thất bại");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Invalid value");
                }finally {
                    break;
                }
            case 3:
                try{
                    System.out.println("Nhập id sản phẩm muốn xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    if(productController.removeProduct(id)){
                        System.out.println("Xóa sản phẩm thành công");
                    }
                    displayProduct(displayProduct);
                }catch (InputMismatchException e){
                    System.out.println("Invalid value");
                } finally {
                    break;
                }
            case 4:
                System.out.println("Danh sách sản phẩm: ");
                System.out.println(displayListProduct(productController));
                break;
            case 5:
                sc.nextLine();
                System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
                String name = sc.nextLine();
                displayProduct = productController.findAllProducts(name);
                displayProduct(displayProduct);
                break;
            case 6:
                System.out.println("Tăng dần theo giá sản phẩm: ");
                displayProduct = productController.sortProductsIncre();

                displayProduct(displayProduct);
                System.out.println("Giảm dần theo giá");
                displayProduct = productController.sortProductsDescre();
                displayProduct(displayProduct);
                break;
        }
    }
    public static List<Product> displayListProduct(ProductController productController){
        List<Product> displayProduct = productController.getProducts();
        displayProduct(displayProduct);
        return displayProduct;
    }
    public static void displayProduct(List<Product> product){
        for (Product productList: product ){
            System.out.println(productList.toString());
        }
    }
    }

