public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao(int ID, String nameTacGia, int soBanPhanHanh, int ngayPhatHanh) {
        this.ID=ID;
        this.nameNXB =nameTacGia;
        this.soBanPhanHanh=soBanPhanHanh;
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", ID=" + ID +
                ", nameTacGia='" + nameNXB + '\'' +
                ", soBanPhanHanh=" + soBanPhanHanh +
                '}';
    }
}
