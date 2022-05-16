package src.lessons;


import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;



public class Main {
    static String dayOfWeek = "Monday";

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        char c1 = '\u0000';

        byte b = 12;
        short s = 300;
        int i = 33333;
        long l = 5555555l;
        float f = 44.4f;
        double d = 4.5;
        char c = 'a';
        boolean b1 = true;

        byte b11 = 1;
        short s1 = b11;
        short s11 = 223;
        int i11 = s11;
        int i12 = 3333;
        long l11 = i12;
        long l12 = 2222l;
        float f11 = l12;
        float f12 = 22.2f;
        double d11 = f12;

        double d13 = 33.3;
        float f13 = (float) d13;
        float f14 = 333.4f;
        long l14 = (long) f14 ;
        long l15 = 333l;
        int i14 = (int) l15;

        System.out.println(one + " " + two + " " + three + " " + four + " " + five);
        System.out.println(c1);
        System.out.println(b + "\n" + s + "\n" + i + "\n" + l + "\n" + f + "\n"  + d +  "\n" + c + "\n" + b1);


        String lan = new String("adf");

        String ldan = "afd";


    }
}