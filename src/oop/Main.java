package oop;

public class Main {

    public static void main(){
        Student student = new Student();

        student.setName("Tunji");
        String name = student.getName();
        System.out.println(name);

        student.setAge(20);
        int age = student.getAge();
        System.out.println(age);

        student.setSchool("Ibadan Grammer");
        String school = student.getSchool();
        System.out.println(school);
    }
}
