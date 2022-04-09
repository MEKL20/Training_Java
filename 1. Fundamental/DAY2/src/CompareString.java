public class CompareString
{
	public static void main(String [] bebas)
	{
		String kata1="MEKL ";
		String kata2="Adalah ";
		String kata3="Tampan ";
		String kata4="Dan Berani";
		String kata5=kata1+kata2+kata3+kata4;
		String kata6="MEKL Adalah Tampan Dan Berani";
		System.out.println("kata5 : "+kata5);
		System.out.println("kata6 : "+kata6);
		System.out.println("kata5==kata6 : "+(kata5==kata6));
		System.out.println("kata5.equals(kata6) : "+(kata5.equals(kata6)));
	}
}
