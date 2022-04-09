import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileBytes
{
	public static void main(String [] bebas)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("File Sumber : ");
		String namaFileSumber=s.nextLine();
		System.out.print("File Tujuan : ");
		String namaFileTujuan=s.nextLine();
		s.close();
		long start=System.currentTimeMillis();
		try
		{
			File fileSumber=new File(namaFileSumber);
			if(fileSumber.exists()){
				FileInputStream fis=new FileInputStream(fileSumber);
				FileOutputStream fos=new FileOutputStream(namaFileTujuan);
				int data;
				while((data=fis.read())!=-1){
					fos.write(data);
				}
				fos.flush();
				fos.close();
				fis.close();
				long duration=(System.currentTimeMillis()-start)/1000;
				System.out.println("Copy Sukses.... Duration "+duration+" s");

			}
		}catch(Exception e){
			System.out.println("Error -_- "+e.getMessage());
		}
	}
}
