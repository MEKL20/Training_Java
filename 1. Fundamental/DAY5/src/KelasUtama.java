import com.indivaragroup.jdt9.mylib.*;

public class KelasUtama
{
	public static void main(String [] bebas)
	{
		//cara 1
		ContohLibrary c1=new ContohLibrary();
		c1.callMe();
		//cara 2
		com.indivaragroup.jdt9.mylib.ContohLibrary c=new com.indivaragroup.jdt9.mylib.ContohLibrary();
		c.callMe();

		Turunan t=new Turunan();
		t.test();
	}
}
