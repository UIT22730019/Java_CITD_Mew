/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author 84793
 */
public class NhanVienNC extends NhanVienCC{
        // Thêm ID_format để khi nhập ID nó hiện ra chức vụ và mã ID gồm 5 số
    public static final String ID_FORMAT = " NVNCxxxxx";
    public static final String ID_REGEX = " Nhan vien nghien cuu: \\d{5}"; //tìm ở tỏng java regex "\\d là co số"
    private float phuCapDH;

    public float getPhuCapDH() {
        return phuCapDH;
    }

    public final void setPhuCapDH(float phuCapDH) {
        if (phuCapDH >= 0.0f){
        this.phuCapDH = phuCapDH;
        }
    }

    public NhanVienNC() {
    
    }

    public NhanVienNC(
            String ma, 
            String tenNV, 
            Date ns, 
            String trinhDo, 
            float luongCB, 
            String truongDT, 
            String chuyenMon, 
            float phuCapDH) {
        super(ma, tenNV, ns, trinhDo, luongCB, truongDT, chuyenMon);
        this.setPhuCapDH(phuCapDH);
    }
    @Override
    protected float tinhLuong() {
       return this.getLuongCB() + this.phuCapDH;
    }

    @Override
    protected boolean validateId(String id) {
    return id != null && id.matches(NhanVienNC.ID_REGEX);
    }
        @Override
    protected String getIdFormat() {
    return NhanVienNC.ID_FORMAT;
    }
}
