package chp3;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        christmasTree(scan);
    }
    public static void christmasTree(Scanner scan)
    {
        System.out.println("input how many segments followed by  the height of each segment.");
        int segs = scan.nextInt();
        int height = scan.nextInt();
        int extra = 0;
        for(int i = 1; i<=height*2-1; i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");
        for(int i = 1; i <= segs; i++)
        {
            for (int j = 2; j <= height; j++)
            {
            	if(i == 1)
            	{
	            	for(int h = 1; h<=height*2-j; h++)
	                {
	                    System.out.print(" ");
	                }
            	}
            	if(i != 1) 
            	{
	            	for(int h = 1; h<=height*2-j-1*(i-1); h++)
	                {
	                    System.out.print(" ");
	                }
            	}
            	for(int k = 1; k <= j*2-1+extra*2; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            extra++;
        }
        for (int i = 1; i<= 2; i++)
        {    
            for(int j = 1; j<=height*2-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int j = 1; j<=height*2-4; j++)
        {
            System.out.print(" ");
        }
        System.out.println("*******");
    }
}
