package qlsanpham;

/**
 *
 * @author hasu
 */
public class TuLanh extends SanPham {

    private int theTich;

    public int getTheTich() {
        return theTich;
    }

    public void setTheTich(int theTich) {
        this.theTich = theTich;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", theTich = ").append(theTich);
        return sb.toString();
    }

    @Override
    public void hoatDong() {
        System.out.println("Tu lanh hoat dong");
    }
}
