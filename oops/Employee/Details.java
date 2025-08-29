package oops.Employee;

import java.util.ArrayList;
import java.util.List;

public class Details {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
            new Employee("ramu", 2, 12000),
            new Employee("suji", 13, 15000),
            new Employee("Vasu", 5, 15000)
        );
        
        // Print employee details
        for(Employee e : emp) {
            System.out.println(e);
        }
    }
}
