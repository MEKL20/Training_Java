import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

public class SwingThread extends JFrame implements Runnable
{
	Container canvas;
	JButton tombol,reset;
	JTextField teks;
	boolean flag=false;
	int angka=0;

	public void run()
	{
		while(true){
			if(flag){
				teks.setText("Detik ke - "+angka);
				angka++;
			}
			try{
				Thread.sleep(1000);
			}catch(Exception err){
				System.out.println("Error -_- "+err.getMessage());
			}
		}
	}

        SwingThread()
        {
                super("StopWatch MEKL");
                canvas=getContentPane();
                canvas.setLayout(new FlowLayout());
                tombol=new JButton("Start/Stop");
                tombol.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				flag=!flag;
			}
		});
		reset=new JButton("Reset");
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				flag=false;
				angka=0;
				teks.setText("");
			}
		});
                teks=new JTextField(25);
		canvas.add(reset);
                canvas.add(teks);
                canvas.add(tombol);
                pack();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
        }

	public static void main(String [] bebas)
	{
		Thread t=new Thread(new SwingThread());
		t.start();
	}
}
