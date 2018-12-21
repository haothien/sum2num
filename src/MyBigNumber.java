
/**
 * Sum two string class.
 */
public class MyBigNumber {         // khai bao class MyBigNumber
    private IObserver observer;

    public MyBigNumber() {
    }

    public MyBigNumber(final IObserver observer) {
        this.observer = observer;
    }
    /**
     * Sum two string function.
     */
    public String sum(final String s1, final String s2) {

        int str1 = s1.length();// bien luu do dai chuoi thu 1
        int str2 = s2.length();// bien luu do dai chuoi thu 2
        int max = str1;// bien luu gia tri max
        int sum12 = 0;// bien tong
        
        String result = "";// chuoi luu ket qua tam thoi
        
        String step = "";// chuoi luu cac buoc cua phep tinh
        int rem = 0;// bien luu ki tu so nho se duoc them vao tiep theo
        int gtd = 0; // bien gia tri du(so nho)

        int write = 0;// bien nho

        int digit1;// bien luu ki tu khi duoc lay ra 
        int digit2;// bien luu ki tu khi duoc lay ra
        
            if (!s1.matches("^[0-9]+$") || !s2.matches("^[0-9]+$")) {

                throw new NumberFormatException();
            }
        

        if (str1 > str2) { // lay gia tri max sau khi so sanh do dai 2 chuoi
            max = str1;
        } else {
            max = str2;
        }

        for (int i = 0; i < max; i++) {
            digit1 = i < str1 ? (s1.charAt(str1 - i - 1) - '0') : 0;  // update and get the last digit
            digit2 = i < str2 ? (s2.charAt(str2 - i - 1) - '0') : 0;

            sum12 = digit1 + digit2; //tong 2 ki tu duoc lay ra
            write = (sum12 + rem) % 10;
            if (sum12 < 9) {
                gtd = sum12 / 10;

            }
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
        observer.sendStep(step);

        return result;
    }
}
