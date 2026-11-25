package oop.staticc;

public class Main {

    static void main() {
        Student student1 = new Student();
        // Student 1
        student1.setName();
        System.out.println(student1.getName());
        System.out.println(student1.getTotalStudent());
        // Student 2
        Student student2 = new Student("Bola");
        System.out.println(student2.getName());
        System.out.println("total student is: " + student2.getTotalStudent());
        // Student 3
        Student student3 = new Student("shola");
//        student3.setName();
        System.out.println(student3.getName());
        System.out.println("total student is: " + student3.getTotalStudent());
        // Student 4
        Student student4 = new Student("david");
        System.out.println(student4.getName());
        System.out.println("total student is: " + student4.getTotalStudent());

        // total no of students in each object created after all has been created
        System.out.println("Total Number of Student1:");
        System.out.println(student1.getTotalStudent());

        System.out.println("Total Number of Student2:");
        System.out.println(student2.getTotalStudent());

        System.out.println("Total Number of Student3:");
        System.out.println(student3.getTotalStudent());

        System.out.println("Total Number of Student4:");
        System.out.println(student4.getTotalStudent());
    }

}
