import java.util.ArrayList;
import java.util.List;

public class Sach {
	private static int countsach = 0;
	private String masach;
	private String tensach;
	private ArrayList<TacGia> tacgia;
	private String theloai;
	private int giabia;
	private NhaXuatBan nxb;
	private int namxuatban;

	public Sach() {
	}

	public Sach(String tensach, ArrayList<TacGia> tacgia, String theloai, int giabia, NhaXuatBan nxb, int namxuatban) {
		this.tensach = tensach;
		this.tacgia = tacgia;
		if (theloai.equalsIgnoreCase("Van hoc") || theloai.equalsIgnoreCase("Thieu Nhi")
				|| theloai.equalsIgnoreCase("Tieu Thuyet") || theloai.equalsIgnoreCase("Truyen Tranh")) {
			this.theloai = theloai;
		} else {
			this.theloai = "";
		}
		this.giabia = giabia;
		this.nxb = nxb;
		this.namxuatban = namxuatban;
	}

	public void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Sach{" + "masach='" + masach + '\'' + ", tensach='" + tensach + '\'' + ", tacgia=" + tacgia
				+ ", theloai='" + theloai + '\'' + ", giabia=" + giabia + ", nxb=" + nxb + ", namxuatban=" + namxuatban
				+ '}';
	}

	{
		masach = String.format("SACH_ID%04d", ++countsach);
	}

	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public List<TacGia> getTacgia() {
		return tacgia;
	}

	public void setTacgia(ArrayList<TacGia> tacgia) {
		this.tacgia = tacgia;
	}

	public void setTacgia(TacGia tacgia) {
		this.tacgia.add(tacgia);
	}

	public void addTacgia(TacGia tacGia) {
		this.tacgia.add(tacGia);
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public int getGiabia() {
		return giabia;
	}

	public void setGiabia(int giabia) {
		this.giabia = giabia;
	}

	public NhaXuatBan getNxb() {
		return nxb;
	}

	public void setNxb(NhaXuatBan nxb) {
		this.nxb = nxb;
	}

	public int getNamxuatban() {
		return namxuatban;
	}

	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}
}