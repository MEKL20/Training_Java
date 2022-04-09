import java.io.File;
import java.util.*;

public class SelidikiDirectory
{
	public static void main(String [] bebas)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Nama Directory : ");
		String namaDirectory=s.nextLine();
		File d=new File(namaDirectory);
		if(d.exists()){
			if(d.isDirectory()){
				System.out.println("======ISI DIRECTORY "+namaDirectory+"============");
				String [] daftarFile=d.list();
				for(int i=0;i<daftarFile.length;i++){
					File f=new File(daftarFile[i]);
					System.out.println(daftarFile[i]);
				        System.out.println("Adalah File ? "+f.isFile());
	                        	System.out.println("Hidden ? "+f.isHidden());
        	                	System.out.println("Readable ? "+f.canRead());
                	        	System.out.println("Writeable ? "+f.canWrite());
                        		System.out.println("Path Lengkap ? "+f.getAbsolutePath());
					System.out.println("-----------------------------");
				}
			}else{
				System.out.println("Bukan Directory -_-");
			}
		}else{
			System.out.println("Directory "+namaDirectory+" Tidak ada -_-");
		}
	}
}
