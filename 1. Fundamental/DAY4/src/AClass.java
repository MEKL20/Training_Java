class BClass extends MyAbstract
{
	void printMe()
	{
		System.out.println("pintMe BClass");
	}
}

public class AClass
{
	static void cobaSatu(MyAbstract m)
	{
		m.printMe();
	}

	public static void main(String [] bebas)
	{
		//cara 1
		cobaSatu(new BClass());

		//cara 2
		cobaSatu(new MyAbstract(){
			void printMe()
			{
				System.out.println("printMe langusngg");
			}
		});
	}
}
