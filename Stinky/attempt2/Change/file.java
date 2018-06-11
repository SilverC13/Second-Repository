import java.util.Scanner;

class file
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Welcome to Make Change!");
	System.out.println("This program helps you figure out how many coins you'll get from coins");
	System.out.println("How much money do you have");
	System.out.print("£");
	double Money = UserInput.nextInt();
	double FivePence = Money/5;
	double TenPence = Money/10;
	double TwentyPence = Money/20;
	double FiftyPence = Money/50;
	int TotalFivePence = (int) (FivePence * 100);
	System.out.print("Five Pence: ");
	System.out.println(TotalFivePence);  


	}
}
