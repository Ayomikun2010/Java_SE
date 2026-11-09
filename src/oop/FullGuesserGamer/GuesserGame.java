package oop.FullGuesserGamer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuesserGame {
    public static void main(){
            Scanner receive = new Scanner(System.in);
            System.out.println("============================");
            System.out.println("WELCOME TO GUESSER GAME");
            System.out.println("============================");
            System.out.println("CREATE PLAYER 1 PROFILE");
            System.out.println("Enter name");
            String firstPlayerName = receive.nextLine();
            System.out.println("Enter age");
            int firstPlayerAge = receive.nextInt();
            System.out.println("Enter gender");
            String firstPlayerGender = receive.nextLine();

            System.out.println("CREATE PLAYER 2 PROFILE");
            System.out.println("Enter name");
            String secondPlayerName = receive.nextLine();
            System.out.println("Enter age");
            int secondPlayerAge = receive.nextInt();
            System.out.println("Enter gender");
            String secondPlayerGender = receive.nextLine();

            // create players profile
        Map<String, Object> firstPlayer = new HashMap<>();
        firstPlayer.put("username1", firstPlayerName);
        firstPlayer.put("userage1", firstPlayerAge);
        firstPlayer.put("usergender1", firstPlayerGender);
//        firstPlayer.put("userguesser", null);
//        firstPlayer.put("userscore", 0);
//        int player1Score = 0;
//        int player1Guess = 0;

        Map<String, Object> secondPlayer = new HashMap<>();
        secondPlayer.put("username2", secondPlayerName);
        secondPlayer.put("userage2", secondPlayerAge);
        secondPlayer.put("usergender2", secondPlayerGender);
//        firstPlayer.put("userguesser2", null);
//        firstPlayer.put("userscore2", 0);
//        int player2Score = 0;
//        int player2Guess = 0;

        int guessNum = (int)(Math.random() * 100) + 1;
        int guess = receive.nextInt();

        System.out.println("Guess a random from 1 to 100");





//        guessNumber();
    }




//
//        public static void guessNumber(){
//            Scanner receive = new Scanner(System.in);
//            System.out.println("============================");
//            System.out.println("WELCOME TO GUESSER GAME");
//            System.out.println("============================");
//            System.out.println("CREATE PLAYER 1 PROFILE");
//            System.out.println("Enter name");
//            String firstPlayerName = receive.nextLine();
//            System.out.println("Enter age");
//            int firstPlayerAge = receive.nextInt();
//            System.out.println("Enter gender");
//            String firstPlayerGender = receive.nextLine();



//
//            System.out.println("Player 2! Enter your age");
//            int secondPlayerAge = receive.nextInt();
//            receive.close();
//
//        System.out.println("Congratulation "+ firstPlayerName + " your details is this:");
//        System.out.println("First name: "+ firstPlayerName);

        }
//
//        public void umpire(){
//            int guessNum = (int)(Math.random() * 100);
//
//            guessNumber();
//        }


