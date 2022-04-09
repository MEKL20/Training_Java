public class TestInterface
{
	static void ujiManusia(Manusia m)
	{
		m.bernafas();
	}
	static void ujiProgrammer(Programmer p)
        {
                p.memprogram();
        }
	static void ujiSniper(Sniper s)
        {
                s.menembak();
        }
	public static void main(String [] bebas)
	{
		Amir mahmud=new Amir();
		ujiManusia(mahmud);
		ujiProgrammer(mahmud);
		ujiSniper(mahmud);
	}
}
