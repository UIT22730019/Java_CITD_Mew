package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author hasu
 */
public class NhanVienQL extends NhanVienCC {

    public static final String ID_FORMAT = "QLxxxxx";
    public static final String ID_REGEX = "QL\\d{5}";

    private float phuCapCV;

    public float getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(float phuCapCV) {
        if (phuCapCV >= 0.0F) {
            this.phuCapCV = phuCapCV;
        }
    }

    public NhanVienQL() {
    }

    public NhanVienQL(
            String maVN,
            String tenVN,
            Date namSinh,
            String trinhDo,
            float luongCB,
            String truongDT,
            String chuyenMon,
            float phuCapCV) {
        super(maVN, tenVN, namSinh, trinhDo, luongCB, truongDT, chuyenMon);
        this.phuCapCV = phuCapCV;
    }

    @Override
    public void input() {
        super.input();
        this.setPhuCapCV(Util.inputFloat("Nhap phu cap chuc vu", 0.0F));
    }

    @Override
    protected float tinhLuong() {
        return this.getLuongCB() + this.phuCapCV;
    }

    @Override
    protected boolean validateId(String id) {
        return id != null && id.matches(NhanVienQL.ID_REGEX);
    }

    @Override
    protected String getIdFormat() {
        return NhanVienQL.ID_FORMAT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienQL {");
        sb.append(super.toString());
        sb.append(", phuCapCV=");
        sb.append(phuCapCV);
        sb.append(", luong=");
        sb.append(String.format("%.2f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }

}
