public class Prac22 {
    private String name;
    private int rollNo;
    private double totalMarks;

    // zero-argument constructor with default values
    public Student() {
        this("Unknown", 0, 0.0);
    }

    // constructor with all three parameters
    public Student(String name, int rollNo, double totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    // display method to print the values of the object
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

    // main method to create and display objects
    public static void main(String[] args) {
        // create object with zero-argument constructor
        Student s1 = new Student();
        System.out.println("Values using zero-argument constructor:");
        s1.display();

        // create object with all three parameters
        Student s2 = new Student("John Doe", 1234, 95.5);
        System.out.println("Values using three-argument constructor:");
        s2.display();
    }
}
