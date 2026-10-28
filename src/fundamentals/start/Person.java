package fundamentals.start;

public class Person {

    private String name;
    private int age;

    public static String sayMyName(){
        return "My Name is Ayomikun";
    }

    public String sayMyName2(String name){
        return "The name is " + name;
    }

    public static void main(){
        Person person  = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();


        System.out.println(person.sayMyName2("Jide Kosoko"));

        String persn2 = person2.sayMyName2("Bolatito Fernandez");
        System.out.println(persn2);

        String persn3 = person3.sayMyName2("Jumoke Dairo");
        System.out.println(persn3);

        String persn4 = person4.sayMyName2("Abraham joshua");
        System.out.println(persn4);


//        String Enter_name = ("Samuel");
//        Person person = new Person();
        String name = sayMyName();
        System.out.println(name);
    }
}
