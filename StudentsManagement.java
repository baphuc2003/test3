import java.util.ArrayList;
import java.util.Scanner;

/**
 * StudentsManagement
 */
public class StudentsManagement {
   static ArrayList<Students> list = new ArrayList<>();
     public static void menu() {
         Scanner sc = new Scanner(System.in);
         int choice;
         int id = 0;
         int removeId = 0;
         do {
            System.out.println("----------Menu-----------");
            System.out.println("0: Thoat chuong trinh");
            System.out.println("1: Them sinh vien");
            System.out.println("2: In ra danh sach sinh vien");
            System.out.println("3: Xoa sinh vien");
            System.out.println("Moi ban chon chuc nang");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                System.out.println("CUT me may di");
                break;
                case 1:
                    System.out.print("Enter student name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter student score: ");
                    double score = sc.nextDouble();
                    sc.nextLine(); // Đọc bỏ dòng new line
                    id++;
                    Students s1 = new Students(id,name, age, score);
                    list.add(s1);
                    break;
                case 2:
                    for (Students student : list) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID cua sinh vien can xoa: ");
                    removeId = sc.nextInt();
                    for(int i=0 ; i<list.size(); i++) {
                      if(removeId==list.get(i).id) {
                         list.remove(i);
                         System.out.println("Xoa thanh cong sinh vien co Id la "+removeId);
                      }
                    }
                    break;
                default:
                    break;
            }
         } while (choice !=0);
     }
}

