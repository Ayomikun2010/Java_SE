package java_assignment;

import java.util.Scanner;

public class IntegerReaderWithMathmax {
    public static void main(String[] args){
//        With Math.max
        Scanner collectVal = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = collectVal.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = collectVal.nextInt();
        System.out.print("Enter the third integer: ");
        int thirdNumber = collectVal.nextInt();
        System.out.print("Enter the fourth integer");
        int forthNumber = collectVal.nextInt();
        System.out.print("Enter the fifth integer");
        int fithNumber = collectVal.nextInt();
        int highestNum = Math.max(firstNumber,Math.max(secondNumber,Math.max(thirdNumber,Math.max(forthNumber,fithNumber))));
        System.out.println("The largest number is: " + highestNum);
        collectVal.close();
    }
}
