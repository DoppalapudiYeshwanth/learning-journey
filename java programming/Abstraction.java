public class Abstraction {
    public static void main (String[]args){
        shape s1 = new circle();
        s1.area();
        s1.display();
        
        shape s2 = new rectangle();
        s2.area();
        s2.display();
    }
}
abstract class shape{
    abstract void area();
    public void display(){
        System.out.println("This is a shape");
    }
}
class circle extends shape{
    void area(){
        int r = 5; // Example radius
        System.out.println("Area of circle is πr²"+r*r);
    }
}
class rectangle extends shape{
    void area(){
        int l=5;
        System.out.println("Area of rectangle is l*b"+l*5);
    }
}