package module2.entity;

public class BenhNhanThuong extends BenhAn {

    private double phiNamVien;

    public BenhNhanThuong(String ma, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(ma, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("stt " + stt + ", ma: " + ma + ", name: " + tenBenhNhan + ", date: " + ngayNhapVien + ", out: " + ngayRaVien + ", lyDoNhapVien: " + lyDoNhapVien + ", phi: " + phiNamVien);

    }
}

