import java.util.*;

public class ArrayListPrimitive
{
	public static void main(String [] bebas)
	{
		ArrayList<Integer> nilai=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			nilai.add(i);
		}
		for(int i=0;i<nilai.size();i++){
			int hasil=nilai.get(i);
			System.out.println(hasil+15);
		}

		ArrayList<Double> pecahan=new ArrayList<Double>();
		for(int i=0;i<10;i++){
			pecahan.add(i*1.3);
		}
		for(int i=0;i<pecahan.size();i++){
			double hasil=pecahan.get(i);
			System.out.println(hasil);
		}

		ArrayList<Boolean> logika=new ArrayList<Boolean>();
		for(int i=0;i<10;i++){
                        if((i%2)==0){
				logika.add(Boolean.valueOf(false));
			}else{
				logika.add(Boolean.valueOf(true));
			}
                }
                for(int i=0;i<logika.size();i++){
                        boolean hasil=logika.get(i);
                        System.out.println(hasil);
                }
	}
}
