
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        /*int[]arr=new int[10];
arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);         
    }
}*/
        // int[]arr={1,2,3,2,5,6,7,8,2,10};
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==2){
        //         System.out.println("Found 2 at index: " + i);
        //     }
        // }
        // Scanner sc=new Scanner(System.in);
        // //input 2D array
        // int[][]arr2=new int[3][3];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         arr2[i][j]=sc.nextInt();
        //     }
        // }
        // //print 2D array
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr2[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // largestArray(10);
        //  int[] arr = {4, 2, 2, 8, 3, 3, 1};
        // System.out.println(arr);
        // System.out.println(Arrays.toString(arr));
        // changeNum(arr);
        // System.out.println(Arrays.toString(arr));
        // linearSea(arr,5);
        // printSubArrayMaxSumKadane(arr);
        // stockBuy(arr);
        // trapWater(arr);
        // countSort(arr);
        char[]arr={'d','r','a','s'};
        insertSortChar(arr);
        
    }
    public static void largestArray(int num){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Correct array printing
        System.out.println("The array is: " + Arrays.toString(arr));

        // Finding the largest element
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("The largest is: " + max);
        System.out.println("The smallest is "+ min);
    }
    public static void changeNum(int[] arr){
        arr[0]=1000;
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }
    public static void linearSea(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("found at "+i);
            }
            else{
                System.out.println("not found at "+i);
            }
        }
    }
    public static void reverseArray(int []arr){
        int []reverse= new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            reverse[j]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArrayNoSpace(int []arr){
        int start=0; int end=arr.length-1;
        while(start<end){
        //    int temp=arr[start];
        //    arr[start]=arr[end];
        //    arr[end]=temp;

        //    arr[start]=arr[start]+arr[end];
        //    arr[end]=arr[start]-arr[end];
        //    arr[start]=arr[start]-arr[end];
              start++;
              end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void binarySearch(int []arr,int num){
        int start=0; int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==num){
            System.out.println("found at "+mid);
            break;
            }
            else if(arr[mid]<num){
             start=mid+1;
            }
            else if(arr[mid]>num){
            end=mid-1;
            }
            }
        }
    public static void printSubArray(int[]arr){
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                // System.out.print("("+start+","+end+")");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
    public static void printSubArrayMaxSum(int[]arr){
        int maxsum=Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                int sum=0;
                for(int k=start;k<=end;k++){
                    sum=sum+arr[k];
                }
                System.out.print(sum);
                System.out.print(",");
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum is "+maxsum);
    }
    public static void printSubArrayMaxSumOp(int[]arr){
         int maxsum=Integer.MIN_VALUE;
        for(int start=0;start<arr.length;start++){
            int sum=0;
            for(int end=start;end<arr.length;end++){
                sum+=arr[end];
                System.out.print(sum);
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum is "+maxsum);
    }
    public static void printSubArrayMaxSumKadane(int[]arr){
         int maxsum=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(maxsum<0){
                    sum=0;
                }
            }
        System.out.println("The max sum is "+maxsum);
    }
    public static void stockBuy(int[]arr){
        int []bestbuy= new int[100000];
        bestbuy[0]=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(bestbuy[i-1]<arr[i-1]){
                bestbuy[i]=bestbuy[i-1];
            }
            else{
                bestbuy[i]=arr[i-1];
            }
            System.out.println("The best price of day= "+i+" is "+bestbuy[i]+",");
        }
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            int currentprofit=arr[i]-bestbuy[i];
            System.out.println("The profit of day= "+i+" "+currentprofit);
            if(currentprofit>maxProfit){
                maxProfit=currentprofit;
            }
        }
        System.out.println("The best time to buy is day:"+maxProfit);
    }
    public static void trapWater(int[]arr){
        int []leftmax=new int[20000];
        int []rightmax=new int[20000];
        leftmax[0]=arr[0];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>leftmax[i-1]){
                leftmax[i]=arr[i];
            }
            else{
                leftmax[i]=leftmax[i-1];
            }
             System.out.println("The left max block is "+leftmax[i]);
        }
            for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>rightmax[i+1]){
                rightmax[i]=arr[i];
            }
            else{
                rightmax[i]=rightmax[i+1];
            }
             System.out.println("The right max block is "+rightmax[i]);
        }
        int waterTrapped=0;
        for(int i=0;i<arr.length;i++){
            int currentWater=Math.min(leftmax[i],rightmax[i])-arr[i];
            if(currentWater>0){
                waterTrapped+=currentWater;
            }
        }
        System.out.println("water trapped"+waterTrapped);
    }
    public static void printDistinct(int []arr){
        Arrays.sort(arr);
        boolean isDup=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
               
            }
            else{
                boolean isDub=false;
            }
        }
    }
    public static void bubbleSort(int []arr){
        boolean isSwap=false;
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            isSwap=false;
            if(arr[j]>arr[j+1]){
                arr[j]=arr[j]+arr[j+1];
                arr[j+1]=arr[j]-arr[j+1];
                arr[j]=arr[j]-arr[j+1];
                isSwap=true;
            }
        }
        if(isSwap==false){
                System.out.println("Given array is a sorted array");
                break;
            }
    }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }
    public static void selectionSort(int[]arr){
        boolean isSwap=false;
        for(int i=0;i<arr.length-1;i++){
            isSwap=false;
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                minIdx=j;
            }
            }
            if (minIdx != i) {
             int temp = arr[i];
             arr[i] = arr[minIdx];
             arr[minIdx] = temp;
             isSwap=true;
            }
            if(isSwap==false){
                System.out.println("Given array is a sorted array");
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }
    public static void countSort(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>count){
                count=arr[i];
            }
        }
        int []freq =new int[count+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int index=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[index]=i;
                index++;
                freq[i]--;
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ,");
        }

    }
    public static void insertSortChar(char []arr){
    for (int i = 1; i < arr.length; i++) {
        char key = arr[i];
        int j=i-1;
       while (j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];  // shift element to the right
              j--;                  // move left
            }
        arr[j + 1] = key;
    }
    for (char ch : arr) {
        System.out.print(ch + " ");
    }
    }
}

    
    
    
    