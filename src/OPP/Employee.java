package OPP;

public class Employee {
    private int id;
    private String name;
    static int counter = 0;
    Address postalAddress;
    public Employee(String name) {
        this.id = ++counter;
        this.name = name;

    }
    public Employee(String name,Address postalAddress) {
        this.id = ++counter;
        this.name = name;
        this.postalAddress = postalAddress;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String toString(){
        String employeeDetails = String.format("%d \t %s \t %s",id,name, postalAddress);
        return employeeDetails;
    }
}
