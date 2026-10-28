package fundamentals.start;

public class PatternProgramming {
    public static void printA(int nVariable) {
//        int nVariable = 9;
        for (int i = 0; i < nVariable; i++) {
            for (int j = 0; j < nVariable; j++) {
                if (((i == 0 || i == (nVariable - 1) / 2) && j > 0 && j < nVariable - 1) ||
                        (j == 0 && i > 0) || j == nVariable - 1 && i > 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void printB(int nVariable){
        for (int i = 0; i < nVariable; i++) {
            for (int j = 0; j < nVariable; j++) {

                if (j == 0 ||
                        (i == 0 || i == nVariable - 1 ||
                                i == (nVariable - 1) / 2) && j < nVariable - 1 ||
                        (j == nVariable - 1 &&
                                (i > 0 && i < (nVariable - 1) / 2 ||
                                        i > (nVariable - 1) / 2 && i < nVariable - 1))) {

                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    public static void main(String[] args){
        printA(9);
        printB(9);
    }
}
