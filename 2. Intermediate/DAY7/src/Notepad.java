import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame
{
	JMenuBar bar;
	JMenu fileMenu;
	JMenuItem fileMenuOpen,fileMenuExit;
	JTextArea teks;
	JScrollPane scroller;
	JFileChooser chooser;
	Container canvas;

	Notepad()
	{
		super("Notepad JDT 9 Edition");
		bar=new JMenuBar();
		fileMenu=new JMenu("File");
		fileMenuOpen=new JMenuItem("Open");
		fileMenuOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int tangkap=chooser.showOpenDialog(canvas);
				if(tangkap==JFileChooser.APPROVE_OPTION){
					File f=chooser.getSelectedFile();
					try{
						FileReader fr=new FileReader(f);
						BufferedReader br=new BufferedReader(fr);
						String data=null;
						StringBuffer tampil=new StringBuffer();
						while((data=br.readLine())!=null){
							tampil.append(data+"\n");
						}
						teks.setText(tampil.toString());
						br.close();
						fr.close();
					}catch(Exception err){
						System.out.println("Error -_- "+err.getMessage());
					}
				}
			}
		});
		fileMenuExit=new JMenuItem("Exit");
		fileMenuExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Jangan Buka Lagi Kalau Ujungnya di Close -_-");
				System.exit(0);
			}
		});
		fileMenu.add(fileMenuOpen);
		fileMenu.add(fileMenuExit);
		bar.add(fileMenu);
		setJMenuBar(bar);
		canvas=getContentPane();
		teks=new JTextArea(10,50);
		chooser=new JFileChooser();
		scroller=new JScrollPane(teks);
		canvas.add(scroller);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String [] bebas)
	{
		new Notepad();
	}
}
