import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer>vec=new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        // for(int i=0;i<5;i++){
        //     vec.add(i);
        // }
        // for(int i=0;i<vec.size();i++){
        //     System.out.print(vec.get(i)+",");
        // }
        // vectorsMemo();
        // pairSum2(vec);
        // _2DVectors();
        duplicateNum();
    }
    public static void vectorsMemo(){
       Vector<Integer> vec=new Vector<>(2);
       vec.add(10);
       vec.add(10);
       System.out.println(vec);
       System.out.println(vec.capacity());
       vec.add(30);
       System.out.println(vec);
       System.out.println(vec.capacity());
    }
    public static void pairSum(Vector<Integer>vec){
        int target=6;
        for(int i=0;i<vec.size();i++){
            for(int j=0;j<vec.size();j++){
                int found=vec.get(i)+vec.get(j);
                if(target==found){
                    System.out.println("Found at index"+i+","+j);
                }
            }
        }
    }
    public static void pairSum2(Vector<Integer>vec){
    int target=6;
    int start=0;
    int end=vec.size()-1;
    while(start<end){
    int found=vec.get(start)+vec.get(end);
    if(found==target){
         System.out.println("Found at index"+start+","+end);
         break;
    }
    else if(found>target){
         end--;
    }
    else{
         start++;
    }
    }
    }
    public static void _2DVectors(){
        Vector<Vector<Integer>> vec=new Vector<>();
        Vector<Integer> row0=new Vector<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);
        vec.add(row0);
        Vector<Integer> row1=new Vector<>();
        row1.add(5);
        row1.add(4);
        row1.add(5);
        vec.add(row1);
        for(int i=0;i<vec.size();i++){
            for(int j=0;j<vec.get(i).size();j++){
                System.out.print(vec.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void duplicateNum(){
        Vector<Integer> vec=new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(2);
        vec.add(4);
        vec.add(5);
        int start=0;
        int end=start+1;
        while(start<end && end<vec.size()){
        if(vec.get(start)==vec.get(end)){
        System.out.print(vec.get(start)+" ");
        System.out.print(vec.get(end)+1);
        }
        start++;
        end++;
        }
    }
    public static void duplicateSum2(){
        
    }
}
