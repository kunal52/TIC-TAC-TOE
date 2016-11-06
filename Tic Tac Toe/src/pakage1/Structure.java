package pakage1;

import java.util.Scanner;

public class Structure {

   Scanner scan=new Scanner(System.in);
   public static final String [][]a=new String[3][3];
   public static boolean turn ;   //turn 1 == "x"
   				   //turn 0 == "o" 
   public int Win;
	void game()
	{
		System.out.println("Enter your position");
		int q, w;
		q=scan.nextInt();
		w=scan.nextInt();
		
		if((q==3||q==1||q==2)&&(w==3||w==1||w==2))
		{
			--q;
			--w;
		turn=!turn;
		if(turn)
		{
			a[q][w]="x";
		}
		if(!turn)
		{
			a[q][w]="o";
		}
		}
		else
		{
			System.out.println("");
			System.out.println("Wrong Entry \n Please Enter Between 1-3");
	}}
	void win()
	{
		if(turn)
		{
		if(a[0][0]=="x"&&a[1][0]=="x"&&a[2][0]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[0][1]=="x"&&a[1][1]=="x"&&a[2][1]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[0][2]=="x"&&a[1][2]=="x"&&a[2][2]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[0][0]=="x"&&a[0][1]=="x"&&a[0][2]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[1][0]=="x"&&a[1][1]=="x"&&a[1][2]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[2][0]=="x"&&a[2][1]=="x"&&a[2][2]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[0][0]=="x"&&a[1][1]=="x"&&a[2][2]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}
		if(a[0][2]=="x"&&a[1][1]=="x"&&a[2][0]=="x")
		{
			System.out.println("X WIN The Game");
			Win=1;
		}}
		if(!turn)
		{
			if(a[0][0]=="o"&&a[1][0]=="o"&&a[2][0]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[0][1]=="o"&&a[1][1]=="o"&&a[2][1]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[0][2]=="o"&&a[1][2]=="o"&&a[2][2]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[0][0]=="o"&&a[0][1]=="o"&&a[0][2]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[1][0]=="o"&&a[1][1]=="o"&&a[1][2]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			
			if(a[2][0]=="o"&&a[2][1]=="o"&&a[2][2]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[0][0]=="o"&&a[1][1]=="o"&&a[2][2]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
			if(a[0][2]=="o"&&a[1][1]=="o"&&a[2][0]=="o")
			{
				System.out.println("X WIN The Game");
				Win=1;
			}
		}
		
	}
	void print()
	{
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			System.out.print(a[i][j]+" ");
	
		System.out.println("");
	}}
	void draw()
	{
		
	}
	void start()
	{
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			a[i][j]="N";	
			}
		}
	}
	
}
