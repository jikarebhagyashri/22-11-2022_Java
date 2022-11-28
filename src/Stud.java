public class Stud {
    private int id;
    private String name;
    private String address;
    private int marks;
    private static String college;
    private static int nextStudId =100;

    public Stud( String name, String address, int marks){
        this.id = ++nextStudId;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public void display(){
        System.out.println("id = " + id + " name = " + name + " address = " + address + " marks = " + marks + " college = " + college);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public static String getCollege(){
        return college;
    }
    public static void setCollege(String college){
        Stud.college = college;
    }

}
