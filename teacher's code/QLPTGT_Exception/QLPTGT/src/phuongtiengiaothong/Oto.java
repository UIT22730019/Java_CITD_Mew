package phuongtiengiaothong;

import java.time.Year;

/**
 *
 * @author hasu
 */
public class Oto extends PhuongTienGiaoThong {

    public static final String ID_FORMAT = "Cxxxxx";
    public static final String ID_REGEX = "(?i)C\\d{5}";

    private int soChoNgoi;
    private String kieuDongCo;

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public final void setSoChoNgoi(int soChoNgoi) {
        if (soChoNgoi > 0) { // ???? oto co 1 cho ngoi?
            this.soChoNgoi = soChoNgoi;
        }
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public final void setKieuDongCo(String kieuDongCo) {
        if (kieuDongCo != null) {
            this.kieuDongCo = kieuDongCo;
        } else {
            this.kieuDongCo = "";
        }
    }

    public Oto() {
    }

    public Oto(
            String id,
            String hangSanXuat,
            Year namSanXuat,
            double giaBan,
            String mauXe,
            int soChoNgoi,
            String kieuDongCo) throws PTGTException {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.setSoChoNgoi(soChoNgoi);
        this.setKieuDongCo(kieuDongCo);
    }

    @Override
    public int setAttributes(String[] attributes) throws PTGTException {
        int idx = super.setAttributes(attributes);
        try {
            this.setSoChoNgoi(Integer.parseInt(attributes[idx++].trim()));
            this.setKieuDongCo(attributes[idx++].trim());
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return idx;
    }

    @Override
    public void input() {
        try {
            System.out.println("Input Oto:");
            super.input();
            this.setSoChoNgoi(Util.inputInteger("Nhap so cho ngoi", 1, 50, false));
            this.setKieuDongCo(Util.inputString("Nhap kieu dong co", false));
        } catch (PTGTException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", ").append(soChoNgoi);
        sb.append(", ").append(kieuDongCo);
        return sb.toString();
    }

    @Override
    protected boolean validateId(String id) throws PTGTException {
        if (id == null || id.isBlank()) {
            throw new PTGTException("Error: id is null or empty");
        }
        if (!id.matches(Oto.ID_REGEX)) {
            throw new PTGTException("Error: " + id + " is not match format: " + Oto.ID_FORMAT);
        }
        return true;
    }

    @Override
    protected String getIdFormat() {
        return Oto.ID_FORMAT;
    }

}
