class ListSymbols
{
	enum Symbol { cherry, lemon, kumquat, rutabaga }
	public static void main (String args[])
	{
		for ( Symbol leftReel : Symbol.values() )
		{
			for ( Symbol middleReel : Symbol.values() )
			{
				for ( Symbol rightReel : Symbol.values() )
				{
					System.out.print(leftReel);
					System.out.print(" ");
					System.out.print(middleReel);
					System.out.print(" ");
					System.out.println(rightReel);
					try
					{
						Thread.sleep(0000);
					} 
					catch (InterruptedException ie)
					{
						ie.printStackTrace();
					}
				}
			}
		}
	}
}
