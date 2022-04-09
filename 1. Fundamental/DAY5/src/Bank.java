public class Bank
{
	public static void main(String [] bebas)
	{
		Tabungan andi=new Tabungan(1000);
		System.out.println("Tabungan andi "+andi.getSaldo());

		andi.setSaldo(0);
		System.out.println("Tabungan andi "+andi.getSaldo());
	}
}
