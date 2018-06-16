import java.util.Scanner;

class ChangeJarIntermediate
{
	public static void main (String args[])
	{
		//Create the Scanner
		Scanner UserInput = new Scanner(System.in);

		int numberOfPennies = 0;
		int numberOfNickels = 0;
		int numberOfDimes = 0;	
		int numberOfQuarters = 0;

		//Number of Pennies
		String message = "Enter the number of pennies: ";
		prompt(message);
		String line = null;
		while (line == null)
		{
			line = UserInput.nextLine();
			try
			{
				numberOfPennies = Integer.valueOf(line);
				break;
			}
			catch (NumberFormatException e)
			{
				prompt("Expected numeric value, not: '" + line + "', please try again\n");
				line = null;
				prompt(message);
			}
		}
	}
	// Creating my own method for prompt, because prompt is not part of the java API
	private static void prompt(String message)
	{
		System.out.print(message);
	}
}
