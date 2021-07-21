package javacollection.set.userdefinedobjects;

import javacollection.set.userdefinedobjects.Employee;

import java.util.*;

public class EmployeeTree {
    public void employeeListToSet(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("BossBaby",3,"Disney"));
        empList.add(new Employee("Spongebob",38,"Underwater"));
        empList.add(new Employee("annabella",50,"Home"));
        empList.add(new Employee("BossBaby",3,"Disney"));
        System.out.println("Before removing duplicates======================");
        for(Employee e : empList){
            System.out.println(e.toString());
        }

        Set<Employee> empSet = new HashSet<>(empList);
        System.out.println("After removing duplicates====================");
        for(Employee e : empSet){
            System.out.println(e.toString());
        }
    }
}
