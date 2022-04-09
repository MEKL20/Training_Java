import java.util.HashMap;

class Ayam
{
	void berkokok()
	{
		System.out.println("kriukriuk....");
	}
}

class Kucing
{
        void mengeong()
        {
                System.out.println("meong....");
        }
}

class Kambing
{
        void mengembek()
        {
                System.out.println("mbehehehek....");
        }
}

public class DemoHashMap
{
	public static void main(String [] bebas)
	{
		HashMap<String,Object> kandang=new HashMap<String,Object>();
		kandang.put("Ayam Kampung",new Ayam());
		kandang.put("Kambing Gunung",new Kambing());
		kandang.put("Kucing Kampung",new Kucing());

		Kucing k=(Kucing)kandang.get("Kucing Kampung");
		k.mengeong();

		Ayam a=(Ayam)kandang.get("Ayam Kampung");
		a.berkokok();

		Kambing kb=(Kambing)kandang.get("Kambing Gunung");
		kb.mengembek();
	}
}
