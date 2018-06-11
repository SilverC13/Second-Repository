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
	double FiftyPence = 0.5;
	double PoundCoin = 1;
	double TwopoundCoin = 2;
	int TotalTwopoundCoin = (int) (Money/TwopoundCoin) ;
	double gecko = TotalTwopoundCoin*TwopoundCoin;
	double pie = Money-gecko;
	System.out.print("Two Pound Coins: ");
	System.out.println(TotalTwopoundCoin);  
	int TotalPoundCoin = (int) (pie/PoundCoin) ; 
	System.out.print("One Pount Coins: ");
	System.out.println(TotalPoundCoin);

// Do the rest of the coins, then divide by the largest coin firt, then divide that answer by the 2nd largest coin and so on. Might need to use if statements?
// times the answer so it equals back out to the starting amount and take away from the 
	}
}
