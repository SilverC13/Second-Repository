import java.util.Scanner;

class AreYouOldEnough
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Enter your age below to find out if you're old enough to start learning to drive");
	int Age = UserInput.nextInt();
	boolean Answer;
	Answer = Age >= 18;
	System.out.println(Answer);
	}
}
