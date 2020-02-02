package mas_p1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
	
		try (Scanner op = new Scanner(System.in); )
		  {
			
			System.out.println("To encrypt enter 1 / To decrypt enter 2:");
			int option = op.nextInt();
			
			if(option == 1)
				Encrypter.encrypt();
			
			if(option == 2)
				Decrypter.decrypt();
			
			if(option != 1 && option != 2)
				System.out.println("Sorry, invalid entry!");
				
		  }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
  }
}
