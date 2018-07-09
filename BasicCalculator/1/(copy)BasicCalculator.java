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
			System.out.print(message);
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
					System.out.print("Expected numeric value, not: ''" + line + "'', please try again\n");
					line = null;
					System.out.print(message);
				}
			}

			String message2 =("Enter Second Number:\n");
			System.out.print(message2);
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
					System.out.print("Expected numeric value, not: ''" + line2 + "'', please try again\n");
					line2 = null;
					System.out.print(message2);
				}
			}

			System.out.println("Answer");
			Answer = FirstNumber + SecondNumber;
			System.out.println(Answer);
			
			String Reply;
			String message3 =("Do you want to play again?\n");
			int x2 = 1;
			char c;;
			do
			{
				System.out.print(message3);
				Reply = UserInput.nextLine();
				try
				{
					c = Reply.charAt(0);
					if (c == 'Y' || (c == 'y'))
					{
						x2 = 2;
					}
					else if (c == 'n' || (c == 'N') )
					{
						x = 2;
					}
					break;
				}
				catch (Exception e)
				{
					System.out.println("Please enter Y for Yes or N for no");
					c = Character.MIN_VALUE;
					Reply = null;
					System.out.print(message3);
					// reset the values
				}
			}
			while (c != 'Y' || (c != 'y') || (c != 'N') || (c != 'n') );

			
		}
		while (x==1);
		
	}
}	

