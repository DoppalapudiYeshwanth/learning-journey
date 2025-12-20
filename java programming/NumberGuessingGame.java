import java.util.Scanner;
public class NumberGuessingGame{
    public static void main (String[]args){
        System.out.println("Guess the selected number between 20 to 100");
        int selectedNumber = (int)(Math.random()* (100-20+1)+20);
        Scanner sc= new Scanner(System.in);
        int userGuess=sc.nextInt();
        if(userGuess<selectedNumber){
            System.out.println("The number is low");
        }
        else if(userGuess>selectedNumber){
            System.out.println("The number is high");
        }
    }
}
