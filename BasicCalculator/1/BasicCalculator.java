import java.util.Scanner;

class BasicCalculator{
	public static void main (String args []){
		Scanner UserInput = new Scanner(System.in);
		double FirstNumber, SecondNumber, Answer;

		System.out.println("Enter First Number");
		FirstNumber = UserInput.nextDouble();

		System.out.println("Enter Second Number");
		SecondNumber = UserInput.nextDouble();

		System.out.println("Answer");
		Answer = FirstNumber + SecondNumber;
		System.out.println(Answer);
		
}		
}
