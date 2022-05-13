package src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson_9 {
    public static void main(String[] args) {

        long[] longNumbers = new long [3];

        longNumbers [0] = 100000000001L;
        longNumbers [1] = 100000000002L;
        longNumbers [2] = 100000000003L;

        /*String str = Arrays.toString(longNumbers);*/
        System.out.println(Arrays.toString(longNumbers));
    }
}
