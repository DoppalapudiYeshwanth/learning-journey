
public class VivaTest {
    public static void main(String[] args) {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 9; y++) {
                if ((x == 2 && y == 6) || (x == 1 && y == 8)) {
                    System.out.print(" * ");
                } else if (x > 0 && x <= 5 && y == 7) {
                    System.out.print(" y ");
                } else if (((x == 0 || x == 1) && y == 6)
                        || ((x >= 3 && x <= 5) && y == 6)
                        || (x == 0 && (y == 7 || y == 8))
                        || ((x >= 2 && x <= 5) && y == 8)) {
                    System.out.print(" - ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 15; b++) {
                if ((a == 0 && b == 1) || (a == 0 && b == 12)
                        || (a == 2 && b == 2) || (a == 2 && b == 13)) {
                    System.out.print(" * ");
                } else if ((a == 1 && (b > 0 && b < 6))) {
                    System.out.print(" G ");
                } else if ((a == 1 && (b > 8 && b < 14))) {
                    System.out.print(" R ");
                } else if ((a == 0 && b == 6) || (a == 2 && b == 8)) {
                    System.out.print(" \\ ");
                } else if ((a == 0 && b == 8) || (a == 2 && b == 6)) {
                    System.out.print(" / ");
                } else if (a == 1 && b == 7) {
                    System.out.print(" x ");
                }
                else if (a == 0 && b == 7||((a == 1 && b ==6)||(a == 1 && b == 8))||(a == 2 && b == 7)){
                    System.out.print("   ");
                } 
                else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 9; y++) {
                if ((x == 4 && y == 6) || (x == 3 && y == 8)) {
                    System.out.print(" * ");
                } else if (x >= 0 && x < 5 && y == 7) {
                    System.out.print(" B ");
                } else if (((x >= 0 && x < 4) && (y == 6)) || (x == 5 && y == 6) || (x == 5 && y == 7)
                        || ((x >= 0 && x < 3) && (y == 8)) || ((x == 4 || x == 5) && (y == 8))) {
                    System.out.print(" - ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
