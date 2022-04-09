import java.util.HashMap;

class Ayam
{
	void berkokok()
	{
		System.out.println("kriukriuk....");
	}
}
public class DemoHashMapSpesifik
{
	public static void main(String [] bebas)
	{
		HashMap<String,Ayam> kandang=new HashMap<String,Ayam>();
		kandang.put("Ayam Kampung",new Ayam());
		kandang.put("Ayam Gunung",new Ayam());
		kandang.put("Ayam Hutan",new Ayam());

		Ayam k=kandang.get("Ayam Kampung");
		k.berkokok();

		Ayam g=kandang.get("Ayam Gunung");
                g.berkokok();

		Ayam h=kandang.get("Ayam Hutan");
                h.berkokok();

		for(java.util.Map.Entry<String,Ayam> tangkapan:kandang.entrySet()){
			System.out.println("KEY "+tangkapan.getKey());
			Ayam a=tangkapan.getValue();
			a.berkokok();
		}
	}
}
