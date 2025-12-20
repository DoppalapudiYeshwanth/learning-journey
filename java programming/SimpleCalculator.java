import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the seconnd number:");
        int num2=sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch(operator) {
            case '+':
                result =num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case'/':
                if(num2!=0){
                    result=num1/num2;
                }else{
                    System.out.println("Number can be divisible by zero");
                }
                break;
        }
        System.out.println("The result is: "+result);
    }
}
