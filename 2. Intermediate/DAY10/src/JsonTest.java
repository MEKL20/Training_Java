import com.indivaragroup.jdt9.database.*;
import com.google.gson.*;
import java.util.*;
import java.io.*;

public class JsonTest
{
	public static void main(String [] bebas)
	{
		try{
			Scanner s=new Scanner(System.in);
			System.out.print("Lokasi File JSON : ");
			String namaFile=s.nextLine();
			BufferedReader br=new BufferedReader(new FileReader(namaFile));
			String data=null;
			StringBuffer sb=new StringBuffer();
			while((data=br.readLine())!=null){
				sb.append(data.trim());
			}
			System.out.println(sb.toString());
			Gson json=new Gson();
			Karyawan[] k=json.fromJson(sb.toString(), Karyawan[].class);
			for(int i=0;i<k.length;i++){
				System.out.println(k[i].getNama());
			}
		}catch(Exception err){
			System.out.println(err.getMessage());
		}
	}
}
