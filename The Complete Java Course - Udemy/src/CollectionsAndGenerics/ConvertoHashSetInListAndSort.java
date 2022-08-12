package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConvertoHashSetInListAndSort {

    public static void main(String[] args) {

        HashSet<Employee> hashSetEmployee = new HashSet<Employee>();
        hashSetEmployee.add(new Employee("João", 3500, "Physics"));
        hashSetEmployee.add(new Employee("Gabriel", 3501, "IT"));
        hashSetEmployee.add(new Employee("Marques", 3502, "Sales"));
        hashSetEmployee.add(new Employee("Mendes", 3503, "Admin"));

        ArrayList<Employee> arrayListEmployee = new ArrayList<Employee>(hashSetEmployee);

        Collections.sort(arrayListEmployee);

        System.out.println("Sorted by Salary List:");
        int i = 1;
        for(Employee employee : arrayListEmployee){
            System.out.printf("%d - %s (%,d).%n", i, employee.getName(), employee.getSalary());
            i++;
        }
    }
}
