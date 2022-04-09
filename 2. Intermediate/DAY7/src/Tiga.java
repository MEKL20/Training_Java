class Satu extends Thread
{
	public void run()
	{
		while(true){
			System.out.println("Satu....");
			try{
				Thread.sleep(100);
			}catch(Exception e){
				System.out.println("Error -_- "+e.getMessage());
			}
		}
	}
}

class Dua extends Thread
{
        public void run()
        {
                while(true){
                        System.out.println("Dua....");
			try{
                               Thread.sleep(100);
                        }catch(Exception e){
                                System.out.println("Error -_- "+e.getMessage());
                        }

                }
        }
}

class Empat extends Thread
{
        public void run()
        {
                while(true){
                        System.out.println("Empat....");
                        try{
                                Thread.sleep(100);
                        }catch(Exception e){
                                System.out.println("Error -_- "+e.getMessage());
                        }

                }
        }
}

public class Tiga
{
	public static void main(String [] bebas)
	{
		Satu s=new Satu();
		Dua d=new Dua();
		Empat e=new Empat();
		s.start();
		d.start();
		e.start();
	}
}
