package mas_p1;

import javax.swing.JOptionPane;

public class Encrypter {

	public static void main(String[] args) { 
		encrypt();
	}
		
		public static int encrypt()
		{
			int num, dig1, dig2, dig3, dig4, encrypt;
		    String digits; 
		    
		    do
			{			
				digits = JOptionPane.showInputDialog("Please enter a 4 digit number:");
				num = Integer.parseInt(digits);
			}
		    while(num/10000 != 0 || digits.length() != 4);
	 
				dig1 = num/1000;
				dig2 = num/100;
				dig3 = num/10;
				dig4 = num/1;
	 
				dig1 = (dig1+7)%10;
				dig2 = (dig2+7)%10;
				dig3 = (dig3+7)%10;
				dig4 = (dig4+7)%10;
	 
				encrypt = dig1;
				dig1 = dig3;
				dig3 = encrypt;
	 
				encrypt = dig2;
				dig2 = dig4;
				dig4 = encrypt;
	 
	 
				System.out.println("Your encrypted code is: " + dig1 + dig2 + dig3 + dig4);
				return (dig1 + dig2 + dig3 + dig4);
				
		  }
	
}


