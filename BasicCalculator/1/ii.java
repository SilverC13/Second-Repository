import java.util.Scanner;

class ii
{
	public static void main (String args[])

{
Scanner UserInput = new Scanner(System.in);
			String Reply;
			String message3 =("Do you want to play again?\n");
			int x2 = 1;
			int x = 1;
			char c;;
			System.out.print(message3);
			
			do
			{
				Reply = UserInput.nextLine();
				
				
					c = Reply.charAt(0);
					if (c == 'Y' || (c == 'y'))
					{
						x2 = 2;
						
					}
					else if (c == 'n' || (c == 'N') )
					{
						x = 2;
					}
					else if ( c != 'Y' || (c !='y') || (c != 'N') || (c != 'n') )
					{	
					System.out.println("Please enter Y for Yes or N for no");
					c = Character.MIN_VALUE;
					Reply = null;
					System.out.print(message3);
					// reset the values
					}
			}
			while (x2 == 1 );
			
}
	
}
//the problem is, it doesn't pick up errors
