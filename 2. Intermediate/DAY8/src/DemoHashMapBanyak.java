import java.util.*;

public class DemoHashMapBanyak
{
	public static void main(String [] bebas)
	{
		String [] daftarKey=new String[10];
		for(int i=0;i<daftarKey.length;i++){
			daftarKey[i]="Kambing ke-"+i;
		}

		Kambing [] daftarValue=new Kambing[10];
		for(int i=0;i<daftarValue.length;i++){
                        daftarValue[i]=new Kambing();
                }

		HashMap<String,Kambing> dagangan=new HashMap<String,Kambing>();
		for(int i=0;i<10;i++){
                        dagangan.put(daftarKey[i],daftarValue[i]);
                }

		for(Map.Entry<String,Kambing> ambil:dagangan.entrySet()){
                        System.out.println(ambil.getKey());
			ambil.getValue().mengembek();
                }
	}
}
