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
public abstract class NhanVienCC extends NhanVien {
    private String truongDT;
    private String chuyenMon;
    
    /*
    B1: them get va set vao
    */

    public String getTruongDT() {
        return truongDT;
    }

    public final void setTruongDT(String truongDT) {
        if (truongDT != null && truongDT.isBlank()){
        this.truongDT = truongDT;
        }
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public final void setChuyenMon(String chuyenMon) {
        if (chuyenMon != null && chuyenMon.isBlank()){
        this.chuyenMon = chuyenMon;
        }
    }
    
    /*
    B2: them contructor rỗng
    */  

    public NhanVienCC() {

    }
    /*
    B3: them contructor đầy đủ
    */  
    public NhanVienCC(
            String ma, 
            String tenNV, 
            Date ns, 
            String trinhDo, 
            float luongCB, 
            String truongDT, 
            String chuyenMon) {
        super(ma, tenNV, ns, trinhDo, luongCB);
        this.setTruongDT(truongDT);
        this.setChuyenMon(chuyenMon);
    }
    
}
