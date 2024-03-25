import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      // XeMay x1 = new XeMay("VietNam", 2023, 10, 100, "Do", 5);
      XeMay x1 = new XeMay();
      x1.nhapThongTin();
      // System.out.println("Thong tin xe may ban vua nhap la "+x1.toString());
      x1.in();
      x1.nhapThongTin();
      Scanner sc = new Scanner(System.in);
      int choice;
      do {
      
        System.out.println("1: Nhap thong tin xe may");
        System.out.println("2: Nhap thong tin xe o to");
          System.out.println("Moi ban chon ");
          choice = sc.nextInt();
          switch (choice) {
            case 1:
              
              break;
          
            default:
              break;
          }
      } while (choice!=0);
  } 
}