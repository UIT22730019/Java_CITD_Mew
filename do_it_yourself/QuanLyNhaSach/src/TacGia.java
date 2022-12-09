
public class TacGia {
	private String tenTG;
	private int namsinh;

	public TacGia() {

	}

	public void show() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "TacGia{" + "tenTG='" + tenTG + '\'' + ", namsinh='" + namsinh + '\'' + '}';
	}

	public TacGia(String tenTG, int namsinh) {
		this.tenTG = tenTG;
		this.namsinh = namsinh;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
}
