public class CobaSepedaMotor
{
	public static void main(String [] bebas)
	{
		SepedaMotor vario=new SepedaMotor(3,2);
		SepedaMotor beat=new SepedaMotor(4,1);
		SepedaMotor mio=new SepedaMotor();
		SepedaMotor honda=new SepedaMotor(1,2,"Honda");

		System.out.println("Roda vario = "+vario.roda);
		System.out.println("Roda beat = "+beat.roda);
		System.out.println("Roda mio = "+mio.roda);
		beat.jalan();
	}
}
