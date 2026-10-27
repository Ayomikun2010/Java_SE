package fundamentals.datatypes;

public class Data {


    public static void main(String[] args){
        byte memCount = (byte) 129;
        int memCount2 = 129;
        System.out.println(memCount);
        System.out.println("This is a int value " + memCount2);

//        int count3 = (int) 5_000_000_000;
        short memCount5 = (short) 65536;
        System.out.println(memCount5);
        System.out.println("This is for short value2 " + memCount5);

        char count4 = 'C';
        System.out.println("This is for char value " + count4);

        float count5 = 1547584749.23f;
        System.out.println("this is for float value " + count5);

        long dist = 840L;
        System.out.println("This is for long value " + dist);

        char val1 = 65;
        System.out.println("The value of char is "+ val1);

        int val2 = 'A';
        System.out.println("The value for int is " + val2);

        double val3 = 12479448712345670983.345d;
        System.out.println("The value for double is " + val3);

    }
}
