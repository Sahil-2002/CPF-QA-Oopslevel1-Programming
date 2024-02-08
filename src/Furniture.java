public class Furniture {
String type , material;
int price;

public  Furniture(String material, int price){
    this.price=price;
    this.material=material;
    int discount =0;
    if(material.equals("poor")){
        discount=300;
    } else if (material.equals("good")) {
    discount=200;

    } else if (material.equals("excellent")) {
        discount=100;

    }
    price = price - discount;
    System.out.println("the discounted price is "+price);
}
public void display(){
    System.out.println("the type of furniture is "+type);
    System.out.println("the material of furniture is "+material);

}

    public static void main(String[] args) {
        Furniture sc = new Furniture("good",2000);
        sc.type="kitchen";



        sc.display();

    }

}
