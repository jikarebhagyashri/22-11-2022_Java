public class Product {
    public static String Country;
    private int id;
    private String title;
    private int price;
    public Product(){
        id=0;
        title=null;
        price=0;
    }
    public Product(int id,String title,int price){
        this.id=id;
        this.title=title;
        this.price=price;

    }


    public void display() {
        System.out.println(" Country = " + Country +" id = " + id + " title = " + title + " price = " + price );

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public static String getcountry(){
        return Country;
    }
    public static void setCountry(String country){
        Product.Country = country;
    }
}
