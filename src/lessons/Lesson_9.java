package src.lessons;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt(); // reading a length

        int[] array = new int[len];  // creating an array with the specified length

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
            System.out.println(Arrays.toString(array));
        }
            int sum = 0;
            for (int el : array) {
                System.out.println(el);
                sum += el;
            }
        System.out.println(sum);



//        for (int i = 0; i < len; i++) {
//            array[i] = scanner.nextInt(); // read the next number of the array
//        }
        System.out.println(Arrays.toString(array)); // output the array


//        int[] num = {1, 2, 3, 4, 5, 10, 6};
//        boolean brok = false;
//
//        for (int i = 1; i , num)

//        long[] longNumbers = new long [3];
//
//        longNumbers [0] = 100000000001L;
//        longNumbers [1] = 100000000002L;
//        longNumbers [2] = 100000000003L;
//
//        /*String str = Arrays.toString(longNumbers);*/
//        System.out.println(Arrays.toString(longNumbers));
    }
}
