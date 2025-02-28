package case_study.view;

import case_study.controller.WareHouseController;
import case_study.entity.Product;
import case_study.repository.ProductRepository;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WarehouseView {
    public static void main(String[] args) {
        WarehouseView product = new WarehouseView();
        List<Product> products = new ArrayList<>();
        String file = "src/case_study/WarehouseDetail.csv";
        Scanner sc = new Scanner(System.in);
        WareHouseController productController = new WareHouseController();
        ProductRepository productRepository = new ProductRepository();
        productRepository.getProducts(file);
        int choose;
        int chooseToSort;
        try {
            do {
                System.out.println("------------ QUẢN LÝ KHO HÀNG ------------");
                System.out.println("1. Hiển thị thông tin sản phẩm hiện có trong kho.");
                System.out.println("2. Tìm kiếm sản phẩm.");
                System.out.println("3. Sửa đổi thông tin sản phẩm.");
                System.out.println("4. Thêm sản phẩm mới.");
                System.out.println("5. Xóa sản phẩm.");
                System.out.println("0. Thoát");
                System.out.println("Bạn hãy nhập lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Danh sách sản phẩm hiện có trong kho hàng: ");
                        System.out.println(productController.displayProduct());
                        System.out.println("1. Sắp xếp theo mã sản phẩm. ");
                        System.out.println("2. Sắp xếp theo tên sản phẩm.");
                        System.out.println("3. Sắp xếp theo giá. ");
                        System.out.println("4. Sắp xếp theo số lượng. ");
                        System.out.println("Other: Thoát. ");
                        System.out.println("Bạn hãy nhập lựa chọn: ");
                        chooseToSort = Integer.parseInt(sc.nextLine());
                        switch (chooseToSort){
                            case 1:
                                System.out.println("Dưới đây là danh sách sản phẩm được sắp xếp dựa theo mã sản phẩm: ");
                                System.out.println( productController.sortProductById());
                                break;
                            case 2:
                                System.out.println("Dưới đây là danh sách sản phẩm được sắp xếp dựa theo tên sản phẩm: ");
                                System.out.println(productController.sortProductByName());
                                break;
                            case 3:
                                System.out.println("Dưới đây là danh sách sản phẩm được sắp xếp dựa theo giá sản phẩm: ");
                                System.out.println(productController.sortProductByPrice());
                                break;
                            case 4:
                                System.out.println("Dưới đây là danh sách sản phẩm được sắp xếp dựa theo số lượng sản phẩm: ");
                                System.out.println(productController.sortProductByQuantity());
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Nhập mã sản phẩm bạn muốn tìm kiếm " );
                        String chooseToFind = sc.nextLine();
                        Product findProduct = productController.findProduct(file, chooseToFind);
                        if(findProduct != null){
                            System.out.println(findProduct);
                        } else {
                            System.out.println("Không tìm thấy sản phẩm với từ khóa " + "'" + chooseToFind + "'");
                        }

                        break;
                    case 3:
                        if(productController.updateInfoProduct(informationProduct())){
                            System.out.println("Sửa thông tin sản phẩm thành công");
                            System.out.println(productController.displayProduct());
                        }else {
                            System.out.println("Không tồn tại sản phẩm với mã bạn vừa nhập. Bạn có thể chọn chức năng thêm mới sản phẩm.");
                        }
                        break;
                    case 4:
                        if(productController.addProduct(file, informationProduct())){
                            System.out.println("Thêm mới thành công");
                            System.out.println(productController.displayProduct());
                        } else {
                            System.out.println("Thêm thất bại, mã sản phẩm đã tồn tại.");
                        }
                        break;
                    case 5:
                        System.out.println("Nhập mã sản phẩm muốn xóa: ");
                        String idToDelete = sc.nextLine();
                        if (productController.removeProduct(idToDelete)) {
                            System.out.println("Xóa sản phẩm thành công");
                        } else {
                            System.out.println("Xóa sản phẩm thất bại");
                        }
                        System.out.println(productController.displayProduct());
                        break;
                }
            }while (choose!= 0);
            sc.close();
        } catch (NumberFormatException e) {
            System.out.println("Giá trị nhập vào không hợp lệ");
        }
    }
//////////Chỉ chỉnh validate cho id,
    public static Product informationProduct(){
        private static Pattern pattern;
        private Matcher matcher;
        Product changedProduct = null;
        try {
            String idPattern = "^[A-Z]{2}\\d{4}$";  // Mã sản phẩm, ví dụ: AD0019
            String newName = "^[A-Za-z0-9\\s]+$";
            String newSupplier = "^[A-Za-z\\s]+$";
            Scanner sc = new Scanner(System.in);
            String idToFind = "";
            pattern = Pattern.compile(idPattern);
            while(true) {
               System.out.println("Nhập mã sản phẩm");
                idToFind = sc.nextLine();
                matcher = pattern.matcher(idToFind);
                if(matcher.matches()){
                break;
                } else {
                sout("Gía trị không hợp lệ, vui lòng nhập lại")
                }
            System.out.println("Nhập tên mới cho sản phẩm: ");
            String newName = sc.nextLine();
            System.out.println("Nhập giá mới cho sản phẩm: ");
            int newPrice = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng mới cho sản phẩm: ");
            int newQuantity = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập mô tả cho sản phẩm: ");
            String newDescreption = sc.nextLine();
            System.out.println("Sản phẩm thuộc phân loại nào: ");
            System.out.println("1. Dược Mỹ Phẩm");
            System.out.println("2. Hóa Mỹ Phẩm");
            String newCategory = "";
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    newCategory = "Dược Mỹ Phẩm";
                    break;
                case 2:
                    newCategory = "Hóa Mỹ Phẩm";
                    break;
            }
            System.out.println("Nhập tên nhà cung ứng: ");
            String newSupplier = sc.nextLine();
            changedProduct = new Product(idToFind, newName, newPrice, newQuantity, newDescreption, newCategory, newSupplier);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập vào không hợp lệ.");
        }
        return changedProduct;
    }
}
