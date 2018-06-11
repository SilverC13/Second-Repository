import java.util.Scanner;
import java.util.Random;

class RollEleven
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	Random randomNumber = new Random();
	int dice1 = 0, dice2 = 0;
  
	System.out.println("Tap Enter to begin rolling 2 dice until you get 7 or 11");
	UserInput.nextLine();
	
	while ((dice1 + dice2) != 11 && (dice1 + dice2) != 7 )
		{
			dice1 = randomNumber.nextInt(6)+1;
			dice2 = randomNumber.nextInt(6)+1;
			System.out.print(dice1+" ");
			System.out.println(dice2);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ie){ie.printStackTrace();}
		}
	if (dice1 + dice2 == 7)
		{
		System.out.println("You rolled 7");
		}
	if (dice1 + dice2 == 11)
		{
		System.out.println("You rolled 11");
		}
	}
}
