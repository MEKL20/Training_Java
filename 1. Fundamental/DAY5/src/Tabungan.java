public class Tabungan
{
	private int saldo;
	Tabungan(int saldo)
	{
		this.saldo=saldo;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		if(saldo==0){
			System.out.println("Fraud Detected");
		}else{
			this.saldo=saldo;
		}
	}
}
