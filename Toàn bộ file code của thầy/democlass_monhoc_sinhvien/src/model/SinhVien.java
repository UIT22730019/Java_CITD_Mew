package model;

import java.util.Scanner;

public class SinhVien {

    private static final String ID_FORMAT = "SVxxxxx";
    private static final String ID_PATERN = "SV\\d{5}";

    private String id;
    private String name;
    private String nganhHoc;
    private float dtb;

    public String getId() {
        return id;
    }

    protected final void setId(String id) {
        if (isValidateId(id)) {
            this.id = id;
        } else {
            System.out.println("Error: id =" + id + " khong hop le");
        }
    }

    public String getName() {
        return name;
    }

    protected final void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Error: name = " + name + " khong hop le");
        }
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    protected final void setNganhHoc(String nganhHoc) {
        if (nganhHoc != null && !nganhHoc.isBlank()) {
            this.nganhHoc = nganhHoc;
        } else {
            System.out.println("Error: nganhHoc = " + nganhHoc + " khong hop le");
        }
    }

    public float getDtb() {
        return dtb;
    }

    protected final void setDtb(float dtb) {
        if (0.0f <= dtb && dtb <= 10.0f) {
            this.dtb = dtb;
        } else {
            System.out.println("Error: dtb = " + dtb + " khong hop le");
        }
    }

    public SinhVien() {
        this.id = "";
        this.name = "";
        this.nganhHoc = "";
        this.dtb = 0.0f;
    }

    public SinhVien(String id, String name, String nganhHoc, float dtb) {
        setId(id);
        setName(name);
        setNganhHoc(nganhHoc);
        setDtb(dtb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=").append(this.id);
        sb.append(", name=").append(this.name);
        sb.append(", nganhHoc=").append(this.nganhHoc);
        sb.append(", dtb=").append(this.dtb);
        return sb.toString();
    }

    public void input() {
        this.id = inputId();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("name: ");
            this.name = sc.nextLine();
        } while (this.name.isBlank());
        do {
            System.out.print("nganhHoc: ");
            this.nganhHoc = sc.nextLine();
        } while (this.nganhHoc.isBlank());
        do {
            System.out.print("dtb: ");
            this.dtb = sc.nextFloat();
        } while (this.dtb < 0 || this.dtb > 10.0);
    }

    public final void output() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" {");
        sb.append(toString());
        sb.append(" }");
        System.out.println(sb.toString());
    }

    private String inputId() {
        Scanner sc = new Scanner(System.in);
        String inId;
        do {
            System.out.print("id (" + ID_FORMAT + "): ");
            inId = sc.nextLine();
        } while (!isValidateId(inId));
        return inId;
    }

    private boolean isValidateId(String id) {
        return id != null && id.matches(ID_PATERN);
    }

}
