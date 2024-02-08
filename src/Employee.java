 class Employee1 {
    String name;
    int salary;
    int id ;
    int annual;
     public  Employee1(int salary){
         this.salary=salary;
         annual =  salary*12;

     }


    public void display(){
        System.out.println("name of employee is "+name);
        System.out.println("salary of employe is "+salary);
        System.out.println("annual salary of employee is "+annual);
    }


}
public class Employee {
    public static void main(String[] args) {
        Employee1 sc = new Employee1(1000);
        sc.name="sahil";

        sc.id=17;


        sc.display();

    }
}
