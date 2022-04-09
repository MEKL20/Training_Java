import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.util.*;

public class BacaXML
{
	public static void main(String [] bebas)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Nama File XML : ");
		String namaFile=s.nextLine();
		try{
			File file=new File(namaFile);
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document doc=db.parse(file);
			System.out.println("Element Teratas/Root : "+doc.getDocumentElement().getNodeName());
			NodeList nl=doc.getElementsByTagName("Karyawan");
			for(int i=0;i<nl.getLength();i++){
				Node n=nl.item(i);
				System.out.println("==========="+n.getNodeName()+"==========");
				Element e=(Element)n;
				System.out.println("NIP : "+e.getElementsByTagName("nip").item(0).getTextContent());
				System.out.println("Nama : "+e.getElementsByTagName("nama").item(0).getTextContent());
				System.out.println("Email : "+e.getElementsByTagName("email").item(0).getTextContent());
				System.out.println("Posisi : "+e.getElementsByTagName("posisi").item(0).getTextContent());
				System.out.println("Gaji : "+e.getElementsByTagName("gaji").item(0).getTextContent());
			}
		}catch(Exception err){
			err.getMessage();
		}
	}
}
