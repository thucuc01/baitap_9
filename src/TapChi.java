public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int ID, String nameTacGia, int soBanPhanHanh, int soPhatHanh, int thangPhatHanh) {
        this.ID=ID;
        this.nameNXB =nameTacGia;
        this.soBanPhanHanh=soBanPhanHanh;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(){
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                ", ID=" + ID +
                ", nameTacGia='" + nameNXB + '\'' +
                ", soBanPhanHanh=" + soBanPhanHanh +
                '}';
    }
}
