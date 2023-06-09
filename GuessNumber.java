package oasisTask;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {

	public static void main(String[] args) 
	{
		System.out.println("************** WELCOME TO NUMBER GUESSING GAME**************");
		System.out.println("\nRules of Game are :-");
		System.out.println("1.Guess number in range 1 to 100.");
		System.out.println("2. Maximum attempt to guess is 5.");
		System.out.println("3. You get score based on your attempts.");
		System.out.println("Lets play...!\n");
		
		numGame();
		while(true)
		{
		System.out.println("\n1. Play again");
		System.out.println("2.Exit");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1:
			numGame();
			break;
		case 2:
			System.out.println("Thank You !");
			System.exit(0);
		}
		}	
	}
	public static void numGame()
	{
		int guessNum = guessNum();
		System.out.println(guessNum);
		Scanner sc = new Scanner(System.in);
		int enteredNum =0;
		int attempt = 0;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("\nGuess the Number : ");
			enteredNum = sc.nextInt();
			attempt++;
			if(guessNum>enteredNum)
			{
				System.out.println("Entered number is Smaller.");
			}
			else if(guessNum<enteredNum)
			{
				System.out.println("Entered number is Greater.");
			}
			else if(guessNum==enteredNum)
			{
				System.out.println("Congratulation you guessed Right !");
				System.out.println("You found number at attempt : "+attempt);
				System.out.println("Your score is : "+(120-(attempt*20)));
				break;
			}
		}
		if(attempt==5 && guessNum!=enteredNum)
		{
			System.out.println("\nYour reached maximum attempts !");
			System.out.println("Your Score is : 0.");
		}
		
	}
	public static int guessNum() {
		return ThreadLocalRandom.current().nextInt(1, 100);

	}
}
