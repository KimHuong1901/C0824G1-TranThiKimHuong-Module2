package ss17.bai_tap.view;

import ss17.bai_tap.controller.ProductController;
import ss17.bai_tap.entity.Product;
import ss17.bai_tap.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductView {
        public static void main(String[] args) {
            ProductView products1 = new ProductView();
            List<Product> products = new ArrayList<>();
            String file = "src/ss17/bai_tap/Product.csv";
            Scanner scanner = new Scanner(System.in);
            ProductController productController = new ProductController();
            ProductRepository productRepository = new ProductRepository();
            productController.getProduct(file);
            int choose;
            do {
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiển thị tất cả sản phẩm");
                System.out.println("3. Tìm kiếm sản phẩm theo mã");
                System.out.println("4. Thoát");
                System.out.print("Chọn chức năng: ");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.print("Nhập mã sản phẩm: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập tên sản phẩm: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập giá: ");
                        int price = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập hãng sản xuất: ");
                        String manufacturer = scanner.nextLine();
                        System.out.print("Nhập mô tả: ");
                        String description = scanner.nextLine();
                        Product product = new Product(id, name, price, manufacturer, description);
                            if (productController.addProduct(product, file)){
                                System.out.println("Thêm thành công ");
                            } else {
                                System.out.println("Thêm thất bại, id đã tồn tại không thể thêm.");
                            }
                        break;
                    case 2:
                        productController.getProduct(file);
                        products = productController.displayProduct();
                        System.out.println(products);
                        break;

                    case 3:
                        System.out.print("Nhập mã sản phẩm để tìm kiếm: ");
                        int searchId = Integer.parseInt(scanner.nextLine());
                        Product findProduct = productController.findProductById(file, searchId);
                        if (findProduct != null) {
                            System.out.println(findProduct);
                        } else {
                            System.out.println("Không tìm thấy sản phẩm với id " + searchId);
                        }
                        break;
                    case 4:
                        System.out.println("Thoát chương trình.");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                        break;
                }
            } while (choose != 4);

            scanner.close();
        }

}
