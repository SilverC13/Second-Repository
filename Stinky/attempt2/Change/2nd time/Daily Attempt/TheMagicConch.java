import java.util.Scanner;
import java.util.Random;

class TheMagicConch
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	Random myRandom = new Random();
	int randomNumber;

	System.out.print("Oh Magic Conch Shell... ");
	UserInput.nextLine();

	randomNumber = myRandom.nextInt(10) + 1;

	System.out.println("The Magic Conch says: ");
	switch (randomNumber)
		{
		case 1: System.out.println("Yes. Isn't it obvious?");
			break;

		case 2: System.out.println("No, and don't ask again.");
			break;

		case 3: System.out.print("Yessir, yessir!");
			System.out.println(" Three bags full.");
			break;

		case 4: System.out.print("What part of 'no'");
			System.out.println(" don't you understand?");
			break;
		
		case 5: System.out.println("No chance, Lance.");
			break;

		case 6: System.out.println("Sure, whatever.");
			break;

		case 7: System.out.print("Yes, but only if");
			System.out.println(" you're nice to me.");
			break;
		
		case 8: System.out.println("Yes (as if I care).");
			break;

		case 9: System.out.print("No, not until");
			System.out.println(" Cromwell seizes Dover.");

		case 10: System.out.print("No, not until");
			 System.out.println(" Nell Squeezes Rover.");
			 break;

		default: System.out.println("You think you have problems?");
			 System.out.println("My random number generator is broken!");
			 break;
		}
	System.out.println("The Magic Conch Shell has spoken.");
	}
}
