import java.lang.classfile.attribute.SourceIDAttribute;
import java.math.BigInteger;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static int secondLargest(int []arr){
        int i =0;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            i++;
        }
        return arr[1];
    }
    public static boolean linearSearch(int []arr,int target){

        // for(int i =0 ;i<arr.length;i++){
        //     if(arr[i]==target){
        //         return i;
        //     }
        //     }
        //     return -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
        }
    public static int linearSearchString(String org,String target){
        for(int i =0;i<org.length();i++){
            if(String.valueOf(org.charAt(i)).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public static int minimun(int[]arr){
        int variable = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<variable){
                variable = arr[i];
            }
        }
        return variable;
    }
    public static int occuTarget(int []arr, int target){
        int count = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static int[] reverseArray(int []arr,int start,int end){
        while(start<end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    
        return arr;
}
public static int[] reverseArrayIndex(int []arr){
        Scanner sc =new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(end>arr.length){
            System.out.println("The end is too large to fit in array");
        }
        while(start<=end){
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
}
public static int[] reverseArrayWithoutNew(int arr[]){
    int arrNew []= new int[arr.length];
    for(int i =0;i<arrNew.length;i++){
        arrNew[i]=arr[i];
    }
        int start = 0;
        int end = arrNew.length-1;
        while(start<=end){
            int temp =arrNew[start];
            arrNew[start]= arrNew[end];
            arrNew[end]=temp;
            start++;
            end--;
        }
        return arrNew;
}
public static boolean checkPalindrome(int[]arr){
    int start = 0;
    int end = arr.length;
    boolean result = true;
    while(start<=end){
        if(arr[start]==arr[end]){
            result= true;
        }
        else{
            result= false;
        }
    }
    return result;

}
public static int[] shiftarray(int[]arr){
    int key = 3;
    key = key%arr.length;
    reverseArray(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
    reverseArray(arr,0,key-1);
    System.out.println(Arrays.toString(arr));
    reverseArray(arr,key, arr.length-1);
    System.out.println(Arrays.toString(arr));

    return arr;
}
public static int binerySearch(int[]arr){
    int start = 0;
    int end = arr.length-1;
    int mid = (start+end)/2;
    int key =3;
    if(arr[mid]==key){
        return mid;
    }
    else if(arr[mid]>key){
        end = mid-1;
    }
    else if(arr[mid]<key){
        start =mid+1;
    }
    return -1;
}
public static int firstOcuBinery(int[]arr){
    int start = 0;
    int end = arr.length-1;
    int mid = (start+end)/2;
    int key =3;
    int  result= 0;
    if(arr[mid]==key){
        result =mid;
        end =mid-1;
    }
    else if(arr[mid]>key){
        end = mid-1;
    }
    else if(arr[mid]<key){
        start =mid+1;
    }
    return result;
}
public static void printSubArray(int []arr){
    for(int start = 0; start<arr.length;start++){
        for(int end = start;end<arr.length;end++){
            for(int k = start;k<=end;k++){
                System.out.print(arr[k]);
            }
            System.out.print(",");
        }
        System.out.println();
    }
}
public static void printSubArrayMax(int[]arr){
    int maxSum = Integer.MIN_VALUE;
    for(int start =0;start<arr.length;start++){
        for(int end = start;end<arr.length;end++){
            int sum = 0;
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]);
                sum+=arr[k];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        System.out.print(",");
        }
        System.out.println();
    }
    System.out.println(maxSum);
}
public static void cafeSetUp(){
    System.out.println("Welcome to the Yeshwanth's Cafe");
    Scanner sc =new Scanner(System.in);
    System.out.println("Please enter your name : ");
    String name = sc.nextLine();
    System.out.println("Please Confirm that are you a Student or Not");
    boolean isStudent = sc.nextBoolean();
    System.out.println("Please Select the item your are carving for, we'll get that in minutes");
    System.out.println("Menu of our cafe\n1. burger\n2. Pizza\n3. Dosa\n4. cakes");
    String inputChoice = sc.next();
    inputChoice.toLowerCase();
    System.out.println("Please enter the quantity of "+inputChoice+" Also let us know if you want anything else");
    int quantityItem  = sc.nextInt();
    double itemPrice = 0;
    switch (inputChoice) {
        case "burger":
            System.out.println("Price of the Burger : $ 150 \nWe will get your "+quantityItem+" burgers in 5 minutes, please enjoy your meal");
            itemPrice = 150*quantityItem;
            break;
        case "pizza":
            System.out.println("Price of the Pizza : $ 170 \nWe will get your "+quantityItem+" pizzas in 5 minutes, please enjoy your meal");
            itemPrice = 170*quantityItem;
            break;
        case "dosa":
            System.out.println("Price of the Dosa : $ 110 \nWe will get your "+quantityItem+" Dosas in 5 minutes, please enjoy your meal");
            itemPrice = 110*quantityItem;
            break;
    
        default:
            System.out.println("Sorry for the inconveince, we don't have that ");
            break;
    }
    billPrint(itemPrice,isStudent,inputChoice,name);
}
public static void billPrint(double itemPrice,boolean isStudent,String inputChoice,String name){
    Scanner sc =new Scanner(System.in);
        double amount = 0;
        if(isStudent){
            amount = (itemPrice - 0.1*itemPrice) + 1.8*itemPrice;
            System.out.println("Student Discount of 25% applied");
        }
        else{
            amount = itemPrice+1.8*itemPrice;
            System.out.println("Not eligible for student discount");
        }
        System.out.println("Bill is been printed : ");
        System.out.println("Name of the customer : "+name);
        System.out.println("Item Selected : "+inputChoice);
        System.out.println("Student : "+isStudent);
        System.out.println("Total amount : "+amount);
        System.out.println("Give your FeeBack please : ");
        String feedBack = sc.nextLine();
        System.out.println("Thank you visit again.");
}
public static int kadaneAlgo(int[]arr){
    int maxSum = Integer.MIN_VALUE;
    for(int start = 0;start<arr.length;start++){
        int sum =0;
        for(int end=start;end<arr.length;end++){
            sum+=arr[end];
        }
        if(sum>maxSum){
            maxSum= sum;
        }
    }
    return maxSum;
}
public static int MaxSub(int[]arr){
    int maxSum = Integer.MIN_VALUE;
    for(int start=0;start<arr.length;start++){
        for(int end = start;end<arr.length;end++){
            int sum = 0;
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]);
                sum+=arr[k];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        System.out.print(",");
        }
    System.out.println();
    }
    return maxSum;
}
public static int MaxSubEqualsToK(int[]arr,int key){
    int count = 0;
    for(int start=0;start<arr.length;start++){
        for(int end = start;end<arr.length;end++){
            int sum = 0;
            for(int k=start;k<=end;k++){
                System.out.print(arr[k]);
                sum+=arr[k];
            }
            if(sum>=key){
                count++;
            }
        System.out.print(",");
        }
    System.out.println();
    }
    return count;
}
public static int buyAndSell(int []arr){
        int maxProfit = 0;
        for(int i =0;i<arr.length;i++){
            int profit = 0;
            for(int j=i+1;j<arr.length;j++){
                profit = arr[j]-arr[i];
                if(profit>maxProfit){
                maxProfit = profit;
            }
            }
        }
        return maxProfit;
    }
public static int buySellStockOp(int[]arr){
    int maxProfit = 0;
    int minPrice = arr[0];
    for(int i= 1;i<arr.length;i++){
        int profit = arr[i]-minPrice;
        if(profit>maxProfit){
            maxProfit = profit;
        }
        if(arr[i]<minPrice){
            minPrice = arr[i];
        }
    }
    return maxProfit;
}
public static void trappingWater(){
    
}
public static void bubbleSort(int[]arr){
    for(int i = 0;i<arr.length-1;i++){
        for(int j =0;j<arr.length-1-i;j++){
            
        }
    }
}



    public static void main(String[]args){
        int []arr ={2,3,1,2,4,3};
        
        // System.out.println(secondLargest(arr));
        // System.out.println(linearSearch(arr, 7));
        // String org = "hello";
        // System.out.println(linearSearchString(org,"o"));
        // System.out.println(minimun(arr));
        // int result[] = reverseArrayWithoutNew(arr);
        // for(int i =0;i<result.length;i++){
        //     System.out.print(result[i]);
        // }
        // 
        // System.out.println(firstOcuBinery(arr));
        // printSubArray(arr);
        // printSubArrayMax(arr);
        // System.out.println(kadaneAlgo(arr));
        // System.out.println(MaxSubEqualsToK(arr,7));
        // System.out.println(buySellStockOp(arr));
        cafeSetUp();
    }
}
