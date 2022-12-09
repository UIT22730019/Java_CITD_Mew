import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhoSach {
	private ArrayList<Sach> dsSach;
	private ArrayList<NhaXuatBan> dsNXB;
	private ArrayList<TacGia> dsTacGia;

	public KhoSach() {
		this.dsSach = new ArrayList<>();
		this.dsNXB = new ArrayList<>();
		this.dsTacGia = new ArrayList<>();
	}

	public ArrayList<TacGia> getDsTacGia() {
		return dsTacGia;
	}

	public void setDsTacGia(ArrayList<TacGia> dsTacGia) {
		this.dsTacGia = dsTacGia;
	}

	public KhoSach(ArrayList<Sach> dsSach, ArrayList<NhaXuatBan> dsNXB, ArrayList<TacGia> dsTacGia) {
		this.dsSach = dsSach;
		this.dsNXB = dsNXB;
		this.dsTacGia = dsTacGia;
	}

	public void themNXB() {
		Scanner sc = new Scanner(System.in);
		NhaXuatBan nxb = new NhaXuatBan();
		System.out.println("Nhap Nha xuat ban: ");
		nxb.setTennxb(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		nxb.setDiachi(sc.nextLine());
		System.out.println("Nhap sdt: ");
		nxb.setSdt(sc.nextLine());
		System.out.println();
		dsNXB.add(nxb);
	}

	public void themNXB(String tennxb) {
		Scanner sc = new Scanner(System.in);
		NhaXuatBan nxb = new NhaXuatBan();
		nxb.setTennxb(tennxb);
		System.out.println("Nhap dia chi: ");
		nxb.setDiachi(sc.nextLine());
		System.out.println("Nhap sdt: ");
		nxb.setSdt(sc.nextLine());
		System.out.println();
		dsNXB.add(nxb);
	}

	public void themNXB(NhaXuatBan nxb) {
		if (nxb.getTennxb() != null) {
			dsNXB.add(nxb);
		}
	}

	public void themSach(Sach sach) {
		if (sach.getTensach() != null || !sach.getTensach().isBlank()) {
			dsSach.add(sach);
		}

	}

	public void themSach() {
		Scanner sc = new Scanner(System.in);
		Sach sach = new Sach();
		System.out.println("Nhap ten sach:");
		sach.setTensach(sc.nextLine());
		int n;
		System.out.println("Nhap so luong tac gia: ");
		n = Integer.parseInt(sc.nextLine());
		ArrayList<TacGia> bookTacgia = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap but danh tac gia: ");
			String findtacgia = sc.nextLine();
			boolean checkTacgia = false;

			for (TacGia x : this.dsTacGia) {
				if (x.getTenTG().equalsIgnoreCase(findtacgia)) {
					checkTacgia = true;
					bookTacgia.add(x);
					System.out.println(bookTacgia.toString());
					sach.setTacgia(bookTacgia);
					break;
				}
			}
			if (!checkTacgia) { //
				themTacGia(findtacgia);
				for (TacGia x : this.dsTacGia) {
					if (x.getTenTG().equalsIgnoreCase(findtacgia)) {
						bookTacgia.add(x);
					}
				}
			}
		}

		sach.setTacgia(bookTacgia);
		System.out.println("The loai sach: ");
		System.out.println("\t 1. Tieu thuyet");
		System.out.println("\t 2. Thieu Nhi");
		System.out.println("\t 3. Van hoc");
		System.out.println("\t 4. Truyen tranh");
		int choose = 0;
		while (choose < 1 || choose > 4) {
			System.out.println("Lua chon: ");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1:
				sach.setTheloai("Tieu thuyet ");
				break;
			case 2:
				sach.setTheloai("Thieu nhi ");
				break;
			case 3:
				sach.setTheloai("Van hoc ");
				break;
			case 4:
				sach.setTheloai("Truyen tranh ");
				break;
			default:
				break;
			}
		}
		System.out.println("Gia bia: ");
		sach.setGiabia(Integer.parseInt(sc.nextLine()));
		System.out.println("Nha xuat ban: ");
		String findnxb = sc.nextLine();
		boolean checkNXB = false;
		for (NhaXuatBan x : this.getDsNXB()) {
			if (x.getTennxb().equalsIgnoreCase(findnxb)) {
				checkNXB = true;
				sach.setNxb(x);
				break;
			}
		}
		if (!checkNXB) {
			themNXB(findnxb);
			for (NhaXuatBan x : getDsNXB()) {
				if (x.getTennxb().equalsIgnoreCase(findnxb)) {
					sach.setNxb(x);
					break;
				}
			}
		}
		System.out.println("Nhap nam xuat ban: ");
		sach.setNamxuatban(Integer.parseInt(sc.nextLine()));
		this.dsSach.add(sach);
	}

	public void themTacGia(String tenTG) {
		Scanner sc = new Scanner(System.in);
		TacGia tacGia = new TacGia();
		tacGia.setTenTG(tenTG);
		System.out.println("Nhap nam sinh cua tac gia: ");
		tacGia.setNamsinh(Integer.parseInt(sc.nextLine()));
		dsTacGia.add(tacGia);
		sc.close();
	}

	public void themTacGia() {
		Scanner in = new Scanner(System.in);
		TacGia tacGia = new TacGia();
		System.out.println("Nhap but danh: ");
		tacGia.setTenTG(in.nextLine());
		System.out.println("Nhap nam sinh cua tac gia: ");
		tacGia.setNamsinh(Integer.parseInt(in.nextLine()));
		dsTacGia.add(tacGia);
		in.close();
	}

	public void themTacGia(TacGia tacGia) {
		dsTacGia.add(tacGia);
	}

	public ArrayList<Sach> thongkeTacGia(String tenTG) {
		ArrayList<Sach> dsSach_TacGia = new ArrayList<>();
		if (tenTG.isBlank()) {
			for (Sach x : this.dsSach) {
				x.show();
			}
		} else {
			for (Sach x : this.dsSach) {
				for (TacGia y : x.getTacgia()) {
					if (y.getTenTG().equalsIgnoreCase(tenTG)) {
						dsSach_TacGia.add(x);
					}
				}
			}
		}
		return dsSach_TacGia;
	}

	public ArrayList<Sach> thongkeTheLoai(String theloai) {
		ArrayList<Sach> dsSach_TheLoai = new ArrayList<>();
		if (theloai.isBlank()) {
			for (Sach x : this.dsSach) {
				x.show();
			}
		} else {
			for (Sach x : this.dsSach) {
				if (x.getTheloai().equalsIgnoreCase(theloai)) {
					dsSach_TheLoai.add(x);
				}
			}
		}
		return dsSach_TheLoai;
	}

	public ArrayList<Sach> thongkeNXB(String nxb) {
		ArrayList<Sach> dsSach_NXB = new ArrayList<>();
		if (nxb.isBlank()) {
			for (Sach x : this.dsSach) {
				x.show();
			}
		} else {
			for (Sach x : this.dsSach) {
				if (x.getNxb().getTennxb().equalsIgnoreCase(nxb)) {
					dsSach_NXB.add(x);
				}
			}
		}
		return dsSach_NXB;
	}

	public List<Sach> getDsSach() {
		return dsSach;
	}

	public void setDsSach(ArrayList<Sach> dsSach) {
		this.dsSach = dsSach;
	}

	public List<NhaXuatBan> getDsNXB() {
		return dsNXB;
	}

	public void setDsNXB(ArrayList<NhaXuatBan> dsNXB) {
		this.dsNXB = dsNXB;
	}
}
