package src.mainSweeper;

import java.util.Scanner;
import java.util.Random;
public class mineSweeper {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int mines = scanner.nextInt();

        while(mines!=10)
        {
            Random random = new Random();
            int i = random.nextInt(10);
            int j = random.nextInt(10);
            System.out.println("i: " + i + " j: " + j);

            mines++;
        }


//        System.out.println(".X.......");
//        System.out.println(".....X..X");
//        System.out.println("....X....");
//        System.out.println("......X..");
//        System.out.println("..X......");
//        System.out.println("....X....");
//        System.out.println("..X......");
//        System.out.println("..X......");
//        System.out.println("......X..");
    }
}
