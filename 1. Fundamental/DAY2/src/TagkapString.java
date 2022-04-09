public class TagkapString
{
	public static void main(String [] bebas)
	{
		if(bebas.length==0){
			System.out.println("Tidak ada Parameter");
		}else{
			System.out.println("Anda Memasukan "+bebas.length+" buah parameter");
			System.out.println("======Parameter Anda=======");
			for(int i=0;i<bebas.length;i++){
				System.out.println("Parameter Ke - "+i+" : "+bebas[i]);
			}
		}
	}
}
