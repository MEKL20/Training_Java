public class Konser
{
	static void test(AlatMusik a, int b)
	{
		a.play();
		a.play(b);
	}
	public static void main(String [] bebas)
	{
		Gitar g=new Gitar();
		Piano p=new Piano();
		test(g,5);
		test(p,10);
	}
}
