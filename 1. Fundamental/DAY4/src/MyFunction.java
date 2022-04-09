public class MyFunction
{
	static void cetak(String s)
	{
		System.out.println(s);
	}
	static int kali(int a, int b)
	{
		return a*b;
	}
	static String namaLengkap(String depan, String belakang)
	{
		return depan+" "+belakang;
	}
	static double bagi(double x, int y)
	{
		return x/y;
	}
	static boolean cekKesehatan()
	{
		return true;
	}
	public static void main(String [] bebas)
	{
		cetak("CETAKKKKK");
		cetak("Hasil Kali = "+kali(3,4));
		cetak(namaLengkap("MEKL","Ganteng"));
		cetak("Hasil Bagi = "+bagi(6,7));
		cetak("Anda Sehat? "+cekKesehatan());
	}
}
