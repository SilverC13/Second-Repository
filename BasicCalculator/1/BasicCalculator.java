import java.util.Scanner;

class BasicCalculator
{
	public static void main (String args [])
	{
		Scanner UserInput = new Scanner(System.in);
		int x = 1;

		do
		{
			double FirstNumber = 0;
			double SecondNumber = 0;
			double Answer = 0;

			String message = "Enter First Number:\n";
			prompt(message);
			String line = null;
			while (line == null)
			{
				line = UserInput.nextLine();
				try
				{
					FirstNumber = Double.valueOf(line);
					break;
				}
				catch (NumberFormatException e)
				{
					prompt("Expected numeric value, not: ''" + line + "'', please try again\n");
					line = null;
					prompt(message);
				}
			}

			String message2 =("Enter Second Number:\n");
			prompt(message2);
			String line2 = null;
			while (line2 == null)
			{
				line2 = UserInput.nextLine();
				try
				{
					SecondNumber = Double.valueOf(line2);
					break;
				}
				catch (NumberFormatException e)
				{
					prompt("Expected numeric value, not: ''" + line2 + "'', please try again\n");
					line2 = null;
					prompt(message2);
				}
			}

			System.out.println("Answer");
			Answer = FirstNumber + SecondNumber;
			System.out.println(Answer);
			System.out.println("Do you want to play again?");
			Reply = UserInput.findWithinHorizon(".", 0).charAt(0);
			
			//if no x = 2
			private static void prompt(String message)
			{
				System.out.print(message);
			}
		}
		while (x=2);
	}
}	

