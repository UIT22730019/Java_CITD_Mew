/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhanvien;

import java.util.Date;

/**
 *
 * @author 84793
 */
public class QuanLyNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    NhanVien nv = new NhanVienPV();
    nv.input();
        System.out.println(nv.toString());
       
    }
    
}
