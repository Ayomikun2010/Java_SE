package java_assignment;

import java.util.Scanner;

public class IntegerReaderWithoutMathmax {
    public static void main(String[] args){
        Scanner collect = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = collect.nextInt();
        System.out.println("Enter second number");
        int secondNum = collect.nextInt();
        System.out.println("Enter third number");
        int thirdNum = collect.nextInt();
        collect.close();

//        Without Math.max
        if (firstNum >= secondNum){
            int largestNum = firstNum;
        } else if (firstNum >= thirdNum){
            int largestNum = firstNum;
        } else if (secondNum >= firstNum){
            int largestNum = secondNum;
        } else if (secondNum >= thirdNum){
            int largestNum = secondNum;
        } else {
           int largestNum = thirdNum;
        }
        System.out.print();
        collect.close();

    }





//        int num1 = 2;
//        int num2 = 5;
//        int num3 = 3;
//        if (num1 >= 5){
//            System.out.println(num1);
//        } else if (num2 >= 5){
//            System.out.println(num2);
//        } else if (num3 >= 5){
//            System.out.println(num3);
//
//
//            Launch launch = new Launch()
//            launch.play();
//
//
//        }
//    }
}


//
//public void play(){
//    Scanner enter =
//
//}