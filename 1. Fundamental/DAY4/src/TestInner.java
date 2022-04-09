class Outer
{
	void cetakOuter()
	{
		System.out.println("Init Cetak Milik Outer...");
	}

	class Inner
	{
		void cetakInner()
		{
			System.out.println("Ini Cetakk Inner...");
		}

		class DalamInner
	        {
 	               void cetakDalamInner()
        	        {
				cetakOuter();
				cetakInner();
                	        System.out.println("Ini Cetakk Dalam Inner...");
               		 }
        	}

	}
}

public class TestInner
{
	public static void main(String [] bebas)
	{
		Outer luar=new Outer();
		luar.cetakOuter();

		Outer.Inner dalam=luar.new Inner();
		dalam.cetakInner();

		Outer.Inner.DalamInner dalamInner=dalam.new DalamInner();
		dalamInner.cetakDalamInner();
	}
}
