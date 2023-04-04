public class Employee {
    private String name;
    private int age;
    private double salary;
    private int empno;
    private static int nextEmpno = 1;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = nextEmpno;
        nextEmpno++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpno() {
        return empno;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        // initialize employees array with default values
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("John Doe", 30, 50000.0);
        }

        // display employee details
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + employees[i].getEmpno() + " details:");
            System.out.println("Name: " + employees[i].getName());
            System.out.println("Age: " + employees[i].getAge());
            System.out.println("Salary: " + employees[i].getSalary());
            System.out.println();
        }
    }
}
