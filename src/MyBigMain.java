/*
 * Main function.
 * 
 * 
 */

/**
 *
 * @author bhhth
 */
import java.util.Scanner;

public class MyBigMain implements IReceiver {

    public static void main(String[] args) {
        /*
         * Main function, take number strings from input
         * 
         * */
        String str1 = "";
        String str2 = "";
        Scanner sc = new Scanner(System.in);
        MyBigMain main = new MyBigMain();
        MyBigNumber num = new MyBigNumber(main);

        try {
            if (args.length > 0) {
                str1 = args[0];
                str2 = args[1];
            } else {
                str1 = "0";
                str2 = "0";
            }
            System.out.println("Ta duoc ket qua : " + num.sum(str1, str2) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    public void sendStep(String step) {
        System.out.println(step);
    }

}
