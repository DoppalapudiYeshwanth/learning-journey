import java.util.Vector;

public class DivideAndConquer {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        // mergeSort(arr, 0, arr.length-1);
        // printArr(arr);
        // quickSort(arr, 0, arr.length-1);
        // printArr(arr);
        System.out.println(rotatedArrayBs(arr, 0, 6,1));
    }
    public static void mergeSort(int []arr,int str,int end){
        if(str>=end){
            return ;
        }
        int mid = (str + end)/2; // same formula for big integers si + (ei -si)/2
        mergeSort(arr, str, mid); // left
        mergeSort(arr, mid+1, end); // right
        merge(arr, str, end, mid);
    }
    public static void merge(int []arr,int str,int end,int mid){
        Vector<Integer> temp = new Vector<>();
        int i = str;
        int j = mid + 1;
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
                i++;
        }
        while(j<=end){
            temp.add(arr[j]);
                j++;
        }
        for(int index = str ,x=0;index <=end;index++){
            arr[index]=temp.get(x++);
        }
    }
    public static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void quickSort(int []arr,int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr,si,pivotIdx-1);
        quickSort(arr, pivotIdx+1, ei);
    }
    public static int partition(int[]arr,int si,int ei){
        int pivotIdx = arr[ei];
        int obtainedPivotIdx = 0;
        int i=si-1;
            for(int j=si;j<ei;j++){
                if(arr[j]<=pivotIdx){
                    i++;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            i++;
            int temp = arr[ei];
            arr[ei] = arr[i];
            arr[i]=temp;
            obtainedPivotIdx = i;
        
    
        return obtainedPivotIdx;
    }
    public static int rotatedArrayBs(int []arr,int si,int ei,int tar){
        if(si>ei){
            return -1;
        }
        int mid = si +(ei -si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return rotatedArrayBs(arr, si, mid-1, tar);
            }
            else{
                return rotatedArrayBs(arr, mid+1, ei, tar);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return rotatedArrayBs(arr, mid+1, ei, tar);
            }
            else{
                return rotatedArrayBs(arr, si, mid-1, tar);
            }
        }
    }
    }
    

