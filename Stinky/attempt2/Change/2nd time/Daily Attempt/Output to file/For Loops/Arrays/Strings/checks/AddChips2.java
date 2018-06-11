import java.util.Scanner;

class AddChips2
{	
	public static boolean isInteger(String s)
	{
		try
		{
			Integer.parseInt(s);
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static void main (String args[])
	{
		Scanner UserInput = new Scanner (System.in);
		String reply;
		int numberOfChips;
		
		//how about if first it checks if the user input is not playing, then 

		do {
		System.out.println("How many chips do you have? (Type a number, or type 'Not playing')");
		reply = UserInput.nextLine();
		}	
			
		
		while  (isInteger(reply) ); //while is not integer and not equal to not playing loop it
		
			if (!reply.equals("Not playing") )
			{
				numberOfChips = reply;
				numberOfChips += 10;

				System.out.print("You now have ");
				System.out.print(numberOfChips);
				System.out.println(" chips.");
			}
		
		else if (reply.equals("Not playing"))	
		{
			System.out.println("Fine, no chips for you");
		}
		else  
		{
			System.out.println("Whaa??");
		}
			

	
		UserInput.close();
	}
}
