package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author hasu
 */
public abstract class NhanVienCC extends NhanVien {

    private String truongDT;
    private String chuyenMon;

    public String getTruongDT() {
        return truongDT;
    }

    public final void setTruongDT(String truongDT) {
        if (truongDT != null && !truongDT.isBlank()) {
            this.truongDT = truongDT;
        }
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public final void setChuyenMon(String chuyenMon) {
        if (chuyenMon != null && !chuyenMon.isBlank()) {
            this.chuyenMon = chuyenMon;
        }
    }

    public NhanVienCC() {
    }

    public NhanVienCC(
            String maVN,
            String tenVN,
            Date namSinh,
            String trinhDo,
            float luongCB,
            String truongDT,
            String chuyenMon) {
        super(maVN, tenVN, namSinh, trinhDo, luongCB);
        this.setTruongDT(truongDT);
        this.setChuyenMon(chuyenMon);
    }

}
