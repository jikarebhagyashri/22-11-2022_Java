public class DoctMain {
    public static void main(String[] args) {

        System.out.println( "Hospital = " + Doct.getHospital());

        Doct d1 = new Doct(1, "Sushil", "Pune", "MBBS", "Heart", "9876456378" );
        Doct d2 = new Doct(2, "Vishal", "Mumbai", "MD", "Surgery", "9876976378");
        Doct d3 = new Doct(3, "Rahul", "Nashik", "MS", "Medicine", "9876453278");
        Doct d4 = new Doct(4, "Anil", "Delhi", "BAMS", "Ayurvedic", "9006456378");
        Doct d5 = new Doct(5, "Omkar", "Nagpur", "BHMS", "Homeopathic", "9336456378");
        Doct d6 = new Doct(6, "Sujit", "Thane", "BPT", "Phycho", "9876400378");

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();

        d1.setHospital
    }
}
