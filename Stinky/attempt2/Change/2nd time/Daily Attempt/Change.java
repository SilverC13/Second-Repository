import java.util.Scanner;

class Change
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	System.out.println("Hello Welcome to change calculator");
	System.out.println("Enter the amount of money you have below and this program will breka it down into change for you.");
	System.out.print("£");
	double Money = UserInput.nextDouble();
	double TwoPoundCoins = 2.0;
	double OnePoundCoins = 1.0;
	double FiftyPenceCoins = 0.5;
	double TwentyPenceCoins = 0.2;
	double TenPenceCoins = 10;
	double FivePenceCoins = 5;
	double TwoPenceCoins = 2;
	double OnePenceCoins = 1;
	
	System.out.println("Your Change:");
	
	System.out.print("Two Pound Coins: ");
	int Two = ((int)(Money/TwoPoundCoins));
	System.out.println(Two);
	
	System.out.print("One Pount Coins: ");
	int One = ((int)((Money-(Two*2))/OnePoundCoins));
	System.out.println(One);
	
	double ForPennys = (Money-(Two*2)-(One*1));

	
	System.out.print("Fifty Pence Coins: ");
	int Fifty = ((int)(ForPennys/FiftyPenceCoins));
	System.out.println(Fifty);
	
	System.out.print("Twenty Pence Coins: ");
	int Twenty = ((int)((ForPennys-(Fifty*0.5))/TwentyPenceCoins));
	System.out.println(Twenty);

	int ForOtherPennys = ( (int)( Math.round(Money*100))-((Two*100)*2)-(One*100)*1-(Fifty*50)-(Twenty*20) );

	System.out.print("Ten Pence Coins: ");
	int Ten = ( (int) (ForOtherPennys/TenPenceCoins) );
	System.out.println(Ten);

	System.out.print("Five Pence Coins: ");
	int Five = ( (int) ((ForOtherPennys-(Ten*10))/FivePenceCoins) );
	System.out.println(Five);

	System.out.print("Two Pence Coins: ");
	int TwoPence = ( (int) ( (ForOtherPennys-((Ten*10)+(Five*5)))/TwoPenceCoins) );
	System.out.println(TwoPence);

	System.out.print("One Pence Coins: ");
	int OnePence = ( (int) ( (ForOtherPennys-((Ten*10)+(Five*5)+(TwoPence*2)))/OnePenceCoins) );
	System.out.println(OnePence);
	


/*int Fifty = ((int)(Money-(int)Money)/FiftyPenceCoins); 
/*get it so that you are dividing by whats left over: take away the input value by a integer version of the input, then divide that by 0.5*/
	//System.out.println(Fifty);
	// create a new variable, get it so its just the decimal part. times that out so its no longer decimal, may need to adjust the value of FiftyPenceCoins
	}
}
