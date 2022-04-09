public class DemoSwitchInteger
{
        public static void main(String [] bebas)
        {
                int nilai=3;
                String predikat="";

                switch(nilai){
                        case 4:
                                predikat="Excellent";
                                break;
                        case 3:
                                predikat="Good";
                                break;
                        case 2:
                                predikat="Fair";
                                break;
                        case 1:
                                predikat="Poor";
                                break;
                        case 0:
                                predikat="Failed";
                                break;
                        default:
                                predikat="Maaf Salah Nilai";
                                break;
                }
                System.out.println("Nilai Anda : "+nilai+", Predikatnya: "+predikat);
        }
}
