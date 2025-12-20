public class ClassOject {
     public static void main(String[]args){
     University adypu = new University();
        adypu.name = "ADYPU";
        adypu.location = "Kolhapur";
        adypu.fees = 50000;
        adypu.display();
     University nirma=new University();
        nirma.name = "Nirma University";
        nirma.location = "Ahmedabad";
        nirma.fees = 60000;
        nirma.display();
    Marks s1=new Marks(22);
        s1.see();
    }
}
class University{
    String name;
    String location;
    int fees;
    public void display(){
        System.out.println("university name:"+this.name);
        System.out.println("University location:"+ this.location);
        System.out.println("University fees:"+ this.fees);
    }
}
class Student{
    String name;
    int marks;
    public void show(){
        System.out.println("Student name:"+this.name);
        System.out.println("Student marks:"+ this.marks);
    }
}
class Marks{
    int rollno;

    public void see(){
        System.out.println(this.rollno);
    }
Marks(int rollno){
    this.rollno=rollno;
}
}