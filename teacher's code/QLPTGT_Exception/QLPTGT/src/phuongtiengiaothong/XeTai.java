package phuongtiengiaothong;

import java.time.Year;

/**
 *
 * @author hasu
 */
public class XeTai extends PhuongTienGiaoThong {

    public static final String ID_FORMAT = "Txxxxx";
    public static final String ID_REGEX = "(?i)T\\d{5}";

    private float trongTai;

    public float getTrongTai() {
        return trongTai;
    }

    public final void setTrongTai(float trongTai) throws PTGTException {
        if (trongTai < 0) {
            throw new PTGTException("Error: " + trongTai + " < 0");
        }
        this.trongTai = trongTai;
    }

    public XeTai() {
    }

    public XeTai(
            String id,
            String hangSanXuat,
            Year namSanXuat,
            double giaBan,
            String mauXe,
            float trongTai) throws PTGTException {
        super(id, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.setTrongTai(trongTai);
    }

    @Override
    public int setAttributes(String[] attributes) throws PTGTException {
        int idx = super.setAttributes(attributes);
        try {
            this.setTrongTai(Float.parseFloat(attributes[idx++].trim()));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        return idx;
    }

    @Override
    public void input() throws PTGTException {
        System.out.println("Inupt Xe tai");
        super.input();
        this.setTrongTai(Util.inputFloat("Nhap trong tai", 1.0F));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", ").append(trongTai);
        return sb.toString();
    }

    @Override
    protected boolean validateId(String id) throws PTGTException {
        if (id == null || id.isBlank()) {
            throw new PTGTException("Error: id is null or empty");
        }
        if (!id.matches(XeTai.ID_REGEX)) {
            throw new PTGTException("Error: " + id + " is not match format: " + Oto.ID_FORMAT);
        }
        return true;
    }

    @Override
    protected String getIdFormat() {
        return XeTai.ID_FORMAT;
    }
}
