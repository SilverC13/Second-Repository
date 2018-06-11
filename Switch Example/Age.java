import java.util.Scanner;

class Age
{
	public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	int UserAge;
	System.out.println("Enter your age below to find out what you are legally allowed to do");
	
	UserAge = UserInput.nextInt();
	switch (UserAge)
		{
		case 5: 
			System.out.println("You can start school");
			break;
		case 12:
			System.out.println("You can watch 12 rated films in the cinema");
			break;
		case 16:
			System.out.println("You can get your first job and start learning to drive");
			break;
		case 18:
			System.out.println("You can legally drink alcohol");
			break;
		default:
			System.out.println("I don't know how old you are");
			break;
		}
	}
}
// please give your age in a numerical value
