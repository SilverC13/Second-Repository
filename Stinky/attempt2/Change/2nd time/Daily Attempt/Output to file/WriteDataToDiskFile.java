import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class WriteDataToDiskFile
{
	public static void main(String args[])
		throws FileNotFoundException
	{
	PrintStream diskWriter = new PrintStream("file.txt");
	diskWriter.print("Hello");
	diskWriter.println("World");

	diskWriter.close();
	}
}
