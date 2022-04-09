class Komputer
{
	String nama;

	Komputer(String nama)
	{
		this.nama=nama;
	}
	void mengetik()
	{
		System.out.println("Merk Komputer adalah "+nama);
	}
}

public class MyFunction2
{
	static Komputer buat(String x)
	{
		return new Komputer(x);
	}

	public static void main(String [] bebas)
	{
		Komputer hp=buat("HP Pavilion");
		Komputer dell=buat("Dell Pavilion");
		hp.mengetik();
		dell.mengetik();
	}
}
