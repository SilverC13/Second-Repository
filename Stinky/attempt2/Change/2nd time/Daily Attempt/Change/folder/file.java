import java.util.Scanner;

class file 
{
	public static void main (String args[])
	{
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Type something");
		String TypedSomething = UserInput.nextLine();
		UserInput.close();
		System.out.println("Type something again");
		String TypedSomethign2 = UserInput.nextLine();
	}
}
