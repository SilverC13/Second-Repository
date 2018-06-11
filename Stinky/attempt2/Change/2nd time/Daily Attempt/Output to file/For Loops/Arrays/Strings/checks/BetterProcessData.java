import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

class BetterProcessData
{
	public static void main (String args[])
	{
		Scanner UserInput = new Scanner (System.in);
		UserInput.useLocale(Locale.FRANCE);
		double amount;
		boolean taxable;
		double total;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String niceTotal;

		System.out.print("Amount: ");
		amount = UserInput.nextDouble();
		System.out.print("Taxable? (true/false) ");
		taxable = UserInput.nextBoolean();

		if (taxable)
		{
			total = amount * 1.05;
		}
		else
		{
			total = amount;
		}

		niceTotal = currency.format(total);
		System.out.print("Total: ");
		System.out.println(niceTotal);

		UserInput.close();
	}
}
