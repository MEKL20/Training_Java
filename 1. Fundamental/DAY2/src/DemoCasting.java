public class DemoCasting
{
	public static void main(String [] bebas)
	{
		//DEMO IMPLISIT CASTING
		//32bit
		int bil1=10;
		//64bit
		long bil2=bil1;
		System.out.println("BILL 2 : "+bil2);
		//DEMO EXPLISIT CASTING
		long bil3=10;
		//int bil4=bil3;==>ERROR
		int bil4=(int)bil3;//EXPLISIT
		System.out.println("BIL 4: "+bil4);
	}
}
