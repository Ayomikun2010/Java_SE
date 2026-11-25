package oop.constructor;

import fundamentals.start.Person;

public class Employer {

    private int id;
    private String name;
    private int salary;
    private int age;

    Employer(){
        System.out.println("Zero Parameterized constructor");

    }
    Employer(String name, int salary){
        this.name = name;
        this.salary = salary;
        System.out.println("Salry and name given with parameterized constructor");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


    Employer(String name){
        name = name;
        System.out.println("this is not zero parameterized, " +
                "rather it is parametrized construct with " + name);
    }

    static void main() {
        Employer emp1 = new Employer();
        Employer emp2 = new Employer("Samuel");
        System.out.println("Name of emp2 :: is :" + emp2.getName());
//        emp2.name = "Jide Babs";
        System.out.println("Name of emp2 is :" + emp2.getName());

    }
}
