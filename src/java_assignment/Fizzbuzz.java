package java_assignment;

public class Fizzbuzz {
    public static void main(String[] args) {
        int number = 100;
        int count = 1;
        for (count = 1; count <= number; count++) {
        }
        if (count % 3 == 0 && count % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            if (count % 3 == 0) {
                System.out.println("Fizz");
            } else {
                if (count % 5 == 0) {
                    System.out.println( "Buzz");
                } else {
                    System.out.println(count);
                }
            }
        }
    }
}