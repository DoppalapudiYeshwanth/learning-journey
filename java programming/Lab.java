class Lab {
    public static void main(String[] args) {
        // casestudy1();
        // studentDiscount();
        // discountCheck();
        // cafeGs();
        // printSquare();
        // hollowSphere();
        // pyramid();
        // inversePyramid();
        // diamondPattern();
        // bill();
        ludo();
        // int num1 = 121;
        // System.out.println(num1 + " is Palindrome? " + isPalindrome(num1));

        // int num2 = 153;
        // System.out.println(num2 + " is Armstrong? " + isArmstrong(num2));

        // int num3 = 29;
        // System.out.println(num3 + " is Prime? " + isPrime(num3));

        // int num4 = 5;
        // System.out.println("Factorial of " + num4 + " = " + factorial(num4));

        // fibonacci(10);

        // String str1 = "madam";
        // System.out.println(str1 + " is String Palindrome? " + isPalindromeString(str1));
        // reverseString("hello");
        // isPalindromeString("malayalam");
        }
    public static void casestudy1(){
        int choice = 2;
        System.out.println("Welcome to yeshwanth's cafe");
        System.out.println("1.Pizza - ₹250");
        System.out.println("2.Burger - ₹150");
        System.out.println("3.SWandwitch - ₹120");
        System.out.println("4.Coffee - ₹80");
        System.out.println("5.Exit");
        System.out.println("Please enter your choice: " + choice);
        switch (choice) {
            case 1:
            System.out.println("You selected: Pizza\n Price:₹250");
            break;
            case 2:
            System.out.println("You selected: Burger\n Price:₹150");
            break;
            case 3:
            System.out.println("You selected: Sandwitch\n Price:₹120");
            break;
            case 4:
            System.out.println("You selected: Coffee\n Price:₹80");
            break;
            case 5:
            System.out.println("You selected: Exit");
            break;
    }
    }
    public static void studentDiscount(){
        String name = "Doppalapudi Yeshwanth";
        int age = 20;
        String items = "Coffee, Sandwich, Pasta";
        double bill = 120 + 250 + 300;   // total of items
        String student = "Yes";         // change to "No" to test

        if (student.equalsIgnoreCase("Yes")) {
            bill = bill - (bill * 0.10);   // 10% discount
            System.out.println("Student discount applied.");
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Items: " + items);
        System.out.println("Final Bill: ₹" + bill);
    }
    public static void discountCheck(){
        double bill = 120 + 250 + 300;   // Example: Coffee + Sandwich + Pasta
        boolean isStudent = true;        // change to false if not a student

        if (isStudent) {
            if (bill >= 250) {
                double discounted = bill - (bill * 0.10);
                System.out.println("Discount applied. Final Bill: ₹" + discounted);
            } else {
                double gap = 250 - bill;
                System.out.println("Add ₹" + gap + " more to get student discount.");
            }
        } else {
            System.out.println("No discount applied. Final Bill: ₹" + bill);
        }
    }
public static void cafeGs(){
    double billAmount = 200;
    double gstRate = 0.18;
    double gstAmount = billAmount * gstRate;
    double finalAmount = billAmount + gstAmount;
    System.out.println("Original Bill Amount : ₹"+billAmount);
    System.out.println("GST @18% : "+gstAmount);
    System.out.println("Final Bill (including GST): ₹"+finalAmount);
}
public static void printSquare(){
    int size = 4; 

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

}
public static void hollowSphere(){
    int n = 4;
    for( int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
public static void pyramid(){
    int n = 5;
        for (int i = 1; i <= n; i++) {
          for (int space = 1; space <= n - i; space++){
            System.out.print(" ");
          }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
public static void inversePyramid(){
    int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
}
public static void diamondPattern(){
    int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
}
}
public static void bill(){
int age = 18;
double price = 16.75;
char range ='E';
String name ="Doppalapudi Yeshwanth";
System.out.println("Name:" + name);
System.out.println("Age:" + age);
System.out.println("Price of item ordered:"+price);
System.out.println("range: " +range);
}
public static void ludo(){
        int rows = 15, cols = 15;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                if ((i >= 1 && i <= 6 && j >= 1 && j <= 6) ||
                    (i >= 1 && i <= 6 && j >= 10 && j <= 15) ||
                    (i >= 10 && i <= 15 && j >= 1 && j <= 6) ||
                    (i >= 10 && i <= 15 && j >= 10 && j <= 15)
                    ) {
                    System.out.print("  ");
                }


                else if (j == 8 && i >= 2 && i <= 6) {
                    System.out.print("G ");
                }

                else if (i == 8 && j >= 2 && j <= 6) {
                    System.out.print("R ");
                }

                else if (j == 8 && i >= 10 && i <= 14) {
                    System.out.print("Y ");
                }

                else if (i == 8 && j >= 10 && j <= 14) {
                    System.out.print("B ");
                }

                else if ((i == 2 && j == 9) || (i == 3 && j == 7) ||
                         (i == 7 && j == 2) || (i == 9 && j == 3) ||
                         (i == 7 && j == 13) || (i == 9 && j == 14) ||
                         (i == 13 && j == 9) || (i == 14 && j == 7)) {
                    System.out.print("* ");
                }
                else if (i == 7 && j == 7) {
                     System.out.print("╲ ");
                }
                else if (i == 9 && j == 9) {
                     System.out.print("╲ ");
                    }
                else if (i == 7 && j == 9) {
                    System.out.print("╱ ");
                }
                else if (i == 9 && j == 7) {
                    System.out.print("╱ ");
                }
                else if ((i == 7 && j == 8) || (i == 9 && j == 8) ||
                        (i == 8 && j == 7) || (i == 8 && j == 9)) {
                    System.out.print(" ");
                }
                else if (i == 8 && j == 8) {
                    System.out.print(""); // center diamond
                }

                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
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
        if (arr1[i]%2!= 0 && arr1[i]!= 0||arr1[i]==1) {
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
}
    // 1. Check if a number is Palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    // 2. Check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        // Count digits without using String functions
        int digits = 0, temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Calculate sum of powers of digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;

            // calculate digit^digits manually
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        return original == sum;
    }
    // 3. Check if a number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 4. Factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // 5. Fibonacci Series up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 6. Reverse a String
    public static void reverseString(String str) {
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
        }
        System.out.println(result);
    }

    // 7. Check if a String is Palindrome
    public static void isPalindromeString(String str) {
        String apply = "";
        for(int i=str.length()-1;i>=0;i--){
            char compare = str.charAt(i);
            apply =apply+compare;
        }
        if(apply.equals(str)){
            System.out.println("This is palindrome ");
        }
        else{
            System.out.println("Not a palindrome");
        }
}

}