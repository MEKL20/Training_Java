import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

public class DemoSwing2 extends JFrame
{
	Container canvas;
	JButton tombol;
	JButton hapus;
	JTextField teks;

	public class AksiTombol implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			setVisible(false);
			new DemoSwing2("Hapus");
		}
	}

	public class AksiHapus implements ActionListener
        {
                public void actionPerformed(ActionEvent e)
                {
			setVisible(false);
                        new DemoSwing2();                }
        }

	DemoSwing2()
	{
		super("Contoh Swing 2");
		canvas=getContentPane();
		canvas.setLayout(new FlowLayout());
		//hapus=new JButton("Hapus");
		//hapus.addActionListener(new AksiHapus());
		tombol=new JButton("Tulis");
		tombol.addActionListener(new AksiTombol());
		teks=new JTextField(25);
		//canvas.add(hapus);
		canvas.add(teks);
		canvas.add(tombol);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

        DemoSwing2(String s)
        {
                super("Contoh Swing 2");
                canvas=getContentPane();
                canvas.setLayout(new FlowLayout());
                hapus=new JButton("Hapus");
                hapus.addActionListener(new AksiHapus());
                tombol=new JButton("Tulis");
                tombol.addActionListener(new AksiTombol());
                teks=new JTextField(25);
		teks.setText("Tombol ini di click");
                canvas.add(hapus);
                canvas.add(teks);
                canvas.add(tombol);
                pack();
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
                setLocationRelativeTo(null);
        }

	public static void main(String [] bebas)
	{
		new DemoSwing2();
	}
}
