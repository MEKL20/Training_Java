package com.indivaragroup.jdt9.database;

public class Karyawan
{
	private String nip;
	private String nama;
	private String email;
	private String posisi;
	private double gaji;

	public void setNip(String s)
	{
		nip=s;
	}
	public String getNip()
	{
		return nip;
	}

	public void setNama(String s)
        {
                nama=s;
        }
        public String getNama()
        {
                return nama;
        }

	public void setEmail(String s)
        {
                email=s;
        }
        public String getEmail()
        {
                return email;
        }

	public void setPosisi(String s)
        {
                posisi=s;
        }
        public String getPosisi()
        {
                return posisi;
        }

	public void setGaji(double s)
        {
                gaji=s;
        }
        public double getGaji()
        {
                return gaji;
        }
}
