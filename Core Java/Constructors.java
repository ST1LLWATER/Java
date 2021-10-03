import javax.management.DescriptorRead;

public class Constructors {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.displayDetails();
    }
}

class Employee {
    protected String
            ename;
    protected String
            eid;
    private String
            designation="20";
    protected
    double salary;


    public Employee() {
        ename = "John Doe";
        eid = "119707";
//        designation = "Manager";
        salary = 234000.0;
    }

    public void displayDetails() {
        System.out.println("Name: " + ename);
        System.out.println("Employee Id: " + eid);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + ename);

    }
}



