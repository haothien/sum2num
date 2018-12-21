
/**
 * Sum two string class.
 */
public class MyBigNumber {         // khai bao class MyBigNumber

    /**
     * Sum two string function.
     */
    public String sum(final String s1, final String s2) {

        int str1 = s1.length();// bien luu do dai chuoi thu 1
        int str2 = s2.length();// bien luu do dai chuoi thu 2
        int max = str1;// bien luu gia tri max
        int sum12 = 0;// bien tong
        int check = 0;// bien check loi
        String loi = "";// chuoi dung de bao loi
        String result = "";// chuoi luu ket qua tam thoi
        String fresult = "";// chuoi luu ket qua cuoi cung
        String step = "";// chuoi luu cac buoc cua phep tinh
        int rem = 0;// bien luu ki tu so nho se duoc them vao tiep theo
        int gtd = 0; // bien gia tri du(so nho)
        int temp1 = 0;// bien tam 1
        int temp2 = 0;// bien tam 2
        int write = 0;// bien nho
        int vtc1 = 0;// vi tri cuoi cung cua chuoi so 1
        int vtc2 = 0;// vi tri cuoi cung cua chuoi so 2
        char digit1 = '0';// bien luu ki tu khi duoc lay ra 
        char digit2 = '0';// bien luu ki tu khi duoc lay ra
        try {
            if (!s1.matches("^[0-9]+$") || !s2.matches("^[0-9]+$")) {

                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            check = 1;
            loi = " Khong nhap ki tu , chu cai , so am \n Vui long nhap lai ! ";

        }

        if (str1 > str2) { // lay gia tri max sau khi so sanh do dai 2 chuoi
            max = str1;
        } else {
            max = str2;
        }

        for (int i = 0; i < max; i++) {
            vtc1 = str1 - i - 1;
            vtc2 = str2 - i - 1;

            if (vtc1 >= 0) {
                digit1 = s1.charAt(vtc1); //Lay ki tu cuoi day gan vao bien digit1
            }
            if (vtc2 >= 0) {
                digit2 = s2.charAt(vtc2); //Lay ki tu cuoi day gan vao bien digit2
            }

            temp1 = digit1 - '0';
            temp2 = digit2 - '0';

            sum12 = temp2 + temp1; //tong 2 ki tu duoc lay ra
            write = (sum12 + rem) % 10;
            if (sum12 < 9) {
                gtd = sum12 / 10;

            }
            if (max == 1) {
                step += "\n" + " Lay " + temp1 + " cong voi " + temp2
                        + " bang " + sum12 + "\n";
            } else if (i != 0) {
                step += "\n" + " Buoc " + (i + 1) + ":\n" + " Lay " + temp1
                        + " cong voi " + temp2
                        + " duoc " + sum12 + "\n"
                        + " Cong them so nho " + rem
                        + " ta duoc " + (sum12 + rem) + " \n "
                        + " Ghi " + write
                        + " nho " + gtd + "\n";

            } else {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + temp1
                        + " cong " + temp2
                        + " duoc " + sum12 + "\n"
                        + "Ghi " + write
                        + " nho " + gtd + "\n";
            }
            rem = sum12 / 10;
            result = write + result;
        }
        if (gtd != 0) {
            result = gtd + result;
        }
        if (check == 0) {
            fresult = step + "\n" + " Ta duoc ket qua la " + result;

        } else {
            fresult = "ERROR" + "\n" + loi;

        }

        return fresult;
    }
}
