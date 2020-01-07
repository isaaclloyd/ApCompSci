package chp7;
import java.util.Scanner;
public class Connect4 {
    public static void main(String[] args)
    {
        int[][] board = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
        Scanner scan = new Scanner(System.in);
        game(board, scan);
    }
    public static void game(int[][] arr, Scanner scan)
    {
        int win = 0;
        String p1="";
        String p2="";
        System.out.println("Player 1 what letter do you want to use?");
        p1=scan.next();
        System.out.println("Player 2 what letter do you want to use?");
        p2=scan.next();
        while(win==0)
        {
        turn(arr, scan, 1);
        win = check(arr);
        print(arr, p1, p2);
        if(win!=0) {break;}
        turn(arr, scan, 2);
        win=check(arr);
        print(arr, p1, p2);
      
        }
     System.out.println("player "+win+" wins!");
    }
    public static void turn(int[][] arr, Scanner scan, int player)
    {
        System.out.println("player "+player+" What column do you want to drop your disk(1-7)");
        int i = 0;
        int j = scan.nextInt()-1;
        while(i<arr.length-1)
        {
            if(arr[i+1][j]==0)
            {
                arr[i+1][j]=player;
                arr[i][j]=0;
            }
            else
            {
             
             if(arr[i][j]==0) {arr[i][j]=player;}
             break;
            }
            i++;
        }
    }
    public static int check(int[][] arr)
    {
        int win = 0;
        //rows
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[i][j]!=0 && j<4)
                {
                    if(arr[i][j+1]==arr[i][j]&&arr[i][j+2]==arr[i][j]&&arr[i][j+3]==arr[i][j])
                    {
                        win = arr[i][j];
                    }
                }
            }
        }
        //columns
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr.length; j++)
            {
                if(arr[j][i]!=0 && j<3)
                {
                    if(arr[j+1][i]==arr[j][i]&&arr[j+2][i]==arr[j][i]&&arr[j+3][i]==arr[j][i])
                    {
                        win = arr[j][i];
                    }
                }
            }
        }
        //diagonals
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(i<=2 && j<=3 && arr[i][j]!=0)
                {
                    if(arr[i+1][j+1]==arr[i][j] && arr[i+2][j+2]==arr[i][j] && arr[i+3][j+3]==arr[i][j])
                    {
                        win=arr[i][j];
                    }
                }
                if(i>=3 && j<=3 && arr[i][j]!=0)
                {
                    if(arr[i-1][j+1]==arr[i][j] && arr[i-2][j+2]==arr[i][j] && arr[i-3][j+3]==arr[i][j])
                    {
                        win=arr[i][j];
                    }
                }
            }
        }
        return win;
        
        
    }
    public static void print(int[][] a, String player1, String player2)
 {
  for(int i = 0; i<a.length; i++)
  {
   System.out.print("|");
   for(int j = 0; j<a[0].length; j++)
   {
    if(a[i][j]==0)
    {
     System.out.print(" - |");
    }
    if(a[i][j]==1)
    {
     System.out.print(" "+player1+" |");
    }
    if(a[i][j]==2)
    {
     System.out.print(" "+player2+" |");
    }
   }
   System.out.println();
  }
 }
}



