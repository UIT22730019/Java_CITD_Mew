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
public class NhanVienPV extends NhanVien {
    // Thêm ID_format để khi nhập ID nó hiện ra chức vụ và mã ID gồm 5 số
        public static final String ID_FORMAT = "PVxxxxx"; 
        public static final String ID_REGEX = "PV:\\d{5}"; 
    
    /*
    B1: Thêm contructor rỗng
    */
    public NhanVienPV() {
    }

    /*
    B2: Thêm contructor đầy đủ
    */
    public NhanVienPV(String ma, String tenNV, Date ns, String trinhDo, float luongCB) {
        super(ma, tenNV, ns, trinhDo, luongCB);
    }
/*
    B3: Máy báo thêm implemment
*/
    @Override
    protected float tinhLuong() {
        return this.getLuongCB();
    }
    
/*
    B4: Implemment
*/
    @Override
    protected boolean validateId(String id) {
    return id != null && id.matches(NhanVienPV.ID_REGEX);
    }

    @Override
    protected String getIdFormat() {
    return NhanVienPV.ID_FORMAT;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienPV{");
        sb.append(super.toString());
        sb.append("luong=");
        sb.append(String.format("%.2f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }

    
}
    
   
