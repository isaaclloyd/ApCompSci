package chp5;

import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        playGame(scan, rand);
    }
    public static void playGame(Scanner scan, Random rand)
    {
        int player1 = 0;
        int player2 = 0;
        while(player1<100 && player2<100)
        {
            player1+=turn(scan, rand, 1);
            System.out.println("you have "+player1+" points");
            player2+=turn(scan, rand, 2);
            System.out.println("you have "+player2+" points");
            if(player1 > 100 || player2 > 100)
            {
                System.out.println();
            	if(player1==player2){System.out.println("It's a tie.");}
                else if(player1>player2){System.out.println("Player1 wins");}
                else if(player2>player1){System.out.println("Player2 wins");}
            }
        }
    }
    public static int turn(Scanner scan, Random rand, int player)
    {
        int score = 0;
        int roll = 0;
        System.out.println("player"+player+" would you like to roll?(y/n)");
        String yesNo = scan.next();
        while(true){
            if(yesNo.toLowerCase().equals("y"))
            {
                roll = rand.nextInt(6)+1;
                if(roll==1)
                {
                    System.out.println("you got 0 points :(");
                    return 0;
                }
                score+=roll;
                System.out.println("+"+roll+" points");
                System.out.println("player"+player+" would you like to roll?(y/n)");
                yesNo = scan.next();
            }
            else if(yesNo.toLowerCase().equals("n"))
            {
                System.out.println("you got "+score+" points");
                return score;
            }
        }
    }
}


