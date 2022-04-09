public class DemoArray3
{
	public static void main(String [] bebas)
	{
		int [] daftarAngka;
		daftarAngka=new int[5];

		for(int i=0;i<daftarAngka.length;i++){
			daftarAngka[i]=(i+1)*10;
			System.out.println("daftarAngka["+i+"]: "+daftarAngka[i]);
		}
	}
}
