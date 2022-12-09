package qlsanpham;

/**
 *
 * @author hasu
 */
public class Tivi extends SanPham {

    private int kichThuoc; // inch

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", kichThuoc = ").append(kichThuoc);
        return sb.toString();
    }

    @Override
    public void hoatDong() {
        System.out.println("Tivi hoat dong");
    }
}
