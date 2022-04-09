import java.util.*;
import java.io.*;

public class CopyBuffer
{
	public static void main(String [] bebas) throws Exception
	{
		Scanner s=new Scanner(System.in);
                System.out.print("File Sumber : ");
                String namaFileSumber=s.nextLine();
                System.out.print("File Tujuan : ");
                String namaFileTujuan=s.nextLine();
                s.close();
                long start=System.currentTimeMillis();
		//File fileSumber=new File(namaFileSumber);
		//FileInputStream fis=new FileInputStream(fileSumber);
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File(namaFileSumber)));
		//FileOutputStream fos=new FileOutputStream(namaFileTujuan);
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(namaFileTujuan)),1000);
		int data=0;
		while((data=bis.read())!=-1){
			bos.write(data);
		}
		bos.flush();
		bos.close();
		bis.close();
		long duration=(System.currentTimeMillis()-start)/1000;
		System.out.println("Copy Success.... Duration "+duration+" s");
	}
}
