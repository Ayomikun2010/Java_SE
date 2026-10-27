package fundamentals.start;

public class PatternProgramming {
    public static void main(String[] args){
        int nVariable = 9;
        for (int i=0; i<nVariable; i++){
            for (int j=0; j<nVariable; j++) {
                if (((i==0 || i==(nVariable-1)/2) && j>0 && j<nVariable-1) ||
                        (j==0 && i > 0) || j==nVariable-1 && i>0) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
//       int printA()

}
//  int printA()
