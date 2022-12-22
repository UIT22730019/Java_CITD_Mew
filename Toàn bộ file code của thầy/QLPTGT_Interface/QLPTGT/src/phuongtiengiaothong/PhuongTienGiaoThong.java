package phuongtiengiaothong;

import java.time.Year;
import java.time.format.DateTimeParseException;

/**
 *
 * @author hasu
 */
public abstract class PhuongTienGiaoThong {

    private String id;
    private String hangSanXuat;
    private Year namSanXuat;
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

    public Year getNamSanXuat() {
        return namSanXuat;
    }

    public final void setNamSanXuat(Year namSanXuat) {
        if (namSanXuat != null && !namSanXuat.isAfter(Year.now())) {
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
        this.namSanXuat = Year.now();
        this.giaBan = 0;
        this.mauXe = "";
    }

    public PhuongTienGiaoThong(
            String id,
            String hangSanXuat,
            Year namSanXuat,
            double giaBan,
            String mauXe) {
        this.setId(id);
        this.setHangSanXuat(hangSanXuat);
        this.setNamSanXuat(namSanXuat);
        this.setGiaBan(giaBan);
        this.setMauXe(mauXe);
    }

    public int setAttributes(String[] attributes) {
        int idx = 0;
        try {
            this.setId(attributes[idx++].trim());
            this.setHangSanXuat(attributes[idx++].trim());
            this.setNamSanXuat(Year.parse(attributes[idx++].trim()));
            this.setGiaBan(Double.parseDouble(attributes[idx++].trim()));
            this.setMauXe(attributes[idx++].trim());
        } catch (DateTimeParseException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return idx;
    }

    public void input() {
        do {
            this.setId(Util.inputString("Nhap id (" + this.getIdFormat() + ")", false));
        } while (this.id.isBlank());
        this.setHangSanXuat(Util.inputString("Nhap hang san xuat", false));
        this.setNamSanXuat(Util.inputYear("Nhap nam san xuat", Year.of(1900), Year.now(), false));
        this.setGiaBan(Util.inputDouble("Nhap gia ban", 0));
        this.setMauXe(Util.inputString("Nhap mau xe", false));
    }

    public void inputUpdate() {
        String hangSanXuat = Util.inputString("Nhap hang san xuat", true);
        if (!hangSanXuat.isBlank()) {
            this.setHangSanXuat(hangSanXuat);
        }
        // them code ...
        Year namSX = Util.inputYear("Nhap nam san xuat", Year.of(1900), Year.now(), true);
        if (namSX != null) {
            this.setNamSanXuat(namSX);
        }
//        this.setGiaBan(Util.inputDouble("Nhap gia ban", 0));

        String mauXe = Util.inputString("Nhap mau xe", true);
        if (!mauXe.isBlank()) {
            this.setMauXe(mauXe);
        }
    }

    public void output() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {");
        sb.append(toString());
        sb.append('}');
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(", ").append(hangSanXuat);
        sb.append(", ").append(namSanXuat);
        sb.append(", ").append(giaBan);
        sb.append(", ").append(mauXe);
        return sb.toString();
    }

    protected abstract boolean validateId(String id);

    protected abstract String getIdFormat();
}
