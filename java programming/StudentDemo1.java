import DailyPractice.*;

public class StudentDemo1{
    public static void main (String[]args){
        Student s = new Student();
        s.name = "John Doe";
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.getRollno());
        TestAccess t = new TestAccess();
        //t.display(); displays all the members of TestAccess class as within the same class
        
}}
class Student{
    public String name;
    private int rollno=121;
    public Student(){
        System.out.println("Constructor called");
        // This is a constructor
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
}
class TestAccess{
    private int a =10;
    int b= 20;
    protected int c =30;
    public int d=40;
public TestAccess(){
    System.out.println("TestAccess Constructor called");
}
}
class test extends TestAccess{
    public void display(){
        //  System.out.println("a: " + a); Cant access private member because it is private only within the class
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
}
}
 