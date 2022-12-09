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
public class NhanVienQL extends NhanVienCC{
        // Thêm ID_format để khi nhập ID nó hiện ra chức vụ và mã ID gồm 5 số
    public static final String ID_FORMAT = "NVQLxxxxx";
    public static final String ID_REGEX = "Nhan vien Quan Ly: \\d{5}"; //tìm ở tỏng java regex "\\d là co số"
    /*
    B1: them get va set vao
    */
    private float phuCapCV;

    public float getPhuCapCV() {
        return phuCapCV;
    }

    public final void setPhuCapCV(float phuCapCV) {
        if(phuCapCV >= 0.0f){
        this.phuCapCV = phuCapCV;
        }
    }
    /*
    B2: them contructor rỗng
    */  
    public NhanVienQL() {
    
    }
    /*
    B3: them contructor đầy đủ
    */  
    public NhanVienQL(
            String ma, 
            String tenNV, 
            Date ns, 
            String trinhDo, 
            float luongCB, 
            String truongDT, 
            String chuyenMon, 
            float phuCapCV) {
        super(ma, tenNV, ns, trinhDo, luongCB, truongDT, chuyenMon);
        this.setPhuCapCV(phuCapCV);
    }

    @Override
    protected float tinhLuong() {
    return this.getLuongCB() + this.phuCapCV;
    }

    @Override
    protected boolean validateId(String id) {
    return id != null && id.matches(NhanVienQL.ID_REGEX);
    }
    
       @Override
    protected String getIdFormat() {
    return NhanVienQL.ID_FORMAT; 
    }
}
