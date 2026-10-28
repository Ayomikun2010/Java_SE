package java_assignment;

import java.util.Scanner;

public class IntegerReaderWithMathmax {
    public static void main(String[] args){
//        mathMax();
        noMathMax();
    }
    public static void mathMax(){
        Scanner collectVal = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = collectVal.nextInt();
        System.out.print("Enter the second integer: ");
        int secondNumber = collectVal.nextInt();
        System.out.print("Enter the third integer: ");
        int thirdNumber = collectVal.nextInt();
        System.out.print("Enter the fourth integer: ");
        int forthNumber = collectVal.nextInt();
        System.out.print("Enter the fifth integer: ");
        int fithNumber = collectVal.nextInt();
        int highestNum = Math.max(firstNumber,Math.max(secondNumber,Math.max(thirdNumber,Math.max(forthNumber,fithNumber))));
        System.out.println("The largest number is: " + highestNum);
        collectVal.close();
    }

    public static void noMathMax(){
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = collect.nextInt();
        System.out.println("Enter second number");
        int secondNum = collect.nextInt();
        System.out.println("Enter third number");
        int thirdNum = collect.nextInt();
        collect.close();

//        if (firstNum >= secondNum){
//            int largestNum = firstNum;
//        } else if (firstNum >= thirdNum){
//            int largestNum = firstNum;
//        } else if (secondNum >= firstNum){
//            int largestNum = secondNum;
//        } else if (secondNum >= thirdNum){
//            int largestNum = secondNum;
//        } else {
//            int largestNum = thirdNum;
//        }
//        System.out.print();
//        collect.close();
    }
}




