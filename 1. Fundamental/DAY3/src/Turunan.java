class Buyut{
	Buyut(String nama){
		System.out.println("buyut lewat...."+nama);
	}
}

class Kakek extends Buyut{
        Kakek(String nama){
		super(nama);
                System.out.println("kakek lewat....");
        }
}

class Bapak extends Kakek{
        Bapak(String nama){
		super(nama);
                System.out.println("bapka lewat....");
        }
}

class Anak extends Bapak{
        Anak(String nama){
		super(nama);
                System.out.println("anak lewat....");
        }
}

public class Turunan{
	public static void main(String [] bebas){
		Anak mekl=new Anak("MEKL");
	}
}
