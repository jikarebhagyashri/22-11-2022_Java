public class Student {

    private int rollNumber;
    private String name;
    private String standard;
    private int totalMarks;
    private static String college;

    public Student() {
        rollNumber = 1;
        name = "NA";
        standard = "first";
        totalMarks = 0;
    }

    public Student(int rollNumber, String name, String standard, int totalMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.standard = standard;
        this.totalMarks = totalMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void display() {

    }

}

