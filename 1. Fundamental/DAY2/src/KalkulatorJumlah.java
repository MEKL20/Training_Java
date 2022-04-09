public class KalkulatorJumlah
{
	public static void main(String [] bebas)
	{
		if(bebas.length<2){
			System.out.println("Masukan 2 Angka");
		}else{
			int angka1=Integer.parseInt(bebas[0]);
			float angka2=Float.parseFloat(bebas[1]);
			double hasil=angka1+angka2;
			System.out.println(angka1+" + "+angka2+" = "+hasil);
		}
	}
}
