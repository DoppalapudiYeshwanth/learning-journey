public class Patterns {
    public static void main(String[] args) {
        // printPy1();
        patternInvertedStar(4);
    }
    public static void patternSquare(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i);
            }
        System.out.println();
        }
    }
    public static void patternStar(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void patternInvertedStar(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternHalfPyramid(int n){
        for(int i=0;i<=n;i++){
            
        }
    }
    }

