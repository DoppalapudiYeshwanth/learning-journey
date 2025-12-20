import java.util.Scanner;
public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.name="yeshwanth";
    }
}
class Student{
    public String name;
    void getPer(){
        System.out.println(name);
    }
}
class User{
     String bio;
     public void editBio(){
        Scanner sc= new Scanner(System.in);
        String newBio= sc.nextLine();
        bio=newBio;
        System.out.println();
        sc.close();
     }
}