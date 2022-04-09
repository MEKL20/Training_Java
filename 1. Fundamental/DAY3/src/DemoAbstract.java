abstract class Satu
{
	abstract void test();
}

class Dua extends Satu
{
	void test()
	{
		System.out.println("Tosssttt...");
	}
}

public class DemoAbstract
{
	public static void main(String [] bebas)
	{
		Dua d=new Dua();
		d.test();
	}
}
