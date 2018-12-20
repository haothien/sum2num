
public class MyBigNumber {

    public String sum(String s1, String s2) {
        
        int str1 = s1.length();
        int str2 = s2.length();
        int max = str1;
        int sum1_2 = 0;
        String loi = "";// chuoi dung de bao loi
        String result = "";// chuoi luu ket qua tam thoi
        String fresult = "";// chuoi luu ket qua cuoi cung
        String step = "";// chuoi luu cac buoc cua phep tinh
        int rem = 0;// bien luu ki tu so nho se duoc them vao tiep theo
        try {
            if (!s1.matches("^[0-9]+$") || !s2.matches("^[0-9]+$")) {

                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            loi = " Khong nhap ki tu , chu cai , so am \n Vui long nhap lai ! ";

        }
        
        if (str1 > str2) { // lay gia tri max sau khi so sanh do dai 2 chuoi
            max = str1;
        } else {
            max = str2;
        }

        int gtd = 0; //bien gia tri du(so nho)
        for (int i = 0; i < max; i++) {
            int vtc1 = str1 - i - 1;//vi tri cuoi cung cua chuoi so 1,2
            int vtc2 = str2 - i - 1;
            char digit1 = '0';//bien luu ki tu khi duoc lay ra 
            char digit2 = '0';
            if (vtc1 >= 0) {
                digit1 = s1.charAt(vtc1); //Lay ki tu cuoi day gan vao bien digit1
            }
            if (vtc2 >= 0) {
                digit2 = s2.charAt(vtc2); //Lay ki tu cuoi day gan vao bien digit2
            }

            int temp1 = digit1 - '0';
            int temp2 = digit2 - '0';

            sum1_2 = temp2 + temp1; //tong 2 ki tu duoc lay ra
            int write = (sum1_2 + rem) % 10;
            if (sum1_2 < 9) {
                gtd = sum1_2 / 10;

            }
            if (max == 1) {
                step += "\n" + " Lay " + temp1 + " cong voi " + temp2
                        + " bang " + sum1_2 + "\n";
            } else if (i != 0) {
                step += "\n" + " Buoc " + (i + 1) + ":\n" + " Lay " + temp1
                        + " cong voi " + temp2
                        + " duoc " + sum1_2 + "\n"
                        + " Cong them so nho " + rem
                        + " ta duoc " + (sum1_2 + rem) + " \n "
                        + " Ghi " + write
                        + " nho " + gtd + "\n";

            } else {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + temp1
                        + " cong " + temp2
                        + " duoc " + sum1_2 + "\n"
                        + "Ghi " + write
                        + " nho " + gtd + "\n";
            }
            rem = sum1_2 / 10;
            result = write + result;
        }
        if (gtd != 0) {
            result = gtd + result;
        }
        if (loi.equals("")) {
            fresult = result;
            System.out.println(step);
            
        } else {
            fresult = "ERROR";
            System.out.println(loi);
            
        }
        return fresult;
    }
}
