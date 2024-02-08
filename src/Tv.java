public class Tv {
    String Brand;
    int size, price;

    public  Tv(int size , int price){
        this.size=size;
        this.price=price;
        if(size>=20&& size<=50){
            int discount = 500;
            System.out.println("for the size "+size +" inch the discount is of RS "+discount);
            price = price - discount;
        } else if (size>=50) {
            int discount =2000;
            System.out.println("for the size "+size +"the discount is of RS "+discount);

            price = price - discount;
        }
        System.out.println("discounted price of tv is "+price);
    }
    public void display(){
        System.out.println("Brand of tv is "+Brand);
        System.out.println("size of tv is "+size);

    }

    public static void main(String[] args) {
        Tv sc = new Tv(36,5000);
        sc.Brand="Samsung";

        sc.display();


    }
}
