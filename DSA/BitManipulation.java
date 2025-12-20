public class BitManipulation {
    public static void main(String[] args) {
        // bitWise();
        // oddEven();
        // getI();
        update();
    }
    public static void bitWise(){
       System.out.println(~0);
       System.out.println(~4);
       System.out.println(8>>1);
    }
    public static void oddEven(){
        int n=34;
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void getI(){
        int num=6;int i=2;
        int mask=1<<i;
        if((num&mask)==0){
            System.out.println("The bit at i is 0");
        }
        else{
            System.out.println("the bit at i is 1");
        }
    }
    public static void update(){
        int num=7;
        int i=2;
        int result=num&(~(1<<i));
        System.out.println(result);
    }
}
