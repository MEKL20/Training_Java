import java.io.*;
import java.util.*;

public class BacaFileBytes
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
					FileInputStream fis=new FileInputStream(f);
					int hasil=-1;//-1 menandakan EOF (END OF FILE)
					while((hasil=fis.read()) !=-1)
					{
						System.out.print((char)hasil);
					}
					fis.close();
				}catch(Exception error){
					System.out.println("Error -_- "+error.getMessage());
				}
			}
		}else{
			System.out.println("File "+namaFile+" Tidak ada -_-");
		}
	}
}
