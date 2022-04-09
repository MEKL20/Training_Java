import com.indivaragroup.jdt9.database.*;
import java.sql.*;
import java.util.*;
import javax.xml.parsers.*;
import java.io.*;
import org.w3c.dom.*;
import com.indivaragroup.jdt9.database.*;

public class XMLApp
{
	static Scanner scan=new Scanner(System.in);

	static void menuSatu(KaryawanDAO kd)
	{
		System.out.print("Nama File XML : ");
		String namaFile=scan.nextLine();
		try{
			DocumentBuilder dbf=DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc=dbf.parse(new File(namaFile));
			NodeList nl=doc.getElementsByTagName("Karyawan");
			Node n=nl.item(0);
			Element e=(Element)n;
			Karyawan k=new Karyawan();
			k.setNip(e.getElementsByTagName("nip").item(0).getTextContent());
			k.setNama(e.getElementsByTagName("nama").item(0).getTextContent());
			k.setEmail(e.getElementsByTagName("email").item(0).getTextContent());
			k.setPosisi(e.getElementsByTagName("posisi").item(0).getTextContent());
			k.setGaji(Double.parseDouble(e.getElementsByTagName("gaji").item(0).getTextContent()));
			if(kd.insertKaryawan(k)){
				System.out.println("Insert Sukses");
			}else{
				System.out.println("Insert Gagal");
			}
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuDua(KaryawanDAO kd)
	{
		System.out.print("Nama File XML : ");
                String namaFile=scan.nextLine();
                try{
                        DocumentBuilder dbf=DocumentBuilderFactory.newInstance().newDocumentBuilder();
                        Document doc=dbf.parse(new File(namaFile));
                        NodeList nl=doc.getElementsByTagName("Karyawan");
                        Node n=nl.item(0);
                        Element e=(Element)n;
                        Karyawan k=new Karyawan();
                        k.setNip(e.getElementsByTagName("nip").item(0).getTextContent());
                        k.setNama(e.getElementsByTagName("nama").item(0).getTextContent());
                        k.setEmail(e.getElementsByTagName("email").item(0).getTextContent());
                        k.setPosisi(e.getElementsByTagName("posisi").item(0).getTextContent());
                        k.setGaji(Double.parseDouble(e.getElementsByTagName("gaji").item(0).getTextContent()));
                        if(kd.updateKaryawan(k)){
                                System.out.println("Update Sukses");
                        }else{
                                System.out.println("Update Gagal");
                        }
                }catch(Exception err){
                        System.out.println("Error -_- "+err.getMessage());
                }

	}

	static void menuTiga(KaryawanDAO kd)
	{
		System.out.print("Nama File XML : ");
                String namaFile=scan.nextLine();
                try{
                        DocumentBuilder dbf=DocumentBuilderFactory.newInstance().newDocumentBuilder();
                        Document doc=dbf.parse(new File(namaFile));
                        NodeList nl=doc.getElementsByTagName("Karyawan");
                        for(int i=0;i<nl.getLength();i++){
				Node n=nl.item(0);
	                        Element e=(Element)n;
	                        Karyawan k=new Karyawan();
	                        k.setNip(e.getElementsByTagName("nip").item(0).getTextContent());
	                        k.setNama(e.getElementsByTagName("nama").item(0).getTextContent());
	                        k.setEmail(e.getElementsByTagName("email").item(0).getTextContent());
	                        k.setPosisi(e.getElementsByTagName("posisi").item(0).getTextContent());
	                        k.setGaji(Double.parseDouble(e.getElementsByTagName("gaji").item(0).getTextContent()));
	                        if(kd.insertKaryawan(k)){
                        	        System.out.println("Insert Sukses");
                        	}else{
                        	        System.out.println("Insert Gagal");
                        	}
			}
                }catch(Exception err){
                        System.out.println("Error -_- "+err.getMessage());
                }

	}

	static void menu(KaryawanDAO kd)
	{
		while(true){
			System.out.println("");
			System.out.println("SELAMAT DATANG DI PORTAL HRD");
	                System.out.println("========MENU=========");
	                System.out.println("1. ENTRY KARYAWAN");
	                System.out.println("2. UPDATE KARYAWAN");
			System.out.println("3. INSERT BANYAK DATA KARYAWAN");
	                System.out.print("PILIHAN ANDA ? 1/2/3/Exit : ");
	                String pilihan=scan.nextLine();
			System.out.println("");

	                if(pilihan.equals("1")){
	                        menuSatu(kd);
	                }else if(pilihan.equals("2")){
				menuDua(kd);
			}else if(pilihan.equals("3")){
				menuTiga(kd);
			}else if(pilihan.toLowerCase().equals("exit")){
				System.exit(0);
			}else{
				System.out.println("Menu Pilihan Tidak Ada -_-");
			}
		}
	}

	public static void main(String [] bebas)
	{
		try{
			Database db=new Database();
                	KaryawanDAO kd=new KaryawanDAO(db);
			menu(kd);
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}
}
