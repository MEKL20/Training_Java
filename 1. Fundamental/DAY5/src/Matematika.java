public class Matematika
{
	public static void main(String [] bebas)
	{
		if(bebas.length<2){
			System.out.println("Cara Pakai:Java Matematika bil1 bil2");
		}else{
			int bil1=Integer.parseInt(bebas[0]);
			int bil2=Integer.parseInt(bebas[1]);
			try
			{
			int hasil=bil1/bil2;
			System.out.println(hasil);

			int [] daftar={10,20,30};
			System.out.println(daftar[4]);

			}catch(ArithmeticException e1){
				System.out.println("Maaf Error pembagian dengan 0 : "+e1);
			}catch(ArrayIndexOutOfBoundsException e2){
                                System.out.println("Array index error : "+e2);
                        }catch(Exception e3){
                                System.out.println("Maaf Error"+e3);
                        }finally{
				System.out.println("Error atau gak tetap jalan WOYYY");
			}
		}
	}
}
