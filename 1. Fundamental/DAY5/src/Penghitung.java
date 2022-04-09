public class Penghitung
{
	static void bagi(int a,int b) throws Exception
	{
		if(b==0){
			throw new Exception("Mohon Maaf, pembagi jangan 0!!!");
		}else{
			int hasil=a/b;
			System.out.println(hasil);
		}
	}

	public static void main(String [] bebas)
	{
		try
		{
			bagi(8,0);
		}catch(Exception error){
			System.out.println(error.getMessage());
		}
	}
}
