public class Luar
{
	void cetakLuar()
	{
		System.out.println("Cetak Luar");
	}

	class Tengah
	{
		void cetakTengah()
		{
			System.out.println("Cetak Tengah");
		}

		class Dalam implements MyIface
		{
			public void cetakDalam()
			{
				System.out.println("Cetak Dalam");
			}
		}
	}
}
