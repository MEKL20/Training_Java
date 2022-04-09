import java.util.ArrayList;

class Sapi
{
	void moo()
	{
		System.out.println("Moooo....");
	}
}

public class KandangSapi
{
	public static void main(String [] bebas)
	{
		ArrayList<Sapi> kandang=new ArrayList<Sapi>();
		for(int i=0;i<10;i++){
			kandang.add(new Sapi());
		}

		for(int j=0;j<kandang.size();j++){
			Sapi s=kandang.get(j);
			s.moo();
		}
	}
}
