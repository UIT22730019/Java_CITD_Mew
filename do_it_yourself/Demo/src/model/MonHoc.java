package model;

 public class MonHoc {
    private String id;
    private String name;
    private int soTinChi;
    private final int soTinChiToiDa = 4;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public MonHoc() {
    }

   
    
}
