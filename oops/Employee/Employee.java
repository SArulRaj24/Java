package oops.Employee;

public class Employee {
    private final String name;
    private final int id;
    private final int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     int l=1;
    //     sb.append("|  Employee Information:"+ l++ +"\n");
    //     sb.append("|  Name: ").append(name);
    //     sb.append("\n");
    //     sb.append("|  ID: ").append(id);
        
    //     sb.append("\n");
    //     sb.append("|  Salary: $").append(String.format("%,d", salary));
       

    //     return sb.toString();
    // }
    @Override
    public String toString() {
        
        return name+" "+id+" "+salary;
    }

}

