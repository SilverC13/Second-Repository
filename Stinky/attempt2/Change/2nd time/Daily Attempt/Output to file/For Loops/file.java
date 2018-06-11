import java.util.Random;

class file
{
	public static void main (String args[])
	{
	Random myRandom = new Random();
	int total = 0;
	int card;	
	while (total < 21)
		{
		card = myRandom.nextInt(10)+1;
		total += card;
		System.out.print(card);
		System.out.print("      ");
		System.out.println(total);
		}
	}
}
