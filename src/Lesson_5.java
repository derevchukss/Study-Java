package src;
import java.util.Scanner;
public class Lesson_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Al");

        //String str = scanner.nextLine();

        //int age = scanner.nextInt();

        //int n = scanner.nextInt();

        //System.out.println("hy, my name is " + str);

        //System.out.println("I'm " + age + " years old");

        //System.out.println(((n+1)*n+2)*n+3);

        int a =  scanner.nextInt();

        int b =  scanner.nextInt();

        int c =  scanner.nextInt();

        boolean ab = a+b < 20;
        boolean bc = b+c < 20;

        System.out.println(a+b==20||a+c==20||b+c==20);
    }
}



