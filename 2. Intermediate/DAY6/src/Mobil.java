public class Mobil implements java.io.Serializable
{
	Mesin engine;
	public Mobil()
	{
		engine=new Mesin();
	}

	public void maju()
	{
		System.out.println("Maju.....");
	}

	public void hidupkanMesin()
	{
		engine.start();
	}
}
