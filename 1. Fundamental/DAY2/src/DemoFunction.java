public class DemoFunction
{
	static void sayHi()
	{
		System.out.println("Halo, ini adalah method SayHi");
	}

	static void sayHi(String nama)
        {
                System.out.println("Halo, "+nama+", welcome to java");
        }

	static void sayHi(int angka)
        {
                System.out.println("Halo, ini adalah angka : "+angka);
        }

	static void sayHi(String nama, int umur)
        {
                System.out.println("Halo, "+nama+", umur anda adalah "+umur);
        }

	static void sayHi(Mobil m)
	{
		m.maju();
		m.mundur();
	}

	public static void main(String [] bebas)
	{
		sayHi();
		sayHi("MEKL");
		sayHi(10);
		sayHi("MEKL",23);
		sayHi(new Mobil());
		Mobil fortuner=new Mobil();
		sayHi(fortuner);
	}
}
