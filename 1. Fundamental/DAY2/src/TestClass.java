public class TestClass
{
	public static void main(String [] bebas)
	{
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		m1.a=100;
		System.out.println(m1.a);
		System.out.println(m2.a);
		m1.b=123;
		System.out.println(m2.b);
	}
}
