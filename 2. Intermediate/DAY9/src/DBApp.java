
import com.indivaragroup.jdt9.database.*;
import java.sql.*;
import java.util.*;

public class DBApp
{
	static Scanner scan=new Scanner(System.in);

	static void menuSatu(KaryawanDAO kd)
	{
		System.out.println("==============TAMPILKAN SEMUA DATA KARYAWAN=============");
		try{
			ArrayList<Karyawan> ak=kd.getKaryawan();
	                for(int i=0;i<ak.size();i++){
	                	Karyawan k=ak.get(i);
	                        System.out.println("NIP : "+k.getNip());
	                        System.out.println("Nama : "+k.getNama());
	                        System.out.println("Email : "+k.getEmail());
	                        System.out.println("Posisi : "+k.getPosisi());
	                        System.out.println("Gaji : "+k.getGaji());
	                        System.out.println("===============");
        	        }
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
                        System.out.println("NIP : "+k.getNip());
                        System.out.println("Nama : "+k.getNama());
                        System.out.println("Email : "+k.getEmail());
                        System.out.println("Posisi : "+k.getPosisi());
                        System.out.println("Gaji : "+k.getGaji());
                	System.out.println("===============");
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuTiga(KaryawanDAO kd)
	{
		try{
			System.out.println("=================ENRTY DATA KARYAWAN====================");
			System.out.print("NIP : ");
			String nip=scan.nextLine();
			System.out.print("Nama : ");
                        String nama=scan.nextLine();
			System.out.print("Email : ");
                        String email=scan.nextLine();
			System.out.print("Posisi : ");
                        String posisi=scan.nextLine();
			System.out.print("Gaji : ");
                        String gaji=scan.nextLine();

			Karyawan k=new Karyawan();
			k.setNip(nip);
			k.setNama(nama);
			k.setEmail(email);
			k.setPosisi(posisi);
			k.setGaji(Double.parseDouble(gaji));

			if(kd.insertKaryawan(k)){
				System.out.println("Insert Sukses -_-");
			}
		}catch(Exception err){
			System.out.println("Error -_- "+err.getMessage());
		}
	}

	static void menuEmpat(KaryawanDAO kd)
	{
		System.out.println("============DELETE DATA KARYAWAN============");
		System.out.print("NIP Karyawan : ");
		String nip=scan.nextLine();
		try{
			if(kd.deleteKaryawan(nip)){
				System.out.println("Delete Sukses");
			}
                }catch(Exception err){
                        System.out.println("Error -_- "+err.getMessage());
                }
	}

	static void menuLima(KaryawanDAO kd)
	{
		System.out.println("========UPDATE DATA KARYAWAN===========");
		System.out.print("NIP Karyawan : ");
		String nip=scan.nextLine();
		try{
			Karyawan k=kd.findKaryawan(nip);

                        System.out.print("NAMA ("+k.getNama()+") : ");
			String nama=scan.nextLine();
			if(nama.isEmpty()){
				nama=k.getNama();
			}

                        System.out.print("Email ("+k.getEmail()+") : ");
			String email=scan.nextLine();
			if(email.isEmpty()){
                                email=k.getEmail();
                        }

                        System.out.print("Posisi ("+k.getPosisi()+") : ");
			String posisi=scan.nextLine();
			if(posisi.isEmpty()){
                                posisi=k.getPosisi();
                        }

                        System.out.print("Gaji ("+k.getGaji()+") : ");
			String gaji=scan.nextLine();
			if(gaji.isEmpty()){
                                gaji=Double.toString(k.getGaji());
                        }

			Karyawan k2=new Karyawan();
			k2.setNip(k.getNip());
                        k2.setNama(nama);
                        k2.setEmail(email);
                        k2.setPosisi(posisi);
                        k2.setGaji(Double.parseDouble(gaji));

			if(kd.updateKaryawan(k2)){
                                System.out.println("Update Sukses -_-");
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
	                System.out.println("4. HAPUS DATA KARYAWAN");
			System.out.println("5. UPDATE DATA KARYAWAN");
	                System.out.print("PILIHAN ANDA ? 1/2/3/4/5/Exit : ");
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
