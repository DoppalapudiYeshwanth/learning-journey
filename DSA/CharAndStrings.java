import java.util.*;
import java.lang.*;
public class CharAndStrings {
    public static void main(String[] args) {
        // char str1[]=new char[5];
        // char str[]={'a','b','c','d','\0'};
        // System.out.println(str);
        // String str[]=new String[5];
        // for(int i=0;i<str.length;i++){
        //     str[i]=sc.nextLine();
        // }
        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]);
        // }
        String str[]=new String[5];
        // upperCasePrac(str);
        char str1[]={'a','b','b','a'};
        // palindrome(str1);
        // printString();
        // validAna2();
        // countCase();
        swapIndex();
    }
    // public static void upperCase(String[] str){
    // // String captial = str.toUpperCase();
    // // System.out.println(captial);
    // String str1[]=new String[5];
    // Scanner sc=new Scanner(System.in);
    // for(int i=0;i<str.length;i++){
    //     str[i]=sc.nextLine();
    //     String temp="";
    // for (int j = 0; j < str[i].length(); j++) {
    //      char ch = str[i].charAt(j);
    //      if (ch >= 'a' && ch <= 'z') {
    //        temp += (char)(ch - 32);
    //      }
    //      else{
    //         temp+=ch;
    //      }
    //      str1[i] = temp;
    //     }
    // }
    // System.out.println("Original Strings:");
    //     for (int i = 0; i < str.length; i++) {
    //         System.out.print(str[i]);
    //     }
    //     System.out.println();
    // System.out.println("Uppercase Strings:");
    //  for(int i=0;i<str1.length;i++){
    //      System.out.print(str1[i]);
    // }
    // }
    public static void upperCasePrac(String []str){
        Scanner sc=new Scanner(System.in);
        String upperStr[]=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
            String temp=""; 
            for(int j=0;j<str[i].length();j++){
                char ch=str[i].charAt(j);
                if(ch>='a'&& ch<='z'){
                    temp+=(char)(ch-32);
                }
                upperStr[i]=temp;
            }
        }
        System.out.println("Original Word");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
        System.out.println();
        System.out.println("capital word");
        for(int j=0;j<upperStr.length;j++){
            System.out.print(upperStr[j]);
        }
    }
    public static void reverseChar(char str1[]){
    System.out.println("the original word");
    for(int i=0;i<str1.length;i++){
        System.out.print(str1[i]);
    }
    System.out.println();
    int start=0;
    int end=str1.length-1;
    while(start<=end){
    char temp=str1[start];
    str1[start]=str1[end];
    str1[end]=temp;

    start++;
    end--;
    }
    System.out.println("The reversed char");
     for(int j=0;j<str1.length;j++){
        System.out.print(str1[j]);
    }
    
}
public static void palindrome(char str1[]) {
    // Print the original word
    System.out.print("Original word: ");
    for (int i = 0; i < str1.length; i++) {
        System.out.print(str1[i]);
    }
    System.out.println();

    boolean isPalindrome = true;

    int start = 0;
    int end = str1.length - 1;

    // Compare characters from front and back
    while (start < end) {
        if (str1[start] != str1[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    if (isPalindrome) {
        System.out.println("This is a palindrome");
    } else {
        System.out.println("No, this is not a palindrome");
    }
}
public static void printString(){
    String str="hello";
    for(char ch : str.toCharArray()){
        System.out.print(ch+",");
    }
}
public static void validAna(){
    boolean isAnagram=true;
    String []str1={"a","n","a","g","r","a","m"};
    String []str2={"n","a","g","a","r","a","m"};
    for(int i=0;i<str1.length;i++){
        for(int j=0;j<str2.length;j++){
            int result=str1[i].compareTo(str2[j]);
            if(result==0){
                isAnagram=true;
            }
            else{
                isAnagram=false;
            }
        }
    }
    if(isAnagram){
        System.out.println("This is an Anagram");
    }
    else{
        System.out.println("Not an anagram");
    }
}
public static void validAna1(){
    boolean isAna=true;
    String []str1={"a","n","a","g","r","a","m"};
    String []str2={"n","a","g","a","p","a","m"};
    Arrays.sort(str1);
    Arrays.sort(str2);
    for(int i=0;i<str1.length;i++){
    for(int j=0;j<str2.length;j++){
    int result=str1[i].compareTo(str2[j]);
    if(result==0){
    isAna=true;
    }
    else{
    isAna=false;
    }
    }
   }
   if(isAna){
        System.out.println("This is an Anagram");
    }
    else{
        System.out.println("Not an anagram");
    }
}
public static void validAna2(){
    String []str1={"a","n","a","g","r","a","m"};
    String []str2={"n","a","g","a","r","a","m"};
    boolean isAna=true;
    int count[]=new int[26];
    if(str1.length==str2.length){
        for(int i=0;i<str1.length;i++){
            count[str1[i].charAt(0)-'a']++;
        }
        for(int i=0;i<str2.length;i++){
            count[str2[i].charAt(0)-'a']--;
        }
    }
    for(int i=0;i<count.length;i++){
        if(count[i]==0){
            isAna=true;
        }
        else{
            isAna=false;
            break;
        }
    }
    if(isAna){
        System.out.println("This is an Anagram");
    }
    else{
        System.out.println("Not an anagram");
    }
}
public static void countCase(){
    int count=0;
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count++;
        }
    }
    System.out.println(count+" times");
    sc.close();
}
public static void swapIndex() {
    String str1 = "Hello";
    String str2="Happy";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the index 1 ");
    int ind1 = sc.nextInt();
    System.out.println("enter the index 2 ");
    int ind2 = sc.nextInt();

    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();
    // Swap the characters
    char temp = chars1[ind1];
    chars1[ind1] = chars2[ind2];
    chars2[ind2] = temp;

    String swapped1 = new String(chars1);
    String swapped2 = new String(chars2);
    System.out.println("After swapping: " + swapped1);
    System.out.println("After swapping: " + swapped2);
    sc.close();
}
}