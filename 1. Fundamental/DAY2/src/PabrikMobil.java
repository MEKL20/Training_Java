public class PabrikMobil
{
	public static void main(String [] bebas)
	{
		//operator new dalam contek class artinya adalah membuat object
		Mobil avanza=new Mobil();
		avanza.maju();
		avanza.mundur();
		System.out.println("Jumlah Spion = "+avanza.spion);
	}
}
