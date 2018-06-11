import java.util.Scanner;

class tab
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	char symbol = ' ';

	while (symbol != '@')
		{
		symbol = UserInput.findWithinHorizon(".",0) .charAt(0);
		System.out.print(symbol);
		}
	System.out.println();
	UserInput.close();
	}
}
