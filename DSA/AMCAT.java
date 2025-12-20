import java.util.Arrays;

public class AMCAT {
    public static void reverseString(String str){
            char[] arr = str.toCharArray();
            int start = 0;
            int end = str.length()-1;
            while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;   
            }
            System.out.println(new String(arr));
    }
    public static boolean palindrome(String str){
        boolean isPal = true;
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=(str.charAt(end))){
                isPal = false;
            }
            start++;
            end--;
        }
        return isPal;
    }
    public static void countVowels(String str){
    int countVowel = 0;
    int countConsonants = 0;
    for(int i = 0; i < str.length(); i++){
        char ch = Character.toLowerCase(str.charAt(i));
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            countVowel++;
        }
        else{
            countConsonants++;
        }
    }
    System.out.println("Number of vowels: " + countVowel);
    System.out.println("Number of consonants "+countConsonants);
    }
    public static void removeDuplicate(String str) {
    StringBuilder sb = new StringBuilder();
    boolean[] seen = new boolean[256]; // for ASCII characters
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!seen[c]) {
            sb.append(c); // keep first occurrence
            seen[c] = true;
        }
    }
    System.out.println(sb.toString());
}
    public static boolean anagramCheck(String str1, String str2){
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        
        if(str1.length()!=str2.length()){
            return false;
        }
        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
    public static void largestAndSec(int []arr){
        int firstLar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                if(arr[i]>firstLar){
                    secLar = firstLar;
                    firstLar = arr[i];
                }
                else if(arr[i]>secLar && arr[i]!=firstLar){
                    secLar = arr[i];
                }
        }
        System.out.println("The first largest is "+firstLar);
        System.out.println("The second largest is "+secLar);
    }
    public static void sumOfArray(int []arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of Array "+sum);
    }
    public static void removeDup(int[]arr){
        boolean []visited = new boolean[arr.length];
        for (int i=0;i<arr.length;i++){
            if(!visited[i]){
                System.out.println(arr[i]+",");

                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                    }
                }
            }
        }
    }
    public static void bubbleSort(int[]arr){
        for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1-j;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
        printArray(arr);
    }
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp =arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
    public static int printReapeating(int []arr,int key){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid==key){
                return mid;
            }
            else if(mid>key){
                end = mid-1;
            }
            else if(mid<key){
                start = mid+1;
            }else{
                return -1;
            }
        }
        return -1;
    }
    public static void sum(int[]arr){
        
    }
        public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "amadm";
        int [] arr = {1,3,4,4,2,1,6,2,5};
        // reverseString(str);
        // System.out.println(palindrome(str));
        // countVowels(str);
        // removeDuplicate(str);
        // System.out.println(anagramCheck(str1,str2));
        // largestAndSec(arr);
        // sumOfArray(arr);
        // removeDup(arr);
        // bubbleSort(arr);
        // selectionSort(arr);
        System.out.println(printReapeating(arr,6));
    }
}
