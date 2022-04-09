package com.indivaragroup.jdt9.database;
import java.sql.*;
import java.util.*;

/*
	INI ADALAH CLASS DAO (Data Access Object)
	CLASS INI MERUPAKAN "GLUE/LEM/PEREKAT" YANG MENGHUBUNGKAN ENTITY CLASS DENGAN DB
*/

public class KaryawanDAO
{
	private Database db;
	private Connection conn;
	private String namaTable="karyawan";

	//CONSTRUCTOR
	public KaryawanDAO(Database db) throws Exception
	{
		this.db=db;
		this.conn=db.konek();
	}

	//METHOD UNTUK MENGAMBIL DATA SEMUA KARYAWAN
	public ArrayList<Karyawan> getKaryawan() throws Exception
	{
		String query="select * from "+namaTable;
		Statement stm=conn.createStatement();
		ResultSet hasil=stm.executeQuery(query);
		ArrayList<Karyawan> semuaKaryawan=new ArrayList<Karyawan>();
		while(hasil.next()){
			Karyawan k=new Karyawan();
			k.setNip(hasil.getString("nip"));
			k.setNama(hasil.getString("nama"));
			k.setEmail(hasil.getString("email"));
			k.setPosisi(hasil.getString("posisi"));
			k.setGaji(hasil.getDouble("gaji"));
			semuaKaryawan.add(k);
		}
		stm.close();
		return semuaKaryawan;
	}

	//METHOD UNTUK MENCARI 1 RECORD KARYAWAN BERDASARKAN NIP
	public Karyawan findKaryawan(String nip) throws Exception
	{
		String query="select * from "+namaTable+" where nip=?";
		PreparedStatement stm=conn.prepareStatement(query);
		stm.setString(1,nip);
		ResultSet hasil=stm.executeQuery();
		Karyawan k=new Karyawan();
		if(hasil.next()){
			k.setNip(hasil.getString("nip"));
                        k.setNama(hasil.getString("nama"));
                        k.setEmail(hasil.getString("email"));
                        k.setPosisi(hasil.getString("posisi"));
                        k.setGaji(hasil.getDouble("gaji"));
		}else{
			throw new Exception("Karyawan NIP "+nip+" Tidak Di Temukan");
		}
		stm.close();
		return k;
	}

	//METHOD UNTUK ENTRY DATA KARYAWAN
	public boolean insertKaryawan(Karyawan k) throws Exception
	{
		String query="insert into "+namaTable+" (nip,nama,email,posisi,gaji) values (?,?,?,?,?)";
		PreparedStatement stm=conn.prepareStatement(query);
		stm.setString(1,k.getNip());
		stm.setString(2,k.getNama());
		stm.setString(3,k.getEmail());
		stm.setString(4,k.getPosisi());
		stm.setDouble(5,k.getGaji());
		int hasil=stm.executeUpdate();
		if(hasil > 0){
			return true;
		}else{
			throw new Exception("INSERT GAGAL -_-");
		}
	}

	//METHOD UNTUK UPDATE DATA KARYAWAN
	public boolean updateKaryawan(Karyawan k) throws Exception
	{
		String query="update "+namaTable+" set nama=?,email=?,posisi=?,gaji=? where nip=?";
		PreparedStatement stm=conn.prepareStatement(query);
		stm.setString(1,k.getNama());
		stm.setString(2,k.getEmail());
		stm.setString(3,k.getPosisi());
		stm.setDouble(4,k.getGaji());
		stm.setString(5,k.getNip());
		int hasil=stm.executeUpdate();
		if(hasil > 0){
                        return true;
                }else{
                        throw new Exception("Update GAGAL -_-");
                }
	}

	//METHOD UNTUK DELETE KARYAWAN
	public boolean deleteKaryawan(String nip) throws Exception
	{
		String query="delete from "+namaTable+" where nip=?";
		PreparedStatement stm=conn.prepareStatement(query);
		stm.setString(1,nip);
		int hasil=stm.executeUpdate();
                if(hasil > 0){
                        return true;
                }else{
                        throw new Exception("DELETE GAGAL -_-");
                }
	}
}
