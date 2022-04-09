public class TestLuar
{
	public static void main(String [] bebas)
	{
		Luar l=new Luar();
		Luar.Tengah t=l.new Tengah();
		MyIface d=t.new Dalam();

		d.cetakDalam();
	}
}
