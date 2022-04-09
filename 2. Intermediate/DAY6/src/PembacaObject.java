import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class PembacaObejct
{
	public static void main(String [] bebas)
	{
		try{
			FileInputStream fis=new FileInputStream("avanza.dat");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Mobil veloz=(Mobil)ois.readObject();
			veloz.maju();
			veloz.hidupkanMesin();
		}catch(Exception e){
			System.out.println("Error -_-"+e.getMessage());
		}
	}
}
