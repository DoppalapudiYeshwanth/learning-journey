

public class datatypes {
    public static void main(String[]args){

    // Fahrenheit to Celsius conversion
        double fahrenheit = 212;
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius);

    // Convert inches to centimeters
       double inches= 1000;
       double centimeters= inches*0.0254;
       System.out.println(centimeters);

    // sum of digits in a integer, 
       int a=123;
       String astr= String.valueOf(a);
       int sum=0;
       for(int i=0;i<astr.length();i++){
          int digit= Character.getNumericValue(astr.charAt(i));
            sum=sum+digit;
            System.out.println(digit);
       }
       
       System.out.println(sum);
    // Minutes into years and days
      int minutes= 525600;
      long years= minutes/(60*24*365);
      long days= minutes/(60*24);
      System.out.println(years);
        System.out.println(days);
    // covert indian time into gmt
      long millisecs= System.currentTimeMillis();
      long timeZoneChange= 256;
      long totalseconds=millisecs/1000;
      long currentseconds=totalseconds%60;
      long totalminutes=totalseconds/60;
      long currentminutes=totalminutes%60;
      long totalhours=totalminutes/60;
      long currenthours=((totalhours+timeZoneChange)%24);
      System.out.println(currenthours);
      System.out.println(currentminutes);
      System.out.println(currentseconds);
      // BMI calulation
       float weight= 65.5f;
       float height= 1.8f;
       float bmi= weight/(height*height);
       System.out.println(bmi);
       // speed calculator
       int distance=100;
       int time=10;
       float speedkm= (float)distance/time;
       float speedmiles= (float)distance/time*0.621371f;
       float speedmeters= (float)distance/time*1000;
       System.out.println(speedmiles);
       System.out.println(speedkm);
       System.out.println(speedmeters);
       //
       double number1=10;
       int number2=20;
       int number3=30;
       double cube= number1*number1*number1;
       int cube1= number2*number2*number2;
       int cube2= number3*number3*number3;
       System.out.println(cube);
       System.out.println(cube1);
       System.out.println(cube2);
       System.out.println(number1*number1);
       System.out.println(Math.pow(number1,4));
       //
       
        }
}
