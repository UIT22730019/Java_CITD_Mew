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
public abstract class NhanVien {
    
    private String ma; // Chứa 5 ký tự
    private String tenNV; //
    private Date ns;
    private String trinhDo;
    private float luongCB;
    
    /**
     * B2: Thêm get và set toàn bộ
     * @return 
    */       
    public String getMa() {
        return ma;
    }

    public final void setMa(String ma) {
        if (validateId(ma))
        {
        this.ma = ma;    
        }
    }

    public String getTenNV() {
        return tenNV;
    }

    public final void setTenNV(String tenNV) {
        if(tenNV != null && tenNV.isBlank())
        {
        this.tenNV = tenNV;    
        }
    }

    public Date getNs() {
        return ns;
    }

    public final void setNs(Date ns) {
        Date now = new Date();  // Năm sinh phải được xếp sau ngày hiện tại
        if(!ns.after(ns))  // Dấu ! là không được xếp sau ngày hiện tại
        {
        this.ns = ns;
        }
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public final void setTrinhDo(String trinhDo) {
        if(trinhDo != null && trinhDo.isBlank())
        {
        this.trinhDo = trinhDo;
        }
    }

    public float getLuongCB() {
        return luongCB;
    }

    public final void setLuongCB(float luongCB) {
        if(luongCB >= 0.0f){
        this.luongCB = luongCB;
        }
    }
    
    /**
     * B3: Thêm contructor rỗng
    */ 
    public NhanVien() {
    }

    /**
     * B4: Thêm contructor đầy đủ
     * @param ma
     * @param tenNV
     * @param ns
     * @param trinhDo
     * @param luongCB
    */ 
    
    public NhanVien(String ma, String tenNV, Date ns, String trinhDo, float luongCB) {
        this.setMa(ma); //máy báo " method final"
        this.setTenNV(tenNV); //máy báo " method final"
        this.setNs(ns);   //máy báo " method final"
        this.setTrinhDo(trinhDo); //máy báo " method final"
        this.setLuongCB(luongCB);  //máy báo " method final"
    }
    
    public void input(){
// input mã nhân viên
        do {
        this.setMa(Util.inputString("Nhap ma nhan vien ("+ getIdFormat() + ")"));
        } while (this.ma == null);
// input tên nhân viên
    this.setTenNV(Util.inputString("Nhap ten NV"));
    this.setNs(Util.inputDate("Nhap ngay thang nam sinh NV"));
    this.setTrinhDo(Util.inputString("Nhap trinh do"));
    this.setLuongCB(Util.inputFloat("Nhap tien luong CB", 0.0F));
                
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ma=");
        sb.append(ma);
        sb.append(", tenNV=");
        sb.append(tenNV);
        sb.append(", ns=");
        sb.append(Util.toString(ns));
        sb.append(", trinhDo=");
        sb.append(trinhDo);
        sb.append('}');
        return sb.toString();
    }

    /* B5 : Phương thức tính lương không biết tính như thế nào thì điền abstract
     * Sửa lại class đầu thành abstract
    */
    protected abstract float tinhLuong();
    
    protected abstract boolean validateId(String id);
    
    protected abstract String getIdFormat();
    
}
