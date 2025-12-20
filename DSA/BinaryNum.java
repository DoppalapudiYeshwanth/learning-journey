import java.math.*;
public class BinaryNum {
    public static void main(String[] args) {
       binToDec(100101);
    }
    public static void binToDec(int binNum){
        int n=binNum;
        int decNum=0;
        int pow=1;
        while(n>0){
            int lasDig=n%10;
            decNum+=lasDig*pow;
            pow*=2;
            n=n/10;
        }
        System.out.println(decNum);
    }
    public static void decToBin(int decNum){
        int n=decNum;
        int binNum=0;
        while(n%2==1){
            
        }
    }
}