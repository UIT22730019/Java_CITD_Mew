package democlassandobject;

import java.util.ArrayList;
import java.util.List;
import model.MonHoc;
import model.SinhVien;
import model.SinhVienVB2;

public class DemoClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        MonHoc mh = new MonHoc();
//        MonHoc mh1 = new MonHoc();
        
        Utils.cong(2, 3);
        Utils.luyThua3(5);
        
        
        SinhVien sv = new SinhVienVB2("sv00001", "An", "CNTT", 8.5f, "QTKD");
//        sv.setId("xxxxx");
//        sv.setName(null);
//        sv.setNganhHoc(null);
//        sv.setDtb(100f);
          
        ((SinhVienVB2)sv).setChuyenNganh2("ddd");
        sv.input();
        sv.output();
        
        List<SinhVien> list = new ArrayList();
        list.add(new SinhVien());
        list.add(new SinhVienVB2());
        
    }

}
