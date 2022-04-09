class  HewanTernak
{
	void makanRumput()
	{
		System.out.println("Makan Rumput....");
	}
}

class Sapi extends HewanTernak
{
	void mengemo()
	{
		System.out.println("mmmoooooo....");
	}
}

class Kerbau extends HewanTernak
{
	void melenguh()
	{
		System.out.println("nguhhh...");
	}
}

public class Peternakan
{
	public static void main(String [] bebas)
	{
		java.util.ArrayList<HewanTernak> kandang=new java.util.ArrayList<HewanTernak>();
		for(int i=0;i<10;i++){
			if((i%2)==0){
				kandang.add(new Sapi());
			}else{
				kandang.add(new Kerbau());
			}
		}

		for(int j=0;j<kandang.size();j++){
			HewanTernak  binatang=kandang.get(j);
			if(binatang instanceof Sapi){
				System.out.println("Binatang ke - "+j+" Sapi");
				binatang.makanRumput();
				((Sapi)binatang).mengemo();
			}else{
				System.out.println("Binatang ke - "+j+" Kerbau");
				binatang.makanRumput();
                                ((Kerbau)binatang).melenguh();
			}
		}
	}
}
