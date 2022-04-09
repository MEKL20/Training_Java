class ClassParent
{
	void jalan()
	{
		while(true)
                {
                        System.out.println("Jalan...");
                        try
                        {
                                Thread.sleep(1000);
                        }catch(Exception e){
                                e.printStackTrace();
                        }
                }
	}
}

class ClassTurunan extends ClassParent implements Runnable
{
	public void run()
	{
		jalan();
	}
}

class Satu extends Thread
{
	public void run()
	{
		int counter=0;
		while(true)
                {
			counter++;
			if(counter==5){
				stop();
			}
                        System.out.println("Jalan..."+counter);
                        try
                        {
                                Thread.sleep(1000);
                        }catch(Exception e){
                                e.printStackTrace();
                        }
                }

	}
}

public class DemoRunnable
{
	public static void main(String [] bebas)
	{
		ClassTurunan ct=new ClassTurunan();
		Thread t=new Thread(ct);
		Satu s=new Satu();
		t.start();
		s.start();
	}
}
