import java.util.Scanner;

class Java
{
public static void main (String args[])
	{
	Scanner UserInput = new Scanner(System.in);
	int UsersAge;
	System.out.println("Enter your age below to see if you are eligible for early retirement:");
	UsersAge = UserInput.nextInt();
	if (UsersAge >= 55)
		{
		System.out.println("You are eligible for early retirement :)");
		}
		else
		{
		System.out.println("You are not eligible for early retirement,");
		System.out.println("You have " + (55 - UsersAge) + " years left before you're eligible.");
		}	
	}	
}
