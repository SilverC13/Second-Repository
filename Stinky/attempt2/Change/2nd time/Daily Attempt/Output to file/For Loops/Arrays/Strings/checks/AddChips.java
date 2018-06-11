import java.util.Scanner;
import static java.lang.System.out;

class AddChips
{
	public static void main (String args[])
	{
		Scanner UserInput = new Scanner (System.in);
		String reply;
		int numberOfChips;
		out.print("How many chips do you have?");
		out.print("  (Type a number,");
		out.print("  or type 'Not playing') ");
		reply = UserInput.nextLine();

		if (!reply.equals("Not playing"))
		{
			numberOfChips = Integer.parseInt(reply);
			numberOfChips += 10;

			out.print("You now have ");
			out.print(numberOfChips);
			out.println(" chips.");
		}
		else
		{
			System.out.println("Fine, no chips for you");
		}
		UserInput.close();
	}
}
