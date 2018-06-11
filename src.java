import java.util.Scanner;

class src
{
	public static void main (String args [])
	{
		Scanner UserInput = new Scanner(System.in);
		MethodsInParameters Meth = new MethodsInParameters ();

		System.out.println("Enter your name here: ");
		String name = UserInput.nextLine();

		Meth.simpleMessage(name);
	}
}
