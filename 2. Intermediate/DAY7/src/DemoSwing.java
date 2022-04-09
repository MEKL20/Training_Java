import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;

public class DemoSwing
{
	JFrame frame;
	Container canvas;
	JButton tombol;
	JTextField teks;

	DemoSwing()
	{
		frame=new JFrame("Contoh Swing");
		canvas=frame.getContentPane();
		canvas.setLayout(new FlowLayout());
		tombol=new JButton("Click Me");
		teks=new JTextField(25);
		canvas.add(teks);
		canvas.add(tombol);

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] bebas)
	{
		new DemoSwing();
	}
}
