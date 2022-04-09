import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class BacaFileString
{
	public static void main(String [] bebas)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Nama File : ");
		String namaFile=s.nextLine();
		File f=new File(namaFile);
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("File "+namaFile+" Adalah Directory");
			}else{
				try
				{
					FileReader fr=new FileReader(f);
					BufferedReader br=new BufferedReader(fr);
					String hasil=null;//-1 menandakan EOF (END OF FILE)
					while((hasil=br.readLine())!=null)
					{
						System.out.println(hasil);
					}
					br.close();
				}catch(Exception error){
					System.out.println("Error -_- "+error.getMessage());
				}
			}
		}else{
			System.out.println("File "+namaFile+" Tidak ada -_-");
		}
	}
}
