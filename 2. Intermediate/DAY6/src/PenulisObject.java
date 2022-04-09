import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

public class PenulisObject
{
	public static void main(String [] bebas)
	{
		Mobil avanza=new Mobil();
		avanza.maju();
		avanza.hidupkanMesin();
		try {
			FileOutputStream fos=new FileOutputStream("avanza.dat");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			ObjectOutputStream oos=new ObjectOutputStream(bos);
			oos.writeObject(avanza);
			oos.flush();
			oos.close();
			System.out.println("avanza telah dibekukan");
		}catch(Exception e){
			System.out.println("Error -_- "+e.getMessage());
		}
	}
}
