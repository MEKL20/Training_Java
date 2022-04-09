import java.util.*;

public class CalculatorCMD
{
        public static void main(String [] bebas)
        {
		Scanner penangkap=new Scanner(System.in);
		while(true)
        	{
                       	System.out.println("================================");
                       	System.out.print("Angka 1 Anda : ");
                       	String angka1=penangkap.nextLine();
           		System.out.print("Angka 2 Anda : ");
                       	String angka2=penangkap.nextLine();
                       	System.out.print("Operator Nya ? (+ - x :) ");
                       	String operator=penangkap.nextLine();
                       	System.out.println("============Hasil Anda===========");
			try
			{
				double bil1=Double.parseDouble(angka1);
				double bil2=Double.parseDouble(angka2);
				double hasil=0;
				if(operator.equals("+")){
					hasil=bil1+bil2;
					System.out.println(angka1+" + "+angka2+" = "+hasil);
				}else if(operator.equals("-")){
                                        hasil=bil1-bil2;
                                        System.out.println(angka1+" - "+angka2+" = "+hasil);
                                }else if(operator.equals("x")){
                                        hasil=bil1*bil2;
                                        System.out.println(angka1+" x "+angka2+" = "+hasil);
                                }else if(operator.equals(":")){
                                        hasil=bil1/bil2;
                                        System.out.println(angka1+" : "+angka2+" = "+hasil);
                                }else{
					System.out.println("Operator salah -_-");
				}
                        	System.out.println("================================");
                        	System.out.print("Anda Ingin Entry Data Lagi ? Y/N : ");
                        	String jawaban=penangkap.nextLine();
                        	if(jawaban.equals("y") || jawaban.equals("Y")){
                        	        continue;
                        	}else{
                        	        System.exit(0);
                        	}
			}catch(NumberFormatException err){
				System.out.println("Input Harus Angka -_-");
			}catch(Exception error){
				System.out.println("error -_- "+error.getMessage());
			}
		}
        }
}
