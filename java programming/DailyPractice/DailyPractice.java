package DailyPractice;
import java.util.*;
 public class DailyPractice{
    public static void main(String[]args){
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // int age = sc.nextInt();
        // int price = sc.nextInt();
        // String item_range = sc.next();
        // boolean student = sc.nextBoolean();
        // printBill(name, age, price, item_range, student);
        String str = "Happiness";
        // printVowels(str);
        int []given= {4,5,9,5,4,6,6,5,4,10,6,4,5,3,8,4,8,3};
        // lonelyPrint(given);
        // distinctElement(given);
        // printTarget(given,9);
        // hollowTriangle(5);
        pyramid(5);
    }
    public static void printBill(String name,int age,int price,String item_range,boolean student){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Price: "+price);
        System.out.println("Item range: "+item_range);
        if(student){
            System.out.println("Customer is our student");
        }  
    }
    public static void printVowels(String str){
        str.toLowerCase();
        int vowels = 0;
        int consonents = 0;
        for(int i=0;i<str.length();i++){
            char search = str.charAt(i);
            if(search=='a'||search=='e'||search=='i'||search=='o'||search=='u'){
                vowels++;
            }
            else{
                consonents++;
            }
        }
        System.out.println("The number of vowels is "+ vowels);
        System.out.println("The number of consonents is "+ consonents);
    }
    public static void lonelyPrint(int[] given) {
    int[] arr1 = new int[100];
    for (int i =0; i <given.length; i++) {
        arr1[given[i]]++;
    }
    for (int i =0; i <arr1.length; i++) {
        if (arr1[i]%2!= 0 && arr1[i]!= 0) {
            System.out.println("The lonely element is " + i + " and it comes " + arr1[i] + " times.");
        }
    }
}
public static void distinctElement(int[] given) {
    int[] arr1 = new int[100];
    for (int i =0; i <given.length; i++) {
        arr1[given[i]]++;
    }
    for (int i =0; i <arr1.length; i++) {
        if (arr1[i]%2!= 0 && arr1[i]!= 0) {
            System.out.println("The unique element is "+i);
        }
    }
}
public static void printTarget(int[]given,int target){
    for(int i=0;i<given.length;i++){
        int holder = given[i];
        for(int j=0;j<given.length;j++){
            if(given[j]+holder==target){
                System.out.println("These elments will give the sum "+ given[j]+","+holder);
            }
        }
    }
}
public static void hollowTriangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==n||j==1||i==j){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void pyramid(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1-i;j++){
            System.out.print(" ");
        }
        for(int k=n;k>n-1-i;k--){
            System.out.print("* ");
        }
        System.out.println();
    }
}}