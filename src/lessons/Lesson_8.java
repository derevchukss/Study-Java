package src.lessons;
import java.util.Scanner;
public class Lesson_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int max = -999999999;
//        int nr ;
//
//       do {
//            nr=scanner.nextInt();
//            max = nr > max ? nr : max;
//       }while (nr !=0);
//
//        System.out.println(max);

//        int max = 1000;
//        int nr, sum;
//        do {
//            nr=scanner.nextInt();
//            max = nr > max ? nr : max;
//       }while (nr !=0);
//
//        System.out.println(max - 1000);


        int i = scanner.nextInt();
        int sum = i;

        while (i != 0){
            if (sum >= 1000){
                sum -= 1000;
                break;
            }
            i = scanner.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}
