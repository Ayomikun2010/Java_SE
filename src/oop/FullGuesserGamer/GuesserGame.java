package oop.FullGuesserGamer;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GuesserGamer {
    private int randomNumber;
        public void generateRandomNum(){
            int guessNum = (int)(Math.random() * 100) + 1;
            this.randomNumber = guessNum;
        }
    }

class Player{
    private String name;
    private int score;
    private int guess;
//    Map<String, Object> Details = new HashMap<>();

    public Player(String name){
        this.score = 0;
        this.name = name;
//        Details.put("Name",name);
    }

    public void guessNum(){
        Scanner collect = new Scanner(System.in);
//        System.out.println("welcome to the guessing game");
        System.out.println("Guess a number from 1-100");
        int number = collect.nextInt();
        while (collect.hasNextInt()){
            this.guess = collect.nextInt();
        }
          System.out.print("invalid number pl number");
        collect.next();
        }

        public String getName(){
        return name;
        }

        public int getScore(){
        return score;
        }

        public int getGuess(){
        return guess;
        }

class Umpire{
        private int numFromGuesser;
        private Player player1;
        private Player player2;

        public void Umpire(Player player1){
            this.player1 = player1;
        }

        public Umpire(Player player2){
            this.player2 = player2;
        }

        public void collectNumFromGuesser(GuesserGamer guesser){
            this.numFromGuesser = numFromGuesser;
        }

        public void collectGuessesFromPlayer(Scanner collect){
            player1.guessNum(Scanner collect);
            player2.guessNum();

        }





}




//        class Guesser{
//        private int secretNumber;
//
//
//
//        }


}

//
//    public int playerGuessedNum(){
//        while (playerNum <= ){
//            return playerNum;
//        }


//}

//private


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

//        }
//
//        public void umpire(){
//            int guessNum = (int)(Math.random() * 100);
//
//            guessNumber();

//    public static void main() {
//        Scanner receive = new Scanner(System.in);
//        System.out.println("============================");
//        System.out.println("WELCOME TO GUESSER GAME");
//        System.out.println("============================");
//        System.out.println("CREATE PLAYER 1 PROFILE");
//        System.out.println("Enter name");
//        String firstPlayerName = receive.nextLine();
//        System.out.println("Enter age");
//        int firstPlayerAge = receive.nextInt();
//        System.out.println("Enter gender");
//        String firstPlayerGender = receive.nextLine();

//        System.out.println("CREATE PLAYER 2 PROFILE");
//        System.out.println("Enter name");
//        String secondPlayerName = receive.nextLine();
//        System.out.println("Enter age");Scanner receive = new Scanner(System.in);
//        System.out.println("============================");
//        System.out.println("WELCOME TO GUESSER GAME");
//        System.out.println("============================");
//        System.out.println("CREATE PLAYER 1 PROFILE");
//        System.out.println("Enter name");
//        String firstPlayerName = receive.nextLine();
//        System.out.println("Enter age");
//        int firstPlayerAge = receive.nextInt();
//        System.out.println("Enter gender");
//        String firstPlayerGender = receive.nextLine()
//        int secondPlayerAge = receive.nextInt();
//        System.out.println("Enter gender");
//        String secondPlayerGender = receive.nextLine();
//
//        // create players profile
//        Map<String, Object> firstPlayer = new HashMap<>();
//        firstPlayer.put("username1", firstPlayerName);
//        firstPlayer.put("userage1", firstPlayerAge);
//        firstPlayer.put("usergender1", firstPlayerGender);
//        firstPlayer.put("userguesser", null);
//        firstPlayer.put("userscore", 0);
//        int player1Score = 0;
//        int player1Guess = 0;
//
//        Map<String, Object> secondPlayer = new HashMap<>();
//        secondPlayer.put("username2", secondPlayerName);
//        secondPlayer.put("userage2", secondPlayerAge);
//        secondPlayer.put("usergender2", secondPlayerGender);
//        firstPlayer.put("userguesser2", null);
//        firstPlayer.put("userscore2", 0);
//        int player2Score = 0;
//        int player2Guess = 0;
//
////
////        boolean player1Turn = true;
////        boolean gameOver = false;
//
//        int guessNum = (int) (Math.random() * 100) + 1;
//        System.out.println("Guess a random from 1 to 100");
//        int guess = receive.nextInt();
//
//        if (guess == guessNum) {
//            System.out.println("Correct! you won");
//        } else{
//            System.out.println("Incorrect! please try again");
//
//        }
////
////        while(gameOver == false){
////
////            if(player1Turn == true){
////                System.out.println(firstPlayerName +" it is your turn");
////            } else {
////                System.out.println(secondPlayerName+" it is your turn");
////            }
////            System.out.println("Guess a number");
//
//
////        guessNumber();
//    }


//}