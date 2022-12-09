package phuongtiengiaothong;

import java.util.List;

/**
 *
 * @author hasu
 */
public class QuanLyPhuongTienGiaoThong {

    private final DanhSachPhuongTienGiaoThong danhSachPhuongTien;

    public QuanLyPhuongTienGiaoThong() {
        this.danhSachPhuongTien = new DanhSachPhuongTienGiaoThong();
    }

    private boolean addNewOto() {
        PhuongTienGiaoThong ptgt = new Oto();
        ptgt.input();
        return this.danhSachPhuongTien.add(ptgt);
    }
    
    private boolean addNewXeTai() {
        PhuongTienGiaoThong ptgt = new XeTai();
        ptgt.input();
        return this.danhSachPhuongTien.add(ptgt);
    }

    private void showAll() {
        System.out.println("Danh sach cac phuong tien:");
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            ptgt.output();
        }
    }

    private void filterByHangSanXuat() {
        String hangSanXuat = Util.inputString("Nhap hang san xuat", false);
        List<PhuongTienGiaoThong> resultList = this.danhSachPhuongTien.filterByHangSanXuat(hangSanXuat);
        System.out.println("Danh sanh filter:");
        for (PhuongTienGiaoThong ptgt : resultList) {
            ptgt.output();
        }
    }

    private void filterByMauXe() {
        String mauXe = Util.inputString("Nhap mau xe", false);
        List<PhuongTienGiaoThong> resultList = this.danhSachPhuongTien.filterByMauXe(mauXe);
        System.out.println("Danh sanh filter:");
        for (PhuongTienGiaoThong ptgt : resultList) {
            ptgt.output();
        }
    }
    
    private void deleteById() {
        String id = Util.inputString("Nhap id phuong tien can xoa", false);
//        PhuongTienGiaoThong ptgt = this.danhSachPhuongTien.filterById(id);
//        if (ptgt != null) {
//            this.danhSachPhuongTien.remove(ptgt);
//        }
        if (this.danhSachPhuongTien.removeById(id)) {
            System.out.println("Success!");
        } else {
            System.out.println("Failed!");
        }
    }
    private void updateById() {
        String id = Util.inputString("Nhap id phuong tien can cap nhat", false);
        PhuongTienGiaoThong ptgt = this.danhSachPhuongTien.filterById(id);
        if (ptgt != null) {
            ptgt.inputUpdate();
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    private void shopwMenu() {
        System.out.println("(1) -> Add new Oto");
        System.out.println("(2) -> Add new Xe tai");
        System.out.println("(3) -> Show all");
        System.out.println("(4) -> Filter by Hang san xuat");
        System.out.println("(5) -> Filter by mau xe");
        System.out.println("(6) -> Xoa xe by id");
        System.out.println("(7) -> Cap nhat thoong tin xe by id");
        System.out.println("(0) -> Exit");
    }

    private void run() {

        int option;
        do {
            shopwMenu();
            option = Util.inputInteger("Lua chon chuc namg:", 0, 7);
            switch (option) {
                case 1:
                    addNewOto();
                    break;
                case 2:
                    addNewXeTai();
                    break;
                case 3:
                    showAll();
                    break;
                case 4:
                    filterByHangSanXuat();
                    break;
                case 5:
                    filterByMauXe();
                    break;
                case 6:
                    deleteById();
                    break;
                case 7:
                    updateById();
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("????");
            }
        } while (option != 0);

        System.out.println("Exited");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new QuanLyPhuongTienGiaoThong().run();
    }

}
