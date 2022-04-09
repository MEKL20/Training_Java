import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyString
{
        public static void main(String [] bebas)
        {
                Scanner s=new Scanner(System.in);
                System.out.print("File Sumber : ");
                String namaFileSumber=s.nextLine();
                System.out.print("File Tujuan : ");
                String namaFileTujuan=s.nextLine();
                s.close();
		File fileSumber=new File(namaFileSumber);
		if(fileSumber.exists()){
			try{
				BufferedReader br=new BufferedReader(new FileReader(fileSumber));
				PrintWriter pw=new PrintWriter(new FileWriter(namaFileTujuan));
				String data=null;
				while((data=br.readLine())!=null){
					pw.println(data);
				}
				pw.flush();
				pw.close();
			}catch(Exception e){
				System.out.println("Error -_- "+e.getMessage());
			}
		}
	}
}
