package java_assignment;

import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        guessANumber();

    }

    public static void guessANumber() {
        Scanner collectVal = new Scanner(System.in);
        System.out.print("Guess a number from 1 to 10");
        int number = collectVal.nextInt();
        int randomNumber = (int) (Math.random() * 10);
        if (number == randomNumber) {
            System.out.println("Congratulation you won");
        } else {
            System.out.println("Wrong");
            System.out.println("The correct number is " + randomNumber);
        }
//        if(number==Math.floor(Math.random())){
//            System.out.print("Congratulation you won");
//        } else {
//            System.out.print("Wrong please try again")
//            System.out.print("The correct number is " + number")
//        }

    }
}

