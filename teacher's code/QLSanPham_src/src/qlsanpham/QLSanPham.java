package qlsanpham;

/**
 *
 * @author hasu
 */
public class QLSanPham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SanPham sp0 = new Tivi();
        sp0.setTenSP("Tivi");
        sp0.output();
        sp0.hoatDong();

        SanPham sp1 = new TuLanh();
        sp1.setTenSP("TU lanh");
        sp1.output();
        sp1.hoatDong();

        SanPham sp2 = new MayGiat();
        sp2.setTenSP("May Giat");
        sp2.output();
        sp2.hoatDong();

    }

}
