package fundamentals.start;

public class PrintingAlphabet {
    public static void printLetterW(int nVariable){
        for (int i=0; i<nVariable; i++){
            for (int j=0; j<nVariable; j++){
                if (j==0 || j==nVariable-1 || i>=(nVariable-1)/2 && j==i-2
                        ||  j == nVariable - 1-(i-2)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }


    }

    public static void printLetterX(int nVariable) {
        for (int i = 0; i < nVariable; i++) {
            for (int j = 0; j < nVariable; j++) {

                if (j == i || j == nVariable - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }

    public static void printLetterY(int nVariable) {

        for (int i = 0; i < nVariable; i++) {
            for (int j = 0; j < nVariable; j++) {

                if ((i <= (nVariable - 1) / 2 &&
                        (j == i || j == nVariable - 1 - i)) ||
                        (i > (nVariable - 1) / 2 &&
                                j == (nVariable - 1) / 2)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void printLetterZ(int nVariable){
        for (int i = 0; i < nVariable; i++) {
            for (int j = 0; j < nVariable; j++) {

                if (i == 0 || i == nVariable - 1 ||
                        j == nVariable - 1 - i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args){
        printLetterW(9);
        printLetterX(9);
        printLetterY(9);
        printLetterZ(9);

    }
}

