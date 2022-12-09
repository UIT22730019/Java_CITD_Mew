package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author hasu
 */
public class NhanVienPV extends NhanVien {

    public static final String ID_FORMAT = "PVxxxxx";
    public static final String ID_REGEX = "PV\\d{5}";

    public NhanVienPV() {
    }

    public NhanVienPV(
            String maVN, 
            String tenVN, 
            Date namSinh, 
            String trinhDo,
            float luongCB) {
        super(maVN, tenVN, namSinh, trinhDo, luongCB);
    }

    @Override
    protected float tinhLuong() {
        return this.getLuongCB();
    }

    @Override
    protected boolean validateId(String id) {
       return id != null && id.matches(NhanVienPV.ID_REGEX);
    }

    @Override
    protected String getIdFormat() {
        return NhanVienPV.ID_FORMAT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienPV {");
        sb.append(super.toString());
        sb.append(", luong=");
        sb.append(String.format("%.2f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }

}
