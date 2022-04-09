import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

public class DemoSwing3 extends JFrame
{
	Container canvas;
	JButton tombol,tombol2;
	JTextField teks;

	DemoSwing3()
	{
		super("Contoh Swing");
		canvas=getContentPane();
		canvas.setLayout(new FlowLayout());
		tombol=new JButton("Click Me");
		tombol2=new JButton("Hapus");
		tombol.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				teks.setText("Tombol di klik");
			}
		});
		tombol2.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e)
                        {
                                teks.setText("");
                        }
                });
		teks=new JTextField(25);
		canvas.add(tombol2);
		canvas.add(teks);
		canvas.add(tombol);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] bebas)
	{
		new DemoSwing3();
	}
}
