 class student1 {
     String name;
     int age;
     int id;

     public  student1(String name, int age, int id) {
this.name=name;
this.age=age;
this.id=id;
         System.out.println("name of student is " + name);
         System.out.println("age of student is " + age);
         System.out.println("id of student is " + id);

     }
 }
public class student {
    public static void main(String[] args) {
        student1 sc = new student1("sahil", 17,22);



    }

}


