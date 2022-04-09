import java.util.ArrayList;

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

public class BonBin
{
	public static void main(String [] bebas)
	{
		ArrayList kandang=new ArrayList();
		for(int i=0;i<10;i++){
			if((i%2)==0){
				kandang.add(new Ayam());
			}else if((i%3)==0){
				kandang.add(new Kucing());
			}else{
				kandang.add(new Kambing());
			}
		}

		System.out.println("Total binatang di dalam kandang = "+kandang.size());

		for(int j=0;j<kandang.size();j++){
			//Object adalah parent dari semua class
			Object binatang=kandang.get(j);
			if(binatang instanceof Ayam){
				System.out.println("binatang ke - "+j+" Ayam");
				((Ayam)binatang).berkokok();
			}else if(binatang instanceof Kucing){
				System.out.println("binatang ke - "+j+" Kucing");
				((Kucing)binatang).mengeong();
			}else{
				System.out.println("binatang ke - "+j+" Kambing");
				((Kambing)binatang).mengembek();
			}
		}
	}
}
