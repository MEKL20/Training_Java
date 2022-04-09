public class DemoIfElse
{
	public static void main(String [] bebas)
	{
		char nilai='c';
		String predikat="";

		if(nilai=='a'){
			predikat="Excellent";
		}else if(nilai=='b'){
			predikat="Good";
		}else if(nilai=='c'){
                        predikat="Fair";
		}else if(nilai=='d'){
                        predikat="Poor";
		}else if(nilai=='e'){
                        predikat="Failed";
		}else{
			predikat="Maaf Salah Nilai";
		}
		System.out.println("Nilai Anda : "+nilai+", Predikatnya: "+predikat);
	}
}
