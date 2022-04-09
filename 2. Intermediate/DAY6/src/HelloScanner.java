import java.util.*;

public class HelloScanner
{
	public static void main(String [] bebas)
	{
		while(true)
		{
			Scanner penangkap=new Scanner(System.in);
			System.out.println("================================");
			System.out.print("Nama Anda : ");
			String nama=penangkap.nextLine();
			System.out.print("Alamat Anda :  ");
	                String alamat=penangkap.nextLine();
			System.out.print("Umur Anda : ");
                	String umur=penangkap.nextLine();
			System.out.println("============Data Anda===========");
			System.out.println("Nama : "+nama);
			System.out.println("Umur : "+umur);
			System.out.println("Alamat : "+alamat);
			System.out.println("================================");
			System.out.print("Anda Ingin Entry Data Lagi ? Y/N : ");
			String jawaban=penangkap.nextLine();
			if(jawaban.equals("n") || jawaban.equals("N")){
				break;
			}else if(jawaban.equals("y") || jawaban.equals("Y")){
				continue;
			}else{
				break;
			}
		}
	}
}
