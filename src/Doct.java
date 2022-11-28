public class Doct {
    private int id;
    private String name;
    private String address;
    private String degree;
    private String specialization;
    private String mob;

    public Doct(int id, String name, String address, String degree, String specialization, String mob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.degree = degree;
        this.specialization = specialization;
        this.mob = mob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public void display(){
        System.out.println("id = " + id + " name = " + name + " address = " + address + " degree = " + degree + " specialization = " + specialization + " mob = " + mob);

    }




}
