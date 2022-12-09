package quanlynhanvien;

/**
 *
 * @author hasu
 */
public class QuanLyNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVienQL();
        nv.input();
        nv.output();

        System.out.println("=====================");
        float pc = -1000000F;
        ((NhanVienQL) nv).setPhuCapCV(pc);
        nv.output();

        nv = new NhanVienNC();
        nv.input();
        nv.output();
        
        nv = new NhanVienPV();
        nv.input();
        nv.output();
//        System.out.println(nv.toString());
    }

}
