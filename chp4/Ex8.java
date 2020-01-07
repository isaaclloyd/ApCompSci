package chp4;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		smallestLargest(scan);
	} 
	public static void smallestLargest(Scanner scan) 
	{
		System.out.println("How many numbers do you want to enter? ");
		int num = scan.nextInt();
		int low = 2147483647;
		int high = -2147483648;
		int curr = 0;
		for(int i = 1; i <= num; i++) 
		{
			System.out.println("Number "+ i + " ");
			curr = scan.nextInt();
			if(curr > high) 
			{
				high = curr;
			}
			else if(curr < low)
			{
				low = curr;
			}
		}
		System.out.println("Smallest = " + low);
		System.out.println("Largest = " + high);
	}
}
