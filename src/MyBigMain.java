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

        System.out.print("Nhap so dau: ");
        String str1 = scanner.next();

        System.out.print("Nhap so thu hai: ");
        String str2 = scanner.next();

        System.out.println("Ket qua phep cong la " + num.sum2num(str1, str2));
    }
    

}
