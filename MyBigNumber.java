    
public class MyBigNumber{

    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    public static String sum2num(String s1, String s2) {
        int str1 = s1.length(); 
        int str2 = s2.length();
        int max = str1;
        String result = "";
        if (str1 > str2) { // lay gia tri max sau khi so sanh do dai 2 chuoi
            max = str1;
        } else {
            max = str2;
        }

        int gtd = 0; //bien gia tri du
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
			
            int sum1_2 = temp2 + temp1 + gtd; //tong 2 ki tu duoc lay ra
            
            if (vtc1 > 0) { 
                result += (sum1_2 % 10);
            } else {        //khi tro ve ki tu cuoi cung cua chuoi
                result += sum1_2;
            }
            gtd = sum1_2 / 10;
        }
        StringBuffer stringBuffer = new StringBuffer(result);
	String resultrv =  stringBuffer.reverse().toString();
	
	
        return resultrv;
        
    }
}