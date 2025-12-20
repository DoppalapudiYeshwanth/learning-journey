

public class DP {
    public static void main(String[]args){


    }
    public static int countNum(int num){
        int count = 0;
         while(num!=0){
            count++;
            num = num / 10;
         }   
         System.out.println("Count of digits: " + count);
            return count;
}
    static void swapNum(int a, int b){
        a= a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    static void nonRepeat(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        System.out.println("Non-repeating element: " + xor);
    }
    static void reverseNum(int num){
        int reversed = 0;
        while(num==0){
            int digit= num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
    static void palindrameCheck(int num){
        int org=num;
        int reversed = 0;
        while(num!=0){
            int digit = num % 10;
            reversed = reversed * 10 + (num % 10);
            num = num / 10;
        }
        if(org == reversed){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
    static void amstrongNum(int num1){
        int org=num1;
        int sum=0;
        int count=countNum(num1);
        while(num1!=0){
            sum=sum + (int)Math.pow(num1 % 10, count);
            num1 = num1 / 10;
        }
        if(org == sum){
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
    static void printDivisor(int n){
        for(int i=0;i<=n;i++){
            if(n%i==0){
                System.out.println("Divisor: " + i);
            }
        }
    }
     static void gcd(int a, int b) {
    int gcd = 1;

    for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
    }

    System.out.println("Greatest Common Divisor: " + gcd);
}
static void lcm(int a, int b) {

        int max = Math.max(a, b);
        int lcm = max;

        // keep checking until lcm is divisible by both
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break; // found the LCM
            }
            lcm++;
        }

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    static void primeCheck(int num){
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }
    static void primeSieve(int n) {
        int N = 50; // we want primes from 1 to 50

        // Step 1: Create an array to mark prime numbers
        boolean[] isPrime = new boolean[N + 1];

        // Step 2: Assume all numbers are prime for now
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Step 3: Start from 2 and cross out its multiples
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                // Cross out all multiples of i (start from i*i)
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // mark as not prime
                }
            }
        }

        // Step 4: Print all numbers that are still marked prime
        System.out.println("Prime numbers from 1 to " + N + " are:");
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
    
    static void PrimeFactors() {
        int n = 60;

        System.out.print("Prime factors of " + n + ": ");
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n); // last remaining prime
        }
    }

     static void SumOfDigits() {
        int n = 1234;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // get last digit
            n = n / 10;     // remove last digit
        }

        System.out.println("Sum of digits: " + sum);
    }

     static void CountSetBits() {
        int n = 13;
        int count = 0;

        while (n > 0) {
            count += n & 1; // check last bit
            n = n >> 1;     // shift right
        }

        System.out.println("Number of set bits: " + count);
    }
}

    
