package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author hasu
 */
public class NhanVienNC extends NhanVienCC {

    public static final String ID_FORMAT = "NCxxxxx";
    public static final String ID_REGEX = "NC\\d{5}";

    private float phuCapDH;

    public float getPhuCapDH() {
        return phuCapDH;
    }

    public final void setPhuCapDH(float phuCapDH) {
        if (phuCapDH >= 0.0F) {
            this.phuCapDH = phuCapDH;
        }
    }

    public NhanVienNC() {
    }

    public NhanVienNC(
            String maVN,
            String tenVN,
            Date namSinh,
            String trinhDo,
            float luongCB,
            String truongDT,
            String chuyenMon,
            float phuCapDH) {
        super(  maVN, 
                tenVN, 
                namSinh, 
                trinhDo, 
                luongCB, 
                truongDT, 
                chuyenMon);
        this.setPhuCapDH(phuCapDH);
    }

    @Override
    protected float tinhLuong() {
        return this.getLuongCB() + this.phuCapDH;
    }

    @Override
    protected boolean validateId(String id) {
        return id != null && id.matches(NhanVienNC.ID_REGEX);
    }

    @Override
    protected String getIdFormat() {
        return NhanVienNC.ID_FORMAT;
    }
}
