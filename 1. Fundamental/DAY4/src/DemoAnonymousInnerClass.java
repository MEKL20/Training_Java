public class DemoAnonymousInnerClass
{
	public static void main(String [] bebas)
	{
		MyAbstract a=MyAnonymousClass.createObject();
		InterfaceGue b=MyAnonymousClass.buatObject();
		a.printMe();
		b.cetakMe();

		InterfaceGue c=new InterfaceGue()
		{
			public void cetakMe(){
				System.out.println("TESSSTTT");
			}
		};

		c.cetakMe();
	}
}
