class Binatang
{
	void bernafas()
	{
		System.out.println("Bernafas");
	}
}

class Ayam extends Binatang
{
        void berkokok()
        {
                System.out.println("KriukKriuk");
        }
}

public class Zoo
{
	public static void main(String [] bebas)
	{
		Binatang a=new Ayam();
		a.bernafas();
		((Ayam)a).berkokok();
	}
}
