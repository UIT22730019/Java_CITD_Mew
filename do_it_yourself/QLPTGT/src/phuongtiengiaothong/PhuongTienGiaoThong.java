package phuongtiengiaothong;

/**
 *
 * @author hasu
 */
public abstract class PhuongTienGiaoThong {

    private String id;
    private String hangSanXuat;
    private int namSanXuat;
    private double giaBan;
    private String mauXe;

    public String getId() {
        return id;
    }

    public final void setId(String id) {
        if (this.validateId(id)) {
            this.id = id;
        } else {
            this.id = "";
        }
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public final void setHangSanXuat(String hangSanXuat) {
        if (hangSanXuat != null) {
            this.hangSanXuat = hangSanXuat;
        } else {
            this.hangSanXuat = "";
        }
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public final void setNamSanXuat(int namSanXuat) {
        if (namSanXuat > 0) { // ???????
            this.namSanXuat = namSanXuat;
        }
    }

    public double getGiaBan() {
        return giaBan;
    }

    public final void setGiaBan(double giaBan) {
        if (giaBan >= 0) {
            this.giaBan = giaBan;
        }
    }

    public String getMauXe() {
        return mauXe;
    }

    public final void setMauXe(String mauXe) {
        if (mauXe != null) {
            this.mauXe = mauXe;
        } else {
            this.mauXe = "";
        }
    }

    public PhuongTienGiaoThong() {
        this.id = "";
        this.hangSanXuat = "";
        this.namSanXuat = 0;
        this.giaBan = 0;
        this.mauXe = "";
    }

    public PhuongTienGiaoThong(String id, String hangSanXuat, int namSanXuat, double giaBan, String mauXe) {
        this.setId(id);
        this.setHangSanXuat(hangSanXuat);
        this.setNamSanXuat(namSanXuat);
        this.setGiaBan(giaBan);
        this.setMauXe(mauXe);
    }

    public void input() {
        do {
            this.setId(Util.inputString("Nhap id (" + this.getIdFormat() + ")", false));
        } while (this.id.isBlank());
        this.setHangSanXuat(Util.inputString("Nhap hang san xuat", false));
        this.setNamSanXuat(Util.inputInteger("Nhap nam san xuat", 1000, 10000000));
        this.setGiaBan(Util.inputDouble("Nhap gia ban", 0));
        this.setMauXe(Util.inputString("Nhap mau xe", false));
    }

    public void inputUpdate() {
        String hangSanXuat = Util.inputString("Nhap hang san xuat", true);
        if (!hangSanXuat.isBlank()) {
            this.setHangSanXuat(hangSanXuat);
        }
        // them code ...
//        this.setNamSanXuat(Util.inputInteger("Nhap nam san xuat", 1000, 10000000));
//        this.setGiaBan(Util.inputDouble("Nhap gia ban", 0));
        
        String mauXe = Util.inputString("Nhap mau xe", true);
        if (!mauXe.isBlank()) {
            this.setMauXe(mauXe);
        }
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(", hangSanXuat=").append(hangSanXuat);
        sb.append(", namSanXuat=").append(namSanXuat);
        sb.append(", giaBan=").append(giaBan);
        sb.append(", mauXe=").append(mauXe);
        return sb.toString();
    }

    protected abstract boolean validateId(String id);

    protected abstract String getIdFormat();
}
