import java.util.ArrayList;
import java.util.Scanner;

public class XeMay implements PhuongTienGiaoThong {
    protected String hangSX;
    protected int namSX;
    protected int giaBan;
    protected  int soLuong;
    protected String mau;
    protected int congSuat;
     ArrayList<XeMay> danhSachXe = new ArrayList<>();
    public XeMay() {

    };
    public XeMay(String hangSX,int namSX,int giaBan,int soLuong,String mau,int congSuat) {
         this.hangSX = hangSX;
         this.namSX = namSX;
         this.giaBan = giaBan;
         this.soLuong = soLuong;
         this.mau = mau;
         this.congSuat = congSuat;
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

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    public int getCongSuat() {
        return congSuat;
    }

    @Override
    public String toString() {
       return "hang san xuat "+hangSX+"nam san xuat "+namSX+"gia ban "+giaBan+"so luong "+soLuong+"mau "+mau+"cong suat "+congSuat;

    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Moi ban nhap thong tin Xe May----");
        System.out.println("Nhap  hang san xuat ");
        String hangSX = sc.nextLine();
        setHangSX(hangSX);
        System.out.println("Nhap nam san xaut");
        int namSX = sc.nextInt();
        setNamSX(namSX);
        System.out.println("Nhap gia ban ");
        int giaBan = sc.nextInt();
        setGiaBan(giaBan);
        System.out.println("Nhap so luong ");
        int soLuong = sc.nextInt();
        setSoLuong(soLuong);
        System.out.println("Nhap mau ");
        sc.nextLine();
        String mau = sc.nextLine();
        setMau(mau);
        System.out.println("Nhap cong suat cua xe ");
        int congSuat = sc.nextInt();
        setCongSuat(congSuat);
        // danhSachXe.add(new XeMay(namSX, hangSX, giaBan, soLuong, mau, soChoNgoi));
        danhSachXe.add(new XeMay(hangSX, namSX, giaBan, soLuong, mau, congSuat));
    }

    public void in() {
        for (XeMay xeMay : danhSachXe) {
            System.out.println(xeMay);
        }
    }

    
}

