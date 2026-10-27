package java_assignment;

import java.util.Scanner;

public class LoopInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n = input.nextInt();
        int formular = n * (n+1) / 2;
        System.out.println(formular);
        input.close();



    }
}
