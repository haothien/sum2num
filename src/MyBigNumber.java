
/**
 * Sum two string class.
 */
public class MyBigNumber {         // khai bao class MyBigNumber

    private IReceiver receiver;

    public MyBigNumber() {
    }

    public MyBigNumber(final IReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * @param s1 first string number.
     * @param s2 second string number.
     * @return string that have the sum number of these 2 strings.
     *
     *
     */
    public String sum(final String s1, final String s2) {

        int str1 = s1.length();// bien luu do dai chuoi thu 1
        int str2 = s2.length();// bien luu do dai chuoi thu 2

        int sum12 = 0;// bien tong

        String result = "";// chuoi luu ket qua tam thoi
        String step = "";// chuoi luu cac buoc cua phep tinh

        int rem = 0;// bien luu ki tu so nho se duoc them vao tiep theo
        int gtd = 0; // bien luu gia tri du
        int write = 0;// bien nho tam

        int digit1;// bien luu ki tu khi duoc lay ra 
        int digit2;// bien luu ki tu khi duoc lay ra

        char check;// bien check ki tu 
        int max = (str1 > str2) ? str1 : str2;// bien luu gia tri max

        if (s1.contains("-") || s2.contains("-")) {

            throw new NumberFormatException("Chuoi so khong duoc la so am ");
        }

        for (int i = 0; i < max; i++) {
            digit1 = i < str1 ? (s1.charAt(str1 - i - 1) - '0') : 0;  // update va lay ki tu cuoi
            digit2 = i < str2 ? (s2.charAt(str2 - i - 1) - '0') : 0;

            check = i < str1 ? s1.charAt(i) : '0';

            if (!(check >= '0' && check <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (s1.indexOf(check) + 1)
                        + " cua chuoi so thu 1 khong phai la so");
            }

            check = i < str2 ? s2.charAt(i) : '0';

            if (!(check >= '0' && check <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (s2.indexOf(check) + 1)
                        + " cua chuoi so thu 2 khong phai la so");
            }

            sum12 = digit1 + digit2; //tong 2 ki tu duoc lay ra
            write = (sum12 + rem) % 10;
            gtd = sum12 / 10;

            
            if (max == 1) {
                step += "\n" + " Lay " + digit1 + " cong voi " + digit2
                        + " bang " + sum12 + "\n";
            } else if (rem == 0) {
                step += "\n" + " Buoc " + (i + 1) + ":\n" + " Lay " + digit1
                        + " cong voi " + digit2
                        + " duoc " + sum12 + "\n"
                        + " Ghi " + write
                        + " nho " + gtd + "\n";

            } else {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + digit1
                        + " cong " + digit2
                        + " duoc " + sum12 + "\n"
                        + "Cong them so nho " + rem
                        + " ta duoc " + (sum12 + rem) + " \n "
                        + " Ghi " + write
                        + " nho " + gtd + "\n";
            }
            rem = sum12 / 10;
            result = write + result;
        }
        if (gtd != 0) {
            result = gtd + result;
        }
        receiver.sendStep(step);

        return result;
    }
}
