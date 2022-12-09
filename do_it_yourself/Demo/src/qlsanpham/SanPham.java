package qlsanpham;

/**
 *
 * @author hasu
 */
public abstract class SanPham {
    private static String NAME_FORMAT = "[a..zA..Z]{2}[\\d]{5}";
    
    private String tenSP;
    private float donGia;
    private float giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public final void setTenSP(String tenSP) {
        if (validateTenSP(tenSP)) {
            this.tenSP = tenSP;
        } else {
            System.out.println("Err: ten SP = " + tenSP + " khong hop le");
        }
    }

    public float getDonGia() {
        return donGia;
    }

    public final void setDonGia(float donGia) {
        if (donGia >= 0.0F) {
            this.donGia = donGia;
        } else {
            System.out.println("Error: gia SP = " + String.format("%.2f", donGia) + " khong hop le");
        }
    }

    public float getGiamGia() {
        return giamGia;
    }

    public final void setGiamGia(float giamGia) {
        if (giamGia >= 0.0F) {
            this.giamGia = giamGia;
        } else {
            System.out.println("Error: giam gia = " + String.format("%.2f", giamGia) + " khong hop le");
        }
    }

    public SanPham() {
        this.tenSP = "";
        this.donGia = 0.0F;
        this.giamGia = 0.0F;
    }

    public SanPham(String tenSP, float donGia) {
        this(tenSP, donGia, 0.0F);
    }

    public SanPham(String tenSP, float gia, float giamGia) {
        setTenSP(tenSP);
        setDonGia(gia);
        setGiamGia(giamGia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tenSP = ").append(tenSP);
        sb.append(", gia ban = ").append(String.format("%.2f", donGia - giamGia + tinhThue()));
        return sb.toString();
    }

    public void input() {
        this.tenSP = inputTenSP();
        this.donGia = Util.inputFloat("Nhap don gia SP", 0.0F, 999999999.0F);
        this.giamGia = Util.inputFloat("Nhap giam gia SP", 0.0F, 1000000.0F);
    }

    public void output() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {");
        sb.append(toString());
        sb.append('}');
        System.out.println(sb);
    }

    private float tinhThue() {
        return (donGia - giamGia) * 0.1F;
    }

    private String inputTenSP() {
        String tenSP = null;
        do {
            tenSP = Util.inputString("Nhap ten SP")
                    .replaceAll("\\s+", " ")
                    .trim();
        } while (!validateTenSP(tenSP));
        return tenSP;
    }

    private boolean validateTenSP(String tenSP) {
        // khong chua ky tu dac biet, khong de trong
        // toi da 100 ky tu
        // toi thieu 3 ky tu
        if (tenSP != null) {
            return 3 <= tenSP.length()
                    && tenSP.length() <= 100
                    && tenSP.matches("[\\w].*");
        }
        return false;
    }

    public abstract void hoatDong();

}
