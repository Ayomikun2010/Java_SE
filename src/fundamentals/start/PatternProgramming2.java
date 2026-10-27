package fundamentals.start;

public class PatternProgramming2 {
    public static void main(String[] args){
                int nVariable = 9;

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
        }


