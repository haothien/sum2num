/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhhth
 */
import java.util.Scanner;

public class MyBigMain {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBigMain main = new MyBigMain();
        MyBigNumber num = new MyBigNumber();

        System.out.print("Nhập số đầu: ");
        String str1 = scanner.next();

        System.out.print("Nhập số thứ hai: ");
        String str2 = scanner.next();

        System.out.println("Kết quả phép cộng là " + num.sum2num(str1, str2));
    }

    public void sendStep(String str) {
        System.out.println(str);
    }
}
