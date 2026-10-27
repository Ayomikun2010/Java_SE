package fundamentals.datatypes;

import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Launch {

    public static void main(String[] args){
//        byte num0 = 12;
//        short num1 = 23;
//        int num2 = 24;
//        /*float num3 = 25*/;
//        long num4 = 26L;
//        float num5 = 2.0F;
//        double num6 = 3.090876;
//        char var1 = 'C';
//        boolean isTrue = false;
//
//        System.out.println(num5);
//
//
//
//        byte num7 = 125;
//        byte num8 = 127;
//        num7 + num8
//                65536;

        //Typecasting and truncation
//        narrow
       double price = 99.99;
       int troncatedPrice = (int) 99.99;
       System.out.println(price);
       System.out.println(troncatedPrice);

//      int big = 130;
//      byte small = (byte) 130;
//      System.out.println(big);
//      System.out.println(small);

//
//       int big = 71;
//       byte small = (byte) 71;
//       System.out.println(big);
//       System.out.println(small);

//        int a = 5;
//        int b = 2;
//        double wrong = a/b;
//        int c = a/b;
//        double right = (double) a/b;
//        System.out.println(a/b);
//        System.out.println(c);
//        System.out.println(right);


        byte a = (byte) -130;
        double b = 675586467;
        System.out.println(a);
        System.out.println(b);

//        Relational Operators
        int num1 = 7;
        int isEven = num1 % 2;
        System.out.println(isEven);

//         Addition
        int num2 = 3;
        int oddNum = num2 + 2;
        System.out.println(oddNum);

//        Substraction
        int num3 = 6;
        int evenNum = num3 - 3;
        System.out.println(evenNum);

//        Division
        int num4 = 6;
        int oddnum2 = num4 / 2;
        System.out.println(oddnum2);

//        Greater than
        int num5 = 6;
        if (num5 > 5){
            System.out.println("greater");
        } else {
            System.out.println("lesser");
        }

//        Less than
        int num6 = 5;
        if (num6 < 10){
            System.out.println("less than");
        } else {
            System.out.println("greater than");
        }

//        Condition Statement
        int num8 = 52;
        int secondNum = 125;
        int thirdNum = 99;
        if (secondNum > thirdNum){
            System.out.println(secondNum + " is greater than " + thirdNum);
        } else if (thirdNum > num8) {
            System.out.println(thirdNum + " is greater than " + num8);
        }

//        Mulipilcation
        int num7 = 10;
        int evenNum2 = num7 * 10;
        System.out.println(evenNum2);

//        OR and AND
        int num9 = 657;
        int number1 = 34;
        if (number1 < num9 && num9 > number1){
            System.out.println(num9 + " is greater than " + number1);
        }

        int num10 = 345;
        int number2 = 221;
        if (num10 > number2 || number2 > num10){
            System.out.println(num10 + " is greater than " + number2);
        } else {
            System.out.println(number2 + " is not greater than " + num10);
        }

//         Loops
        int count = 1;
        for (count = 1; count <= 10; count++){
            System.out.println("Hello Samuel");
        }

//        Preincrement and Postincrement
        int num11 = 2434;
        System.out.println(++num11);

        int num12 = 4564;
        System.out.println(num12++);
        System.out.println(num12);



//



        // ternary operator

        String val = num6 > 10 ? " Num6 i greater than 20" : "Num6 is not greater than 10";
        System.out.print(val);

        // switch statement

        String val2 = switch (num6){
            case 10-> "num is "+ 10;
            case 9 -> "num is "+ 9;
            case 8 -> "num is "+ 8;
            case 7 -> "num is "+ 7;
            case 6 -> "num is "+ 6;
            case 5 -> "num is "+ 5;
            case 4 -> "num is "+ 4;
            case 3 -> "num is "+ 3;
            case 2 -> "num is "+ 2;
            case 1 -> "num is "+ 1;
            default -> " num is "+ num6;
        };

        System.out.println("The value for num6 is "+ val2);


        // User Console Input ==> Scanner Class

//        Scanner scanner = new Scanner(System.in);
//
//        String valCollected = scanner.nextLine();
//
//        System.out.println("The value passes is " + valCollected);
//        scanner.close();

        Launch launch = new Launch();
        launch.play();
    }

    public void play(){
        Scanner collector = new Scanner(System.in);
        System.out.println("Enter student name");
        String playerName = collector.nextLine();
        System.out.println("Hello "+ playerName + " enter your score");
        int playerScore = collector.nextInt();
        System.out.println("Congratulations "+ playerName + ", your score is "+ playerScore);
        collector.close();




    }
}
