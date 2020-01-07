package chp5;

import java.util.Random;
import java.util.Scanner;

public class ReverseHangman {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        rHang(scan, rand);
    }
    public static void rHang(Scanner scan, Random rand)
    {
        System.out.println("What is the length of your word");
        int length = scan.nextInt();
        int right=0;
        int wrong=0;
        int nex;
        String guessed = " ";
        char guess;
        while(right<length && wrong<length)
        {
            guess = (char)(rand.nextInt(26)+97);
            for(int j = 0; j<guessed.length(); j++)
            {
                
            	if(guess==guessed.charAt(j))
                {
                    guess = (char)(rand.nextInt(26)+97);
                    j=0;
                }
            }
            guessed+=guess;
            System.out.println("how many "+guess+"'s does your word have");
            nex=scan.nextInt();
            if(nex==0)
            {
                wrong++;
            }
            else
            {
                right+=nex;
            }
            if(wrong==length){
                System.out.println("computer lost");
                break;
            };
            if(right==length)
            {
                System.out.println("computer won");
                break;
            }
            
        }

    }
}


