package oop.polymorphism.compiletimepolymorphism;

public class Main {
    public static void main(){
        Mathematics maths = new Mathematics();
        System.out.println("maths.add(7, 3) = " + maths.add(7, 3));
        System.out.println("maths.add(7.2f, 3) = " + maths.add(7.2f, 3));
        System.out.println("maths.add(7.2f, 3) = " + maths.add(2, 3.9f));
        System.out.println("maths.add(7.2f, 4) = "+ maths.add(7.2f, 4));

//        Substraction
        System.out.println("math.add()");

    }
}
