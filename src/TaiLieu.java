public class TaiLieu {
    int ID;
    String nameNXB;
    int soBanPhanHanh;

    public TaiLieu(int ID, String nameNXB, int soBanPhanHanh) {
        this.ID = ID;
        this.nameNXB = nameNXB;
        this.soBanPhanHanh = soBanPhanHanh;
    }

    public TaiLieu() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoBanPhanHanh() {
        return soBanPhanHanh;
    }

    public void setSoBanPhanHanh(int soBanPhanHanh) {
        this.soBanPhanHanh = soBanPhanHanh;
    }
}
