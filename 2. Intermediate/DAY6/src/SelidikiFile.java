import java.io.File;
import java.util.*;

public class SelidikiFile
{
	public static void main(String [] bebas)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Nama File : ");
		String namaFile=s.nextLine();
		File f=new File(namaFile);
		if(f.exists()){
			System.out.println("Adalah Directory ? "+f.isDirectory());
			System.out.println("Adalah File ? "+f.isFile());
			System.out.println("Hidden ? "+f.isHidden());
			System.out.println("Readable ? "+f.canRead());
			System.out.println("Writeable ? "+f.canWrite());
			System.out.println("Path Lengkap ? "+f.getAbsolutePath());
		}else{
			System.out.println("File "+namaFile+" Tidak ada -_-");
		}
	}
}
