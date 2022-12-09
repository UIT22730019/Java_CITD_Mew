
import java.awt.Menu;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		KhoSach qsach = new KhoSach();
		ArrayList<Sach> dsSach = new ArrayList<>();
		ArrayList<NhaXuatBan> dsNXB = new ArrayList<>();
		ArrayList<TacGia> dstacgia = new ArrayList<>();
		qsach.themTacGia(new TacGia("Ngo Tat To", 1894));
		qsach.themTacGia(new TacGia("Nam Cao", 1915));
		qsach.themTacGia(new TacGia("Nguyen Luong Bang", 1986));
		qsach.themNXB(new NhaXuatBan());
		qsach.themNXB(new NhaXuatBan("NXB Tre", "HaNoi", "01010100101"));
		qsach.themNXB(new NhaXuatBan("NXB Kim Dong", "TP HCM", "090909092333"));
		qsach.themNXB(new NhaXuatBan("NXB Lao Dong", "TP HCM", "0919191918"));
		qsach.themNXB(new NhaXuatBan("NXB SaiGon", "TP HCM", "0906990428"));
		for (NhaXuatBan x : qsach.getDsNXB()) {
			x.show();
		}
		qsach.themSach(new Sach("String tensach1", dstacgia, "Van Hoc", 50000, qsach.getDsNXB().get(0), 2022));
		qsach.themSach(new Sach("String tensach2", dstacgia, "Tieu Thuyet", 50000, qsach.getDsNXB().get(2), 2022));
		qsach.themSach(
				new Sach("String tensach3", new ArrayList<>(), "Van Hoc", 100000, qsach.getDsNXB().get(0), 2022));
		qsach.themSach(
				new Sach("String tensach4", new ArrayList<>(), "Truyen Tranh", 150000, qsach.getDsNXB().get(3), 2022));
		for (Sach x : qsach.getDsSach()) {
			x.show();
		}
		for (TacGia x : qsach.getDsTacGia()) {
			x.show();
		}
		for (Sach x : qsach.getDsSach()) {
			x.show();
		}
		System.out.println("THONG KE THEO TAC GIA: ");
		for (Sach x : qsach.thongkeTacGia("Nam Cao")) {
			x.show();
		}
		System.out.println("THONG KE THEO THE LOAI:");
		for (Sach x : qsach.thongkeTheLoai("Truyen Tranh")) {
			x.show();
		}
		System.out.println("THONG KE THEO NXB: ");
		for (Sach x : qsach.thongkeNXB("Kim Dong")) {
			x.show();
		}
	}
}
