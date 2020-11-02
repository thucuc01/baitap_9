public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(int ID, String nameTacGia, int soBanPhanHanh, String tenTacGia,int soTrang) {
        this.ID=ID;
        this.nameNXB =nameTacGia;
        this.soBanPhanHanh=soBanPhanHanh;
        this.tenTacGia = tenTacGia;
        this.soTrang=soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                ", ID=" + ID +
                ", nameTacGia='" + nameNXB + '\'' +
                ", soBanPhanHanh=" + soBanPhanHanh +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
