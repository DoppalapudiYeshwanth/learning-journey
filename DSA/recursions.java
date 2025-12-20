import java.util.Vector;

public class recursions {
    public static void main(String[] args) {
        // recursion1();
        // int ans=printFact(5);
        // System.out.println(ans);
        // printNum(10);
        // int ans = printFib(5);
        // int []arr = {1,2,4,4,9};
        // System.out.println(arr[arr.length-1]);
        // arrayNum(arr, 3);
        // firstOcu(arr, 5, 0, arr.length-1);
        // System.out.println(lastOcu2(arr, 4, 0));
        // boolean ans = isSorted(arr, arr.length, 0);
        // System.out.println(ans);
        String str = "abbcds";
        String result = "";
        boolean map[]= new boolean[26];
        // removeDup(str,0,result,map);
        // System.out.println(friendsPair(4));
        binaryString(3, 0, result);
    }
    public static void recursion1(){
        System.out.println("hello");
        // recursion1();
    }
    public static int printFact(int num){
        if(num==0){
            return 1;
        }
        return num* printFact(num-1);
        
    }
    public static void printNum(int num){
        if(num==1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printNum(num-1);
        //for ascending order we first call the function and then print
        //for descending order we first print and then call the function
    }
    public static int printSumN(int num){
        if(num==0){
            return 0;
        }
        return num + printSumN(num-1);
        
    }
    public static int printFib(int num){
        if(num==0|| num==1){
            return num;
        }
        return (printFib(num-1) + printFib(num-2));
    }
    public static boolean isSorted(int []arr,int num,int i){
        if(i==num-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, num, i+1);
    }
    public static void arrayNum(int []arr,int num){
        if(num<1){
            return;
        }
        System.out.println(arr[num-1]);
        arrayNum(arr, num-1);
    }
    public static void firstOcu(int[]arr,int key,int start,int end){
        if(start<=end){
        if(arr[start]==key){
            System.out.print("Found at index "+start);
            return;
        }
        else if(arr[end]==key){
            System.out.print("Found at index "+end);
            return;
        }
        else{
            firstOcu(arr, key, start+1, end-1);
        }
        }
        else{
            return;
        }
        
    }
    public static int lastOcu(int [] arr,int key, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOcu(arr, key, i-1);
    }
    public static int lastOcu2(int []arr, int key, int i){
        if(i==arr.length){
            return -1;
        }
        int idxFound= lastOcu2(arr, key, i+1);
        if(idxFound==-1 && arr[i]==key){
            return i;
        }
        return idxFound;
    }
    public static int tilingProb(int n){
        //basecase
        if(n == 0 || n == 1){
            return 1;
        }
        //vertically placed
        int ans1 = tilingProb(n-1);
        //horizontally placed
        int ans2 = tilingProb(n-2);
        return ans1 + ans2;
    }
    public static void removeDup(String str,int i,String result,boolean []map){
        //base case
        if (i == str.length()){
            System.out.println("result :"+ result);
            return;
        }
        char ch = str.charAt(i);
        int mapIdx = ch - 'a';
        if(map[mapIdx]){
            removeDup(str, i + 1,result, map);
        }
        else{
            map[mapIdx]=true;
            removeDup(str, i + 1,result+ch, map);
        }
        
    }
    public static int friendsPair(int n){
        if(n==1||n==2){
            return n;
        }
        return friendsPair(n-1) + (n-1)*friendsPair(n-2);
    }
    public static void binaryString(int n, int lastPlace, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(lastPlace!=1){
            binaryString(n-1, 0, ans+'0');
            binaryString(n-1, 1, ans+'1');
        }
        else{
            binaryString(n-1, 0, ans+'0');
        }
    }
}
// This code will cause a StackOverflowError due to infinite recursion.