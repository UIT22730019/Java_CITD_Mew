package phuongtiengiaothong;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hasu
 */
public class QuanLyPhuongTienGiaoThong {

    private final DanhSachPhuongTienGiaoThong danhSachPhuongTien;
    private IDataMangement dataManagement;

    public void setDataManagement(IDataMangement dataManagement) {
        this.dataManagement = dataManagement;
    }

    public QuanLyPhuongTienGiaoThong() {
        this.danhSachPhuongTien = new DanhSachPhuongTienGiaoThong();
    }

    public void loadData() {
        List<String> dataList = this.dataManagement.loadData();
        String[] atributes;
        PhuongTienGiaoThong ptgt;
        for (String data : dataList) {
            if (!data.isBlank()) {
                atributes = data.split(",");
                if (atributes[0].contains("C")) { // Oto
                    ptgt = new Oto();
                } else if (atributes[0].contains("T")) { // XeTai
                    ptgt = new XeTai();
                } else {
                    ptgt = null;
                    System.out.println("Error!");
                }
                if (ptgt != null) {
                    try {
                        ptgt.setAttributes(atributes);
                    } catch (PTGTException ex) {
                        System.out.println(ex.getMessage());
                        continue;
                    }
                    this.danhSachPhuongTien.add(ptgt);
                }
            }
        }
    }

    private boolean addNewOto() {
        try {
            PhuongTienGiaoThong ptgt = new Oto();
            ptgt.input();
            return this.danhSachPhuongTien.add(ptgt);
        } catch (PTGTException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    private boolean addNewXeTai() {
        try {
            PhuongTienGiaoThong ptgt = new XeTai();
            ptgt.input();
            return this.danhSachPhuongTien.add(ptgt);
        } catch (PTGTException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
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
            try {
                ptgt.inputUpdate();
            } catch (PTGTException ex) {
                System.out.println(ex.getMessage());
                System.out.println("==============");
                System.out.println(ex.toString());
                System.out.println("==============");
                ex.printStackTrace();
            } catch (NullPointerException ex1) {
                System.out.println(ex1.getMessage());
            }
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    private void saveAll() {
        List<String> dataList = new ArrayList();
        for (PhuongTienGiaoThong ptgt : danhSachPhuongTien) {
            dataList.add(ptgt.toString());
        }
        //FileManagement file = new FileManagement(QuanLyPhuongTienGiaoThong.FILE_PATH);
        this.dataManagement.saveData(dataList);
    }

    private void shopwMenu() {
        System.out.println("(1) -> Add new Oto");
        System.out.println("(2) -> Add new Xe tai");
        System.out.println("(3) -> Show all");
        System.out.println("(4) -> Filter by Hang san xuat");
        System.out.println("(5) -> Filter by mau xe");
        System.out.println("(6) -> Xoa xe by id");
        System.out.println("(7) -> Cap nhat thoong tin xe by id");
        System.out.println("(8) -> Save all");
        System.out.println("(0) -> Exit");
    }

    public void run() {
        loadData();
        int option;
        do {
            shopwMenu();
            option = Util.inputInteger("Lua chon chuc namg:", 0, 8, false);
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
                case 8:
                    saveAll();
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

}
