import java.util.Scanner;

class While
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Type 0 if you dare");
	int counter;
	counter = UserInput.nextInt();
	while (counter < 10)
	{
	System.out.println(counter);
	counter++;
	}
	}
}
