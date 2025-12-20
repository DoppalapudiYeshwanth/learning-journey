import java.util.Scanner;


public class Functions {
   public static void main(String[] var0) {
      // String var1 = vowels("happy");
      // System.out.println("Result is :" + var1);
      // factNum(4);
      // primeCheck(11);
      // binomialCoeff(4,2);
      // primePrint(20); 
      primePrintTilln(20);
      
   }
   public Functions() {
   }

   public static int add(int var0, int var1) {
      return var0 + var1;
   }

   public static String vowels(String var0) {
      Scanner var1 = new Scanner(System.in);
      var0 = var1.nextLine();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         if (var3 == 'a' || var3 == 'e' || var3 == 'i' || var3 == 'o' || var3 == 'u' || var3 == 'A' || var3 == 'E' || var3 == 'I' || var3 == 'O' || var3 == 'U') {
            System.out.print("" + var3 + " ");
         }
      }

      return "Vowels printed above";
   }
   public static int factNum(int num){
      int fact=1;
      for(int i=1;i<=num;i++){
          fact*=i;
      }
      // System.out.println(fact);
      return fact;
   }
   public static boolean primeCheck(int num){
      boolean isPrime=true;
      if(num>1){
        for(int i=2;i<num;i++){
         if(num%i==0){
            isPrime=false;
         }
         else{
            isPrime=true;
         }
        }
      }
      else{
         isPrime=false;
      }
      if(isPrime==true){
         System.out.println("This is a prime");
      }
      else{
         System.out.println("This is not a prime");
      }
      return isPrime;
   }
   public static int binomialCoeff(int n,int r){
      int numerator=factNum(n);
      int denominator1=factNum(r);
      int denominator2=factNum(n-r);
      int result=numerator/(denominator1*denominator2);
      System.out.println(result);
      return 0;
   }
   public static boolean primePrint(int num){
      boolean isPrime=true;
      if(num>1){
         for(int i=2;i*i<=num;i++){
         if(num%i!=0){
         isPrime=true;
         }
         else{
         isPrime=false;
         }
      }
      }
      else{
         isPrime=false;
      }
      return isPrime;
   }
public static void primePrintTilln(int num){
   for(int i=2;i<=num;i++){
      if(primePrint(i)){
         System.out.println(i);
      }
   }
}
}
