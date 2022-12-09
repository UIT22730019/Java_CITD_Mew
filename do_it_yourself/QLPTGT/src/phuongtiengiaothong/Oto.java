package phuongtiengiaothong;

/**
 *
 * @author hasu
 */
public class Oto extends PhuongTienGiaoThong {

    public static final String ID_FORMAT = "Oxxxxx";
    public static final String ID_REGEX = "(?i)O\\d{5}";

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
            int namSanXuat,
            double giaBan,
            String mauXe,
            int soChoNgoi,
            String kieuDongCo) {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.setSoChoNgoi(soChoNgoi);
        this.setKieuDongCo(kieuDongCo);
    }

    @Override
    public void input() {
        System.out.println("Input Oto:");
        super.input();
        this.setSoChoNgoi(Util.inputInteger("Nhap so cho ngoi", 1, 50));
        this.setKieuDongCo(Util.inputString("Nhap kieu dong co", false));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Oto {");
        sb.append(super.toString());
        sb.append(", soChoNgoi=").append(soChoNgoi);
        sb.append(", kieuDongCo=").append(kieuDongCo);
        sb.append(" }");
        return sb.toString();
    }

    @Override
    protected boolean validateId(String id) {
        return id != null && id.matches(Oto.ID_REGEX);
    }

    @Override
    protected String getIdFormat() {
        return Oto.ID_FORMAT;
    }

}
