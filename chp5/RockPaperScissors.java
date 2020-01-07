package chp5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		PRS(scan, rand);
	}
	public static void PRS(Scanner scan, Random rand) 
	{
		String[] choices = {"paper", "rock", "scissors"};
		System.out.println("paper rock or scissors");
		String person = scan.next().toLowerCase();
		String computer = pick(choices, rand);
		if(person.equals(computer)) 
		{
			System.out.println("Tie!");
		}
		else if((person.equals("rock")&&computer.equals("scissors")) || (person.equals("paper")&&computer.equals("rock")) || (person.equals("scissors")&&computer.equals("paper"))) 
		{
			System.out.println("Computer chose "+computer+" You won!");
			
		}
		else if((computer.equals("rock")&&person.equals("scissors")) || (computer.equals("paper")&&person.equals("rock")) || (computer.equals("scissors")&&person.equals("paper"))) 
		{
			System.out.println("Computer chose "+computer+" You lost...");
		}
	}
	public static String pick(String[] arr, Random rand) 
	{
		int nex = rand.nextInt(arr.length);
		return arr[nex];
	}
}
