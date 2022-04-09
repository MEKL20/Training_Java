public class DemoArray1
{
	public static void main(String [] bebas)
	{
		//cara deklarasi Array: tipe harus sama semua dan kurung siku boleh tengah atau belakang
		int [] daftarAngka={10,20,30,40,50};
		int jumlahIsiDaftarAngka=daftarAngka.length;
		System.out.println("Lengthnya = "+jumlahIsiDaftarAngka);
		for (int i=0;i<jumlahIsiDaftarAngka;i++){
			System.out.println("Element ke - "+i+": "+daftarAngka[i]);
		}
		//System.out.println(daftarAngka[5]);

		char daftarHuruf []={'a','x','g','h'};
		for(int i=0;i<daftarHuruf.length;i++){
			System.out.println("Daftar huruf["+i+"]: "+daftarHuruf[i]);
		}
	}
}
