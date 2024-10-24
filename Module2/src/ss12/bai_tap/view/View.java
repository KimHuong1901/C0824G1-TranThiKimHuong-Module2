package ss12.bai_tap.view;

import ss12.bai_tap.controller.ProductController;
import ss12.bai_tap.entity.Product;

import java.util.*;

public class View {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hệ thống quản lý sản phẩm");
        System.out.println("1. Thêm sản phẩm: ");
        System.out.println("2. Sửa thông tin sản phẩm: ");
        System.out.println("3. Xóa sản phẩm: ");
        System.out.println("4. Hiển thị danh sách sản phẩm: ");
        System.out.println("5. Tìm kiếm sản phẩm: ");
        System.out.println("6. Sắp xếp sản phẩm: ");
        System.out.println("Nhập tùy chọn");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Mời bạn nhập thông tin sản phẩm mới.");
                System.out.println("Id sản phẩm");
                product.setId(sc.nextInt());
                System.out.println("Tên sản phẩm: ");
                sc.nextLine();
                product.setName(sc.nextLine());
                System.out.println("Giá sản phẩm");
                product.setPrice(Integer.parseInt(sc.nextLine()));
                System.out.println("Số lượng sản phẩm");
                product.setQuantity(Integer.parseInt(sc.nextLine()));
                ProductController addNewProduct = new ProductController();
                if (addNewProduct.addProduct(product)){
                    System.out.println("Thêm mới thành công");
                }
                ArrayList<Product> displayProduct = new ArrayList<>();
                displayProduct = addNewProduct.getProducts();
                for(Product productList: displayProduct ){
                    System.out.println(productList.toString());
                }
                break;
            case 2:
                System.out.println("mời bạn nhập id sản phẩm cần sửa");
                int idFound = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhập tên mới cho sản phẩm");
                String newName = sc.nextLine();
                System.out.println("Nhập giá mới cho sản phẩm");
                int newPrice = sc.nextInt();
                System.out.println("Cập nhật số lượng sản phầm");
                int newQuantity = sc.nextInt();
                ProductController editProduct = new ProductController();
                Product xProduct = new Product(idFound, newName, newPrice, newQuantity);
                if (editProduct.editProduct(xProduct)){
                    System.out.println("Sửa thành công");
                    editProduct.getProducts();
                    ProductController productController = new ProductController();
                    ArrayList<Product> products = productController.getProducts();
                    for (Product nProduct: products) {
                        System.out.println(nProduct.toString());
                    }
                }else {
                    System.out.println("Sửa thất bại");
                }
                break;
            case 3:
                System.out.println("Nhập id sản phẩm muốn xóa: ");
                int id = sc.nextInt();
                ProductController removeProduct = new ProductController();
                if(removeProduct.removeProduct(id)){
                    System.out.println("Xóa sản phẩm thành công");
                }
                ArrayList<Product> product5 = removeProduct.getProducts();
                for (Product nProduct: product5) {
                    System.out.println(nProduct.toString());
                }
                break;
            case 4:
                System.out.println("Danh sách sản phẩm: ");
                ProductController productController = new ProductController();
                ArrayList<Product> products = productController.getProducts();
                    for (Product product1: products) {
                        System.out.println(product1.toString());
                    }
                break;
            case 5:
                System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm: ");
                String name = sc.nextLine();
                ProductController findProduct = new ProductController();
                ArrayList<Product> foundProduct = findProduct.findAllProducts(name);
                for (Product product1: foundProduct){
                    System.out.println(product1.toString());
                }
                break;
            case 6:
                System.out.println("Tăng dần theo giá sản phẩm: ");
                ArrayList<Product> newProductList = new ArrayList<>();
                ProductController newProductController = new ProductController();
                newProductList = newProductController.getProducts();
                Collections.sort(newProductList, new Comparator<Product>() {
                    @Override
                    public int compare(Product product1, Product product2) {
                        return product1.getPrice() > product2.getPrice() ? 1 : -1;
                    }
                });
                for (Product product1 : newProductList) {
                    System.out.println(product1.toString());
                }
                System.out.println("Giảm dần theo giá");
                Collections.sort(newProductList, new Comparator<Product>() {
                    @Override
                    public int compare(Product product1, Product product2) {
                        return product1.getPrice() < product2.getPrice() ? 1 : -1;
                    }
                });
                for(Product product1 : newProductList) {
                    System.out.println(product1.toString());
                }
                break;
        }
    }
}
