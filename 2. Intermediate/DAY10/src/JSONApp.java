import com.indivaragroup.jdt9.database.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import com.google.gson.*;

public class JSONApp
{
	static Scanner scan=new Scanner(System.in);
	static Gson jsonConvert=new Gson();

	static void menuSatu(KaryawanDAO kd)
	{
		System.out.println("==============TAMPILKAN SEMUA DATA KARYAWAN=============");
		try{
			ArrayList<Karyawan> k=kd.getKaryawan();
			String kJson=jsonConvert.toJson(k);
			System.out.println(kJson);
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuDua(KaryawanDAO kd)
	{
		System.out.println("==============PENCARIAN DATA KARYAWAN=============");
		try{
			System.out.print("NIP Karyawan : ");
			String nip=scan.nextLine();
			Karyawan k=kd.findKaryawan(nip);
                        String kJson=jsonConvert.toJson(k);
			System.out.println(kJson);
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuTiga(KaryawanDAO kd)
	{
		System.out.print("Lokasi File JSON : ");
		String namaFile=scan.nextLine();
		try{
			BufferedReader br=new BufferedReader(new FileReader(namaFile));
			String data=null;
			StringBuilder penyambung=new StringBuilder();
			while((data=br.readLine())!=null){
				penyambung.append(data.trim());
			}
			//System.out.println(penyambung.toString());
			Karyawan k=jsonConvert.fromJson(penyambung.toString(),Karyawan.class);
			if(kd.insertKaryawan(k)){
				System.out.println("Insert Sukses ..");
			}else{
				System.out.println("Insert Gagal -_-");
			}
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuEmpat(KaryawanDAO kd)
        {
                System.out.print("Lokasi File JSON : ");
                String namaFile=scan.nextLine();
                try{
                        BufferedReader br=new BufferedReader(new FileReader(namaFile));
                        String data=null;
                        StringBuilder penyambung=new StringBuilder();
                        while((data=br.readLine())!=null){
                                penyambung.append(data.trim());
                        }

                        Karyawan k=jsonConvert.fromJson(penyambung.toString(),Karyawan.class);
                        if(kd.updateKaryawan(k)){
                                System.out.println("Update Sukses ..");
                        }else{
                                System.out.println("Update Gagal -_-");
                        }
                }catch(Exception err){
                        System.out.println("Error -_- "+err.getMessage());
                }
        }

	static void menuLima(KaryawanDAO kd)
        {
                System.out.print("Lokasi File JSON : ");
                String namaFile=scan.nextLine();
                try{
                        BufferedReader br=new BufferedReader(new FileReader(namaFile));
                        String data=null;
                        StringBuilder penyambung=new StringBuilder();
                        while((data=br.readLine())!=null){
                                penyambung.append(data.trim());
                        }

                        Karyawan[] k=jsonConvert.fromJson(penyambung.toString(),Karyawan[].class);
			for(int i=0;i<k.length;i++){
                        	if(kd.insertKaryawan(k[i])){
                        	        System.out.println("Insert Sukses ..");
                        	}else{
                        	        System.out.println("Insert Gagal -_-");
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
	                System.out.println("1. TAMPILKAN DATA SEMUA KARYAWAN");
	                System.out.println("2. PENCARIAN KARYAWAN");
			System.out.println("3. ENTRY DATA KARYAWAN");
			System.out.println("4. UPDATE DATA KARYAWAN");
			System.out.println("5. ENTRY DATA KARYAWAN BANYAK");
	                System.out.print("PILIHAN ANDA ? 1/2/3/Exit : ");
	                String pilihan=scan.nextLine();
			System.out.println("");

	                if(pilihan.equals("1")){
	                        menuSatu(kd);
	                }else if(pilihan.equals("2")){
				menuDua(kd);
			}else if(pilihan.equals("3")){
				menuTiga(kd);
			}else if(pilihan.equals("4")){
				menuEmpat(kd);
			}else if(pilihan.equals("5")){
				menuLima(kd);
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
