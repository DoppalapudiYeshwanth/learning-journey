public class BackTracking {
    public static void main(String[] args) {
        int arr[] = new int [5];
        // backTrack(arr,0);
        // printArr(arr);
        String str = "abc";
        String subset = "";
        // System.out.println(str.length());
        subSets(str, subset);
    }
    public static void backTrack(int[]arr,int i){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=i+1;
        backTrack(arr, i+1);
        arr[i]-=2;
    }
    public static void printArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void subSets(String str,String subset){
        if(str.length()==0){
            System.out.println(subset);
            return;
        }
        char ch = str.charAt(0);
        subSets(str.substring(1,str.length()), subset+ch); //yes condition
        subSets(str.substring(1, str.length()), subset);
    }
}
