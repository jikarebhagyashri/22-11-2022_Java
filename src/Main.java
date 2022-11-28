public class Main {
    public static void main(String[] args) {

       /* System.out.println("Country = " + Product.Country);
        Product.Country = "India";*/

        System.out.println("Country = " + Product.getcountry());

        Product p1 = new Product(1,"LOREAL",500);
        Product p2 = new Product(8,"LAKME",900);
        Product p3 = new Product(9,"DOVE",100);

        p1.display();
        p2.display();
        p3.display();

        p1.setCountry("INDIA");
        System.out.println(p1.getcountry());

        p1.display();
        p2.display();
        p3.display();

    }
}
