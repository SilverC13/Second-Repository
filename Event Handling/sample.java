import java.util.*;

class sample
{
	public static void main (String[] args)
	{
		Scanner UserInput = new Scanner(System.in);
		int x = 1;

		do
		{
			try
			{
				System.out.println("Enter first num: ");
				int n1 = UserInput.nextInt();
				System.out.println("Enter second num: ");
				int n2 = UserInput.nextInt();
				int sum = n1/n2;
				System.out.println(sum);
				x = 2;
			}
			catch (Exception e)
			{
				System.out.println("You can't do that");
				System.out.println("Please try again");
			}
		}
		while (x==1);
	}
}
