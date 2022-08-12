package CollectionsAndGenerics;

public class Employee implements Comparable<Employee>{

    private String name;
    private int salary;
    private String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public int compareTo(Employee o) {

        // Inverted because I wanna print in increase order;
        if (this.salary < o.getSalary()){
            return 1;
        } else if (this.salary > o.getSalary()) {
            return -1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary +
                ", department='" + department + '\'' + '}';
    }
}
