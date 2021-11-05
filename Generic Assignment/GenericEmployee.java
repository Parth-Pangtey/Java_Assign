import java.util.HashSet;

public class GenericEmployee{

    private int id;
    private String name;
    private double salary;
    private String department;

    public GenericEmployee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String displayDetails(){
        return "GenericEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        HashSet<GenericEmployee> employees = new HashSet<>();

        employees.add(new GenericEmployee(1,"abcd",3000,"IT"));
        employees.add(new GenericEmployee(2,"efgh",4000,"CyberSecurity"));
        employees.add(new GenericEmployee(3,"ijjk",5000,"HR"));
        employees.add(new GenericEmployee(4,"lmno",5000,"Business"));
        employees.add(new GenericEmployee(5,"pqrst",9000,"Finance"));
        employees.add(new GenericEmployee(6,"uvwx",4400,"Accounts"));

        for(GenericEmployee e : employees){
            System.out.println(e.displayDetails());
        }
    }
}