public class DemoSwitch
{
        public static void main(String [] bebas)
        {
                char nilai='c';
                String predikat="";

		switch(nilai){
                	case 'a':
                        	predikat="Excellent";
				break;
                	case 'b':
                        	predikat="Good";
				break;
                	case 'c':
                        	predikat="Fair";
				break;
                	case 'd':
                        	predikat="Poor";
				break;
                	case 'e':
                        	predikat="Failed";
				break;
                	default:
                        	predikat="Maaf Salah Nilai";
                		break;
		}
                System.out.println("Nilai Anda : "+nilai+", Predikatnya: "+predikat);
        }
}
