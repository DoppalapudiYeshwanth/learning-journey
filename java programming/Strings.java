public class Strings {
    public static void main(String[] args)throws ClassNotFoundException{
    
        // String name=new String("yeshwanth");
        // System.out.println(name.hashCode());
        // StringBuffer sb= new StringBuffer("yeshwanth");
        // System.out.println(sb.append(" Topper"));
        // System.out.println(sb.capacity());
        // System.out.println(sb.deleteCharAt(0));
        // System.out.println(sb.insert(8," Topper"));
        // System.out.println(sb.replace(0,8,"yeshuuuuu"));
        Class.forName("Mobile");

    }
}
class Mobile{
   static String name;

public Mobile(){

}

static{
    name="dolly";
    System.out.println("static method called");
}
}