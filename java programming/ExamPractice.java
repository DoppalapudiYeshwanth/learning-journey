public class ExamPractice{
    public static void main(String[] args) {
        // printSquare();
        // hollowSphere();
        // ludo();
        // printVowels("hlloaE");
        int []arr = {1,1,3,3,1,2,2,8};
        // lonelyPrint(arr);
            pyramid();
        // inversepyramid();
        // diamondPattern();
        // palindrome("malayalam");
        // printTarget(8,arr);
    }
    public static void studentDiscount(){
        boolean isStudent = true;
        double billAmount = 260;
        if(isStudent){
            if(billAmount>=250){
                billAmount = billAmount - (billAmount*0.10);
            }
            else{
                double gapAmt = 250 - billAmount;
                System.out.println("Please buy the gap amount "+ gapAmt);
            }
        }
        else{
            System.out.println("No student is applied");
        }
    }
    public static void cafeBill(){
        System.out.println("The total bill amount is (gst included )");
        double billAmt = 200;
        double finalAmt = billAmt + (billAmt*0.18);
        System.out.println(finalAmt);
    }
    public static void printSquare(){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void hollowSphere(){
        int n = 4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||i==n||j==0||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    public static void ludo(){
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if((i <= 1 && j <= 1) || 
                    (i <= 1 && j >= 4) || 
                    (i >= 4 && j <= 1) || 
                    (i >= 4 && j >= 4)){
                    System.out.print(" ");
                }
                else if(i==2||i==3||j==2||j==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
    public static void printVowels(String str){
        String apply = str.toLowerCase();
        int count = 0;
        for(int i=0;i<apply.length();i++){
            char ch = apply.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
                System.out.println(ch);
            }
        }
        System.out.println(count);
    }
    public static void lonelyPrint(int []arr){
        boolean isLonely = false;
        int [] count = new int[100];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==0||count[i]%2==0){
                isLonely = false;
            }
            else{
                isLonely = true;
                System.out.println("Lonely pair found "+i);
            }
        }
    }
    public static void pyramid(){
        for(int i=0;i<=5;i++){
            for(int spaces = 0;spaces<5-i;spaces++){
                System.out.print(" ");
            }
            for(int star=0;star<i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inversepyramid(){
        for(int i=5;i>=1;i--){
            for(int spaces = 0;spaces<5-i;spaces++){
                System.out.print(" ");
            }
            for(int star=0;star<i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void diamondPattern(){
        int n =5;
        for(int i=0;i<=n;i++){
            for(int spaces = 0;spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int star = 0;star<i;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=n-1;j>0;j--){
            for(int spaces =0;spaces<n-j;spaces++){
                System.out.print(" ");
            }
            for(int star=0;star<j;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void palindrome(String str){
        String apply = str.toLowerCase();
        String reverse ="";
        for(int i=apply.length()-1;i>=0;i--){
            char ch = apply.charAt(i);
            reverse= reverse+ch;
        }
        if(apply.equals(reverse)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("no");
        }
    }
    public static void printTarget(int target,int[]arr){
        int start = 0;
        int end = arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("Found at index "+ mid);
                return;
            }
            else if(arr[mid]>target){
              end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                System.out.println("Not found");
                return;
            }
        }
    }
}