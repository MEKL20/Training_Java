public class MyFunction3
{
	static AlatTulis beliPulpen()
	{
		return new Pulpen();
	}
	static AlatTulis beliPensil()
	{
		return new Pensil();
	}
	public static void main(String [] bebas)
	{
		AlatTulis s=beliPulpen();
		AlatTulis f=beliPensil();
		s.menulis();
		f.menulis();
		System.out.println(s);
		System.out.println(f);
	}
}
