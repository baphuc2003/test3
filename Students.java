/**
 * Students
 */
public class Students {
     protected String name;
     protected int age;
     protected double point;
     protected int id;

     public Students(int id,String name,int age,double point) {
            this.name = name;
            this.age = age;
            this.point = point;
            this.id = id;
     }

     public void setName(String name) {
          this.name = name;
     }
     public String getName() {
          return this.name;
     }

     public void setAge(int age) {
         this.age = age;
     }
     public int getAge() {
          return this.age;
     }

     public void setPoint(double point) {
           this.point = point;
     }
     public double getPoint() {
           return this.point;
     }

     public void setId(int id) {
           this.id = id;
     }
     public int getId() {
           return this.id;
     }

     public String toString() {
         return  "ID: " + id + " /Sinh vien ten "+name + "/" + "tuoi " + age + "/" + "diem so " + point;
     }
}