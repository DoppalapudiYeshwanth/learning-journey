public class Operators {
    public static void main(String[]args){  
        // Arithmetic operators
        int q = 10;
        int p = 20;
        String s="23";
        String d="45";
        int a =Integer.parseInt(s);
        int b =Integer.parseInt(d);
        System.out.println(q+a);
        System.out.println(b+p);
       // unary operators
        char f = 'A';
        char g = 'B';
        int e= (f+g);
        System.out.println(e);
       
        int h=23;
        int k= 45;
        //post increment 
        System.out.println(h++);
        //pre increment
        System.out.println(++k);
        //post decrement
        System.out.println(h--);
        //pre decrement
        System.out.println(--k);
        //
        
        int x = 10;
        int y = 20;
        System.out.println(x+y);
         System.out.println(x*y);
          System.out.println(x-y);
           System.out.println(x/y);
             System.out.println(x%y);

        class method{
            public static void main(String[]args)
            {
                int a = 10;
                int b = 20;
                if(a > b) {
                    System.out.println("a is greater than b");
                } else if (a < b) {
                    System.out.println("b is greater than a");
                } else {
                    System.out.println("a is equal to b");
                }
                System.out.println();
            }

        }     
    }
}
