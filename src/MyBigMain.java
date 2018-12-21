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

public class MyBigMain implements IObserver{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBigMain myBigMain = new MyBigMain();
        MyBigNumber num = new MyBigNumber( myBigMain);

        System.out.print("Nhap so dau: ");
        String str1 = scanner.next();

        System.out.print("Nhap so thu hai: ");
        String str2 = scanner.next();

        System.out.println("Ket qua phep cong " + num.sum(str1, str2));
    }
    public void sendStep(String str) {
        System.out.println(str);
    }

}
