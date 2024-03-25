public class Oto {
    protected String hangSX;
    protected int namSX;
    protected int giaBan;
    protected  int soLuong;
    protected String mau;
    protected int soChoNgoi;


    public Oto(String hangSX,int namSX,int giaBan,int soLuong,String mau,int soChoNgoi) {
         this.hangSX = hangSX;
         this.namSX = namSX;
         this.giaBan = giaBan;
         this.soLuong = soLuong;
         this.mau = mau;
         this.soChoNgoi = soChoNgoi;
    }

    public void setHangSX(String hangSX) {
         this.hangSX = hangSX;
    }
    public String getHangSX() {
         return hangSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    } 
    public int getNamSX() {
        return namSX;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public int getGiaBan() {
        return giaBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public String getMau() {
        return mau;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    @Override
    public String toString() {
       return "hang san xuat "+hangSX+"nam san xuat "+namSX+"gia ban "+giaBan+"so luong "+soLuong+"mau "+mau+"so cho ngoi "+soChoNgoi;

    }
}
