import java.util.Scanner;

class Stinky
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Greetings program!");
	System.out.println("Shall we play a game?");
	String Input = UserInput.nextLine();
	
	if ( Input.equals("Yes") || (Input.equals("Y")) || (Input.equals("y")) || (Input.equals("yes")) )
		{
		System.out.println("STINKY DETECTOR!");
		System.out.println("Enter your name below to find out if you stink");
		String Input2 = UserInput.nextLine();

		if ( Input2.equals("Golden") )
			{
			System.out.println("You do not stink");
			}
		else if ( Input2.equals("Natasha") || (Input2.equals("Tasha")) )
			{
			System.out.println("You stink bitch");
			}
		}
	else if ( Input.equals("No") || (Input.equals("N")) || (Input.equals("n")) || (Input.equals("no")) )
		{
		System.out.println("Okay :( Goodbye!");
		}
	}
}
