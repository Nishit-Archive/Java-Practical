public class Prac21 {
    public static void main(String[] args) {
        // create a new Person object using the default constructor
        Person person = new Person();

        // set the instance variables
        person.setName("John");
        person.setAge(30);
        person.setSalary(50000.0);

        // display the instance variables
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: $" + person.getSalary());
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    // default constructor
    public Person() {
        name = "";
        age = 0;
        salary = 0.0;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
