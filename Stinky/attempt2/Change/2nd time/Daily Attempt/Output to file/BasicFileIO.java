import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class BasicFileIO
{
	public static void main(String args[])
		throws FileNotFoundException
	{
		Scanner diskScanner = new Scanner(new File("test.txt"));
		
		String name = diskScanner.nextLine();
		int age = diskScanner.nextInt();

		System.out.printf("Name: %s Age: %d\n",name,age);
		diskScanner.close();
	}	
}
