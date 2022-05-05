package src;

import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

       /* String result = "No";

        if (a > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/
        String result = a > 0 ? "Yes" : "No";
        System.out.println(result);
    }
}

