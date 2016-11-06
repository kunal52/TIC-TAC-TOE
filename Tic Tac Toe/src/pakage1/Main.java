package pakage1;



public class Main {
	public static void main(String [] args)
	{
		System.out.println("Lets Start The Game -----------------------------------");
		Structure s=new Structure();
		int chek=0;
		s.start();
		while(s.Win!=1)
		{
			chek++;
			s.game();
			s.print();
			s.win();
			if(chek==9)
			{
				s.Win=1;
				System.out.println("Match Is DRAW");
			}
		}
	}
}
