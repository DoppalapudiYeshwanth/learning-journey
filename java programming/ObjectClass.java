
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj=new Laptop("lenovo",2344);
        System.out.println(obj.toString()+obj.model+obj.price);
        Laptop obj2=new Laptop("lenovo",2344);
        boolean result=obj.equals(obj2);
        System.out.println(result);
    }
}
class Laptop{
    String model;
    double price;

 public String toString(){
    return "hey";
}

public Laptop(String model,int price){
   this.model=model;
   this.price=price;
}
boolean equals(Laptop that){
if(this.model.equals(that.model) && this.price==that.price){
    return true;
}
else{
    return false;
}
}
}
