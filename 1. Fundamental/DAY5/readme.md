PACKAGE
=======
	-mekanisme yang digunakan untuk mengatur letak source code,
	agar program menjadi lebih rapi
	-package berbentuk "kumpulan folder"
	-desain package yang baik,adalah menggunakan nama domain company/institusi, kita balik & nama modul / 	nama app
	contoh:
		-nama domain institusi:
			itb.ac.id
		-nama aplikasi:
			tracking
		-nama modul di dalam aplikasi:
			database
				-mysql
				-postgresql
				-oracle
			io
			ai

		-nama root package yang di rekomendasikan:
			id.ac.itb.tracking
		-nama sub-package:
			id.ac.itb.tracking.database
			id.ac.itb.tracking.database.mysql
			id.ac.itb.tracking.database.postgresql
			id.ac.itb.tracking.database.oracle
			id.ac.itb.tracking.io
			id.ac.itb.tracking.ai
	-setiap "fragment" nama package di implementasikan dengan 1 folder
		CONTOH:
			id.ac.itb.tracking
			WINDOWS C:\labs\id\ac\itb\tracking
			LINUX/UNIX /home/labs/id/ac/itb/tracking

	-asumsi:
		-nama domain institusi:
			indivaragroup.com
		-nama aplikasi:
			jdt9
		-nama module:
			mylib
		-nama root package:
			com.indivaragroup.jdt9
		-nama sub package
			com.indivaragroup.jdt9.mylib

		implementasi
			...src\com\indivaragroup\jdt9\mylib







BEST PRACTICES UNTUK ACCESS MODIFIER
=====================================
	a. buatlah SEMUA field PRIVATE
	b. buatlah method get & set "public" untuk masing2 field






JENIS ERROR YANG DIJUMPAI OLEH PROGRAMMER
=========================================
1. syntax error
	-error yg disebabkan karena "salah ketik"
	-ini adalah error TERMUDAH ditemukan
	-yg bertugas menemukan/mendeteksi adalah compiler

2. runtime error (Exception)
	-dari segi syntax semuanya OK
	-ketika compile sukses
	-tetapi ketika running, error
	-yg bertugas menemukan/mendeteksi adalah runtime (jre/jvm)

3. logic error
	-dari segi syntax semuanya OK
	-ketika compile sukses
	-dieksekusi OK
	-end resultnya error

Exception adalah nama lain dari runtime error
-tujuan utama kita melakukan exception handling adalah:
	1. memberikan pesan error yang lebih deskriptif ke end user
	2. melakukan action yang dilakukan untuk menghindari error yang lebih parah

-keyword2 yang digunakan dalam exception handling:
1. try
	-dipasang pada bagian program yang ada kemungkinan terjadi error
2. catch
	-dipasangan berpasangan dengan block try
	-tujuannya adalah untuk melakukan "action" jika di block try terjadi error
3. finally
	-dipasang setelah "catch"
	-bersifat optional
	-akan selalu dijalankan, baik ada error maupun tidak
	-block ini digunakan untuk clean up resources
		contoh: close db connection, close file, close network dll...
4. throw
5. throws

-pilihan dalam menangani exception:
	1. kita tidak menangani
		(+) kode program lebih simple & lebih singkat
		(-) jika terjadi error, end user tidak mendapatkan pesan error yg deskriptif
	2. membuat 1 exception handler generic (apapun errornya, maka 1 handler itu digunakan untuk semuanya)
		(+) error sudah tertangani dengan baik
		(+) user sudah mendapatkan pesan error yg deskriptif
		(-) kita tidak bisa melakukan "specific" action for specific error
	3. membuat exception handler berjenjang/bertingkat
		(+) error sudah tertangani dengan baik
		(+) user sudah mendapatkan pesan error yg deskriptif
		(+) kita bisa melakukan "specific" action for specific error
		(-) kode program menjadi sangat panjang





















	
	


		
		
			
				
		
	