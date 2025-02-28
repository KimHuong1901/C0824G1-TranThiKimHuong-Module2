package module2.view;

import module2.entity.BenhNhanThuong;
import module2.repository.BenhAnRepoSitory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BenhAnView {
	private BenhAnRepoSitory repository;
    public BenhAnView(BenhAnRepoSitory repository) {
        this.repository = repository;
    }

    public void themBenhAn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bệnh án: ");
        String ma = scanner.nextLine();
        System.out.print("Nhập tên bệnh nhân: ");
        String tenBenhNhan = scanner.nextLine();
        System.out.print("Nhập ngày nhập viện: ");
        String ngayNhapVien = scanner.nextLine();
        System.out.print("Nhập ngày ra viện: ");
        String ngayRaVien = scanner.nextLine();
        System.out.print("Nhập lý do nhập viện: ");
        String lyDoNhapVien = scanner.nextLine();

        System.out.print("Nhập loại bệnh án (1: Thường, 2: VIP): ");
        int loai = scanner.nextInt();
        scanner.nextLine();

        try {
        	if (loai == 1) {
				double phiNamVien;
		        while (true) {
		            System.out.print("Nhập phí nằm viện: ");
		            try {
		                phiNamVien = scanner.nextDouble();
		                scanner.nextLine();
		                if (phiNamVien < 0) {
		                    System.out.println("Phí nằm viện  âm. Vui lòng nhập lại.");
		                } else {
		                    break;
		                }
		            } catch (InputMismatchException e) {
		                System.out.println("nhập số hợp lệ");
		                scanner.nextLine();
		            }
		        }
				BenhNhanThuong benhAnThuong = new BenhNhanThuong(ma, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
				repository.themBenhAn(benhAnThuong);
        	} else if (loai == 2) {
//				System.out.print("Nhập loại VIP (v1, v2, v3): ");
//				String loaiVIP = scanner.nextLine();
//				BenhAnVIP benhAnVIP = new BenhAnVIP(ma, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVIP);
//				repository.themBenhAn(benhAnVIP);
		}

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void xoaBenhAn() {
        System.out.print("Nhập mã bệnh án cần xóa: ");
        Scanner scanner = new Scanner(System.in);
        String ma = scanner.nextLine();
        System.out.print("Bạn có chắc chắn muốn xóa bệnh án này? (yes/no): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            repository.xoaBenhAn(ma);
            System.out.println("Đã xóa bệnh án với mã: " + ma);
        } else {
            System.out.println("Không xóa bệnh án.");
        }
    }

    public void xemBenhAn() {
//        repository.();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm bệnh án");
            System.out.println("2. Xóa bệnh án");
            System.out.println("3. Xem bệnh án");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int chucNang = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (chucNang) {
                case 1:
                    themBenhAn();
                    break;
                case 2:
                    xoaBenhAn();
                    break;
                case 3:
                    xemBenhAn();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        }
    }

    public static void main(String[] args) {
        BenhAnRepoSitory repository = new BenhAnRepoSitory();
        BenhAnView view = new BenhAnView(repository);
        view.menu();
    }
}

