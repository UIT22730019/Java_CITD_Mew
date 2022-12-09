package qlsanpham;

/**
 *
 * @author hasu
 */
public class MayLanh extends SanPham {

    private float congSuat;

    public float getCongSuat() {
        return congSuat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", congSuat = ").append(congSuat);
        return sb.toString();
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void hoatDong() {
        System.out.println("May lanh hoat dong");
    }
}
