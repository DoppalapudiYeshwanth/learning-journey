import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {
        // int[][] arr = {
        //                  {1, 2, 3, 4},
        //                     {5, 6, 7, 8},
        //                         {9, 10, 11, 12},
        //                                      {13, 14, 15, 16}
        //                 };
        // int [][] arr1={{1,2,3},{2,3,4},{4,5,6},{13, 14, 15}};
        // _sampleArray();
        // spiralPrint(arr, 4, 4);
        // diagSumOp2(arr);
        // int []arr3={1,2,3};
        // System.out.println(arr.length);
        // search(arr, 16);
        // searchOpM2(arr,15);
        // printSum(arr);
        int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};

        transpose(arr);

    }
    public static void _sampleArray(){
        int [][] teacher= new int[2][2];
        for(int i=0;i<teacher.length;i++){
            for(int j=0;j<teacher.length;j++){
                Scanner sc=new Scanner(System.in);
                teacher[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<teacher.length;i++){
            for(int j=0;j<teacher.length;j++){
                System.out.print(teacher[i][j]+" ,  ");
            }
            System.out.println();
        }
    }
    public static void spiralPrint(int arr[][],int n, int m){
        int srow=0; int scol=0; int erow=n-1; int ecol=m-1;

        while(srow<=erow && scol<=ecol){//for odd matrix we use <= 
        //top
        for(int i=srow;i<=ecol;i++){
            System.out.print(arr[srow][i]+" ,");
        }
        //right
        for(int j=srow+1;j<=erow;j++){
            System.out.print(arr[j][ecol]+" ,");
        }
        //bottom
        for(int i=ecol-1;i>=scol;i--){
            if(srow==erow){
                break;
            }
            System.out.print(arr[erow][i]+" ,");
        }
        //left
        for(int j=erow-1;j>=srow+1;j--){
             if(scol==ecol){
                break;
            }
            System.out.print(arr[j][scol]+" '");
        }
        srow++;
        scol++;
        erow--;
        ecol--;
    }
    System.out.println();
        }
    public static void diagSum(int[][]arr){
        int primDiag=0;
        // int []common=new int[1000];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    primDiag+=arr[i][j];
                }
            }
        }
        System.out.println(primDiag);
        int secDiag=0;
        for(int i=arr.length-1;i>=0;){
            for(int j=0;j<arr.length;j++){
             secDiag+=arr[i][j];
             i--;
            }
        }
        System.out.println(secDiag);
        int diagSum=primDiag+secDiag;
        System.out.println("The diagonal sum is "+diagSum);
    }
    public static void diagSumOp(int [][]arr){
        int primDiag=0;
        int secDiag=0;
        int diagSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                primDiag+=arr[i][j];
                }
                else if(j==arr.length-i-1){
                secDiag+=arr[i][j];
                }
            }
        }
        System.out.println("The diagonal sum is "+diagSum);
    }
     public static void diagSumOp2(int [][]arr){
        int diagSum=0;
        for(int i=0;i<arr.length;i++){
            diagSum+=arr[i][i];
            if(i!=arr.length-i-1){
            diagSum+=arr[i][arr.length-i-1];
            }
        }
        System.out.println("The diagonal sum is "+diagSum);
     }
     public static void search(int [][]arr,int num){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==num){
                System.out.println("Found a the index "+"{"+i+","+j+"}");
                }
            }
        }
     }
    public static void searchOp(int [][]arr,int num){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==num){
                System.out.println("Found a the index "+"{"+i+","+j+"}");
                break;
            }
            else if(arr[i][j]>num){
                j--;
            }   
            else if(arr[i][j]<num){
                i++;
            }
        }
    }
    public static void searchOpM2(int [][]arr,int num){
        int j=0;
        int i=arr.length-1;
        while(j<arr.length && i>=0){
            if(arr[i][j]==num){
                System.out.println("Found a the index "+"{"+i+","+j+"}");
                break;
            }
            else if(arr[i][j]>num){
                i--;
            }   
            else if(arr[i][j]<num){
                j++;
            }
        }
    }
    public static void printSum(int [][]arr){
        int i=1;
        int j=0;
        int sum=0;
        while(i<=1 && j<arr.length){
        sum+=arr[i][j];
        j++;
        }
        System.out.println("The sum od second row "+sum);

    }
    public static void transpose(int [][]arr){
        int [][]temp=new int[3][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                temp[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(temp[i][j]+" ,");
            }
        System.out.println(" ");
        }
    }
    }

