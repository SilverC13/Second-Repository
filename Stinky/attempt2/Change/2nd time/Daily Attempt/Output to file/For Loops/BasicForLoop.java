class BasicForLoop
{
	public static void main (String args[])
	{
	for (char c = 'A'; c <= 'F'; c++)
		{
		System.out.println(c);
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie){ie.printStackTrace();}
		}
	}
}
