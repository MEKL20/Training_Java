abstract class One
{
	abstract void testOne();
}

abstract class Two extends One
{
	abstract void testTwo();
	abstract void testAgain();
}

class Three extends Two
{
	void testOne(){}
	void testTwo()
	{
	}
	void testAgain()
	{
	}
}
