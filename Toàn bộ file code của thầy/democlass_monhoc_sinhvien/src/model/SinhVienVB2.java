package model;

import java.util.Scanner;

public class SinhVienVB2 extends SinhVien {

    private String chuyenNganh2;

    public String getChuyenNganh2() {
        return chuyenNganh2;
    }

    public void setChuyenNganh2(String chuyenNganh2) {
        this.chuyenNganh2 = chuyenNganh2;
    }

    public SinhVienVB2() {
    }

    public SinhVienVB2(String id, String name, String nganhHoc, float dtb, String chuyenNganh2) {
        super(id, name, nganhHoc, dtb);
        this.chuyenNganh2 = chuyenNganh2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", chuyenNganh2=").append(chuyenNganh2);
        return sb.toString();
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("chuyenNganh2: ");
            this.chuyenNganh2 = sc.nextLine();
        } while (this.chuyenNganh2.isBlank());
    }

}
