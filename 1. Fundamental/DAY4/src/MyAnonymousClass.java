public class MyAnonymousClass
{
	static MyAbstract createObject()
	{
		return new MyAbstract()
		{
			void printMe()
			{
				System.out.println("PRINT ME ....");
			}
		};
	}

	static InterfaceGue buatObject()
        {
                return new InterfaceGue()
                {
                       public  void cetakMe() 
                        {
                                System.out.println("Cetak ME ....");
                        }
                };
        }

}
