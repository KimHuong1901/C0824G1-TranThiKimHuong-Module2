package module2.repository;

import module2.entity.BenhAn;
import module2.entity.BenhNhanThuong;

import java.util.ArrayList;
import java.util.List;

public class BenhAnRepoSitory {
    	private static List<BenhAn> danhSachBenhAn = new ArrayList<>();


	static {
		danhSachBenhAn.add(new BenhNhanThuong("1", " nguyen A", "11/11/2020", "11/12/2020", "om", 1000));
		danhSachBenhAn.add(new BenhNhanThuong("2", " nguyen A", "11/11/2020", "11/12/2020", "om", 2000));
		danhSachBenhAn.add(new BenhNhanThuong("3", " nguyen A", "11/11/2020", "11/12/2020", "om", 3000));
		danhSachBenhAn.add(new BenhNhanThuong("4", " nguyen A", "11/11/2020", "11/12/2020", "om", 4000));
		danhSachBenhAn.add(new BenhNhanThuong("5", " nguyen A", "11/11/2020", "11/12/2020", "om", 5000));
		danhSachBenhAn.add(new BenhNhanThuong("6", " nguyen A", "11/11/2020", "11/12/2020", "om", 6000));
		danhSachBenhAn.add(new BenhNhanThuong("7", " nguyen A", "11/11/2020", "11/12/2020", "om", 7000));
		danhSachBenhAn.add(new BenhNhanThuong("8", "nguyen A", "11/11/2020", "11/12/2020", "om", 5000));
	}


	public void themBenhAn(BenhAn benhAn) throws Exception {
        for (BenhAn existingBenhAn : danhSachBenhAn) {
            if (existingBenhAn.getMa().equals(benhAn.getMa())) {
                throw new Exception("ma beng an da ton tai: " + benhAn.getMa());
            }
        }
        danhSachBenhAn.add(benhAn);

	}


	public void xoaBenhAn(String ma) {
	    for (int i = 0; i < danhSachBenhAn.size(); i++) {
	        BenhAn benhAn = danhSachBenhAn.get(i);
	        if (benhAn.getMa().equals(ma)) {
	            danhSachBenhAn.remove(i);
	            System.out.println("da xoa benh an ma: " + ma);
	            return;
	        }
	    }
	    System.out.println("khong tim thay beng an ma: " + ma);

	}

	public BenhAn layBenhAn(String ma) {
        for (BenhAn benhAn : danhSachBenhAn) {
            if (benhAn.getMa().equals(ma)) {
                return benhAn;
            }
        }
        return null;
	}


	public void hienThiTatCaBenhAn() {
		for (BenhAn benhAn : danhSachBenhAn) {
            benhAn.hienThiThongTin();
        }

	}
}
