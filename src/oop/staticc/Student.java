package oop.staticc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    static int numberOfStudent;
    List<String> whoAccessed = new ArrayList<>();

    Student(){
        System.out.println("Zero Parameterized constructor in Student init");
        numberOfStudent++;
    }
    Student(String name){
        System.out.println("Parameterized constructor in Student init with name");
        this.name = name;
        numberOfStudent++;
    }

    private String whoAreYou(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say your Name: ");
        String name = scanner.nextLine();
        whoAccessed.add(name);
        return name;
    }

    public void setName(){
        String name = whoAreYou();
        setName(name);
    }

    public String getName(){
//        String name = whoAreYou();
        return getName(name);
    }
    private void setName(String name){
        this.name = name;
    }
    private String getName(String name){
        return this.name;
    }

    public int getTotalStudent(){
        return numberOfStudent;
    }
}
