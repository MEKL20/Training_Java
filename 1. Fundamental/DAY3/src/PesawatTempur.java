public class PesawatTempur extends Pesawat
{
	void manuver()
	{
		System.out.println("Manuver...");
	}

	void terbang()
	{
		super.terbang();
		System.out.println("Terbang ala Tempur..");
	}
}
