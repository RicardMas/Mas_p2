package mas_p1;

import javax.swing.JOptionPane;

public class Decrypter {

	public static void main(String[] args) {
		decrypt();
	}
	
	public static int decrypt() {
	
		int num, dig1, dig2, dig3, dig4, decrypt;
	    String digits; 
	    
	    do
		{			
			digits = JOptionPane.showInputDialog("Please enter a 4 digit number:");
			num = Integer.parseInt(digits);
		}
	    while(num/10000 != 0 || digits.length() != 4);
 
	    	dig1 = num/1000;
	    	dig2 = num/100%10;
	    	dig3 = num/10%10;
	    	dig4 = num%10;
 
				if(dig1 <= 6 && dig1 >= 0)
					dig1 = dig1 + 10;
				if(dig2 <= 6 && dig2 >= 0)
					dig2 = dig2 + 10;
				if(dig3 <= 6 && dig3 >= 0)
					dig3 = dig3 + 10;
	        	if(dig4 <= 6 && dig4 >= 0)
	        		dig4 = dig4 + 10;
	 
	        dig1 = dig1 - 7;
	        dig2 = dig2 - 7;
	        dig3 = dig3 - 7;
	        dig4 = dig4 - 7;
	 
	        decrypt = dig1;
		     dig1 = dig3;
		     dig3 = decrypt;
	 
		    decrypt = dig2;
		     dig2 = dig4;
		     dig4 = decrypt;
 
			System.out.println("Your decrypted code is: " + dig1 + dig2 + dig3 + dig4);
			return (dig1 + dig2 + dig3 + dig4);

	}

}
