package qlsanpham;

/**
 *
 * @author hasu
 */
public class MayGiat extends SanPham {

    private int soKy;

    public int getSoKy() {
        return soKy;
    }

    public void setSoKy(int soKy) {
        this.soKy = soKy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", soKy = ").append(soKy);
        return sb.toString();
    }

    @Override
    public void hoatDong() {
        System.out.println("May giat hoat dong");
    }
}
