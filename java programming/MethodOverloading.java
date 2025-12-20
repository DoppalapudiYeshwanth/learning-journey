/* public class MethodOverloading {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.display("John");
        s1.display(101);
    }
}
class Student{
    public void display(String name){
        System.out.println(name);
    }
    public void display(int rollNo){
        System.out.println(rollNo);
    }
    public void display(String name, int rollNo){
        System.out.println(name + " " + rollNo);
    }

Student(){
    System.out.println("Constructor called");
    // This is a constructor
}} */


class Student {
    String name;
    int age;

    // Constructor 1: No parameters
    Student() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    // Constructor 2: One parameter
    Student(String n) {
        System.out.println("Constructor with 1 parameter called");
        name = n;
        age = 0;
    }

    // Constructor 3: Two parameters
    Student(String n, int a) {
        System.out.println("Constructor with 2 parameters called");
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();               // Calls default constructor
        Student s2 = new Student("Yeshwanth");    // Calls constructor with 1 parameter
        Student s3 = new Student("Ravi", 21);     // Calls constructor with 2 parameters

        s1.display();
        s2.display();
        s3.display();
    }
}

