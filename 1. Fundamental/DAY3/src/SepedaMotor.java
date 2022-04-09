
public class SepedaMotor
{
	public int roda;
	public int mesin;

	//ini adalah konstruktor
	public SepedaMotor(int roda, int mesin)
	{
		this.roda=roda;
		this.mesin=mesin;
	}

	//ini konstruktor default
	public SepedaMotor()
	{
		//panggil constructor yang lain SDA
		//System.out.println("");==>error tidak boleh ada code diatas this
		this(2,1);
		System.out.println("thisss");
		//this(1,2);===>bisa sekali
	}

	public SepedaMotor(int roda, int mesin, String merek)
        {
                this(roda,mesin);
		System.out.println("Telah dibuat sebuah motor "+merek);
        }

	public void jalan()
	{
		System.out.println("Jalan..."+roda+" roda dan "+mesin+" mesin");
	}
}
