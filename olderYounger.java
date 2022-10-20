import java.util.Scanner;


public class olderYounger
{	
	public static void main(String[] args)
     {
		System.out.println("I can tell you out of the 3 people's ages you enter who is younger and who is older.");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a number to represent the first person's age: ");
		int num1 = keyboard.nextInt();
		System.out.print("Please enter a number to represent the second person's age: ");
		int num2 = keyboard.nextInt();
		System.out.print("Please enter a number to represent the third person's age: ");
		int num3 = keyboard.nextInt();
		int maxAnswer = 0;
		int minAnswer = 0;
		
		if (num1 > num2 && num1 > num3) { maxAnswer = num1; }
		if (num2 > num1 && num2 > num3) { maxAnswer = num2; }
		if (num3 > num1 && num3 > num2) { maxAnswer = num3; }
		
		if (num1 < num2 && num1 < num3) { minAnswer = num1; }
		if (num2 < num1 && num2 < num3) { minAnswer = num2; }
		if (num3 < num2 && num3 < num1) { minAnswer = num3; }
		 
		System.out.println("The youngest person's age is " + minAnswer + " and the oldest one is " + maxAnswer + " years old.");
		

		
			 
	  
  
	}
}