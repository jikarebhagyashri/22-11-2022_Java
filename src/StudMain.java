public class StudMain {
    public static void main(String[] args) {

        System.out.println("college = " + Stud.getCollege());

        Stud s1 = new Stud( "Bhagyashree","Juhu", 550  );
        Stud s2 = new Stud( "Shraddha","Andheri", 510);
        Stud s3 = new Stud("Sam","Borivali", 450);
        Stud s4 = new Stud( "Larry","Thane", 350);

        s1.display();
        s2.display();
        s3.display();
        s4.display();

        s1.setCollege("SNDT");
        System.out.println(s1.getCollege());

        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }
}
