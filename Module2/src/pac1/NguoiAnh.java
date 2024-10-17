package pac1;

public class NguoiAnh extends Human implements NguoiLapTrinh, NguoiLamDuLich, BanMang {
    @Override
    public void tiengNoi() {
        System.out.println("tieng anh");
    }

    @Override
    public void laptrinh() {

    }

    @Override
    public void dulich() {

    }

    @Override
    public void banMang() {

    }

    @Override
    public int ban1mang() {
        return 0;
    }
}
