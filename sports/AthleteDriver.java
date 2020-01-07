package sports;

public class AthleteDriver {
	public static void main(String[] args) 
	{
		Basketball b = new Basketball("Tall guy", "Some animal name", 11, 4000000, .85);
		Soccer s = new Soccer("player of soccer", "South american stuff", 34, 2000000, 1.0);
		b.celebrate();
		s.celebrate();
		System.out.println(b.getFreeThrow());
		System.out.println(s.getKick());
	}
}
