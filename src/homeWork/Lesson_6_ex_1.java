package src.homeWork;

import java.util.Scanner;

public class Lesson_6_ex_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();

            if (h >= a && h <=b) {
                System.out.println("Norm");
            }else if (h < a) {
                System.out.println("Deficiency");
            }else {
                System.out.println("Excess");
            }


       /* String result = "No";

        if (a > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/
           /* String result = a > 0 ? "Yes" : "No";
            System.out.println(result);*/


        }
    }

