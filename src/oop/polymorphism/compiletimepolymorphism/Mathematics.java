package oop.polymorphism.compiletimepolymorphism;

public class Mathematics {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1){
        return 1 + num1;
    }

    public int add(){
        return 20;
    }

    public float add(int num1, float num2){
        return num1+num2;
    }

    public float add(float num1, int num2){
        return num1+num2;
    }

    public float substract(int num1, float num2){
        return num1-num2;
    }

    public double substract(double num1, int num2){
        return num1-num2;
    }

    public double substract(int num1){
        return 5567.3-num1;
    }

    public int substract(int num1, int num2){
        return num1-num2;
    }

    public double substract(double num1, float num2){
        return num1-num2;
    }
}
