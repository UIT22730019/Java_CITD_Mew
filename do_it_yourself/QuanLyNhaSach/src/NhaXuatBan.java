
public class NhaXuatBan {

	private static int count = 0;
	private String manxb;
	private String tennxb;
	private String diachi;
	private String sdt;

	public NhaXuatBan(String tennxb, String diachi, String sdt) {
		this.tennxb = tennxb;
		this.diachi = diachi;
		this.sdt = sdt;
	}

	public NhaXuatBan() {
	}

	public void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "NhaXuatBan{" + "manxb='" + manxb + '\'' + ", tennxb='" + tennxb + '\'' + ", diachi='" + diachi + '\''
				+ ", sdt='" + sdt + '\'' + '}';
	}

	{
		manxb = String.format("NXB%04d", count++);
	}

	public String getMaNxb() {
		return manxb;
	}

	public void setMaNxb(String maNxb) {
		this.manxb = manxb;
	}

	public String getTennxb() {
		return tennxb;
	}

	public void setTennxb(String tennxb) {
		if (tennxb != null && !tennxb.isBlank()) {
			this.tennxb = tennxb;
		}
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
}
