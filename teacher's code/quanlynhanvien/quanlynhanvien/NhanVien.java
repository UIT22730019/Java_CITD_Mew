package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author hasu
 */
public abstract class NhanVien {

    private String maVN;
    private String tenVN;
    private Date namSinh;
    private String trinhDo;
    private float luongCB;

    public String getMaVN() {
        return maVN;
    }

    public final void setMaVN(String maVN) {
        if (validateId(maVN)) {
            this.maVN = maVN;
        }
    }

    public String getTenVN() {
        return tenVN;
    }

    public final void setTenVN(String tenVN) {
        if (tenVN != null && !tenVN.isBlank()) {
            this.tenVN = tenVN;
        }
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public final void setNamSinh(Date namSinh) {
        if (!namSinh.after(new Date())) { // nam sinh qua lau trong qua khu ?????
            this.namSinh = namSinh;
        }
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public final void setTrinhDo(String trinhDo) {
        if (trinhDo != null && !trinhDo.isBlank()) {
            this.trinhDo = trinhDo;
        }
    }

    public float getLuongCB() {
        return luongCB;
    }

    public final void setLuongCB(float luongCB) {
        if (luongCB >= 0.0F) {
            this.luongCB = luongCB;
        }
    }

    public NhanVien() {
    }

    public NhanVien(
            String maVN, 
            String tenVN, 
            Date namSinh, 
            String trinhDo, 
            float luongCB) {
        this.setMaVN(maVN);
        this.setTenVN(tenVN);
        this.setNamSinh(namSinh);
        this.setTrinhDo(trinhDo);
        this.setLuongCB(luongCB);
    }

    public void input() {
        do {
            this.setMaVN(Util.inputString("Nhap ma NV (" + getIdFormat() + ")"));
        } while (this.maVN == null);
        this.setTenVN(Util.inputString("Nhap ten NV"));
        this.setNamSinh(Util.inputDate("Nhap ngay thang nam sinh NV"));
        this.setTrinhDo(Util.inputString("Nhap trinh do NV"));
        this.setLuongCB(Util.inputFloat("Nhap luong co ban NV", 0.0F));
    }

    public void output() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("maVN=");
        sb.append(maVN);
        sb.append(", tenVN=");
        sb.append(tenVN);
        sb.append(", namSinh=");
        sb.append(Util.toString(namSinh));
        sb.append(", trinhDo=");
        sb.append(trinhDo);
        return sb.toString();
    }

    protected abstract float tinhLuong();

    protected abstract boolean validateId(String id);

    protected abstract String getIdFormat();

}
