import java.util.Random;

class StartingPoint
{
	public static void main (String args[])
	{
	Random r = new Random();
	int dice = 0;
	dice = r.nextInt(6) + 1;
	System.out.println("You roll a dice and get " + dice);
	}
}
