-di dalam java, ketika kita membuat "literal" bilangan pecahan, by default bilangan tersebut adalah bertype "double" / 64 bit

CASTING
=======
	-adalah proses konversi dari 1 type data ke type data yang lain
	-jenisnya:
	a. implisit casting
		-casting yang dilakukan secara langsung tanpa ada operasi khusus
		-proses ini hanya akan berhasil jika :
			1. kita melakukan casting dari type bit rendah ke bit tinggi
			2. kita melakukan casting dari bilangan bulat ke pecahan

	b. eksplisit casting
		-casting yang dilakukan secara langsung dengan operasi khusus (menyebut type data target)
		-proses ini dibutuhkan jika :
			1. kita melakukan casting dari type bit tinggi ke bit rendah
			2. kita melakukan casting dari bilangan pecahan ke bulat


ARRAY
=====
	-adalah collection / kumpulan banyak data yang type datanya seragam
	-adalah variable yang bisa memuat banyak data, dengan type yang seragam
	-biasanya digunakan untuk menyimpan data sejenis yang jumlahnya banyak & susah disimpan dengan
	variable biasa
		CONTOH:
			-daftar nilai mahasiswa
			-daftar belanjaan / shopping cart
			-daftar gaji karyawan
			dll...
	di dalam java hanya ada 1 jenis array:
	a. array biasa
		-setiap element di index dengan bilangan bulat / integer
		-index terendah selalu 0
		-index tertinggi selalu jumlahElement - 1
		-jika kita mengakses element melebihi index tertinggi, kita akan mendapatkan error:
			java.lang.ArrayIndexOutOfBoundsException

	-di dalam java tidak mengenal "array asosiatif"
		-array asosiatif: array yg indexnya menggunakan string


STRING
=======
	-tidak termasuk type data primitive, tetapi termasuk type data object
	-type ini ada karena bawaan dari standart library java
	-nama lengkap type ini adalah:
		java.lang.String
	-type data ini:
		a. digunakan untuk menyimpan deretan karakter
		b. data harus di apit dengan double quote ("")
	-di dalam type data object kita TIDAK DISARANKAN membandingkan / melakukan equality check,
	menggunakan operator "==", karena hasilnya "tidak terduga"
	-untuk melakukan equality check, gunakan operator equals()

	public static void main(String [] h)
		-parameter String [] di dalam function main, digunakan untuk menangkap parameter 
		yang dikirim dari command line



SUBPROGRAM/FUNCTION/PROCEDURE/METHOD
====================================
	-di java lebih sering disebut dengan "method"
	-adalah block program, dengan ciri2 sebagai berikut:
		a. block punya nama
		b. bisa dipanggil menggunakan namanya
		c. bisa menerima parameter
		d. biasanya dibuat untuk melakukan spesifik task
	-function overloading:
		-kita bisa membuat banyak function, dengan nama yang sama, tetapi:
		a. jumlah parameter
			ATAU
		b. tipe parameter berbeda2
	-jenis function:
		a. void
			-ketika di panggil, dia akan jalan & selesai TANPA me-return sebuah value

		b. non void / bukan void
			-ketika di panggil , dia akan jalan & SEBELUM selesai dia akan me-return sebuah value



java compilation
================
	-jika sebuah source code .java di compile , maka :
	a. akan tergenerate file .class
	b. jumlah file .class akan sama dengan jumlah class yang ada di dalam file tersebut
	c. nama file .class akan sama persis dengan nama class di dalam source code anda
	d. di dalam file yang ada banyak class, hanya boleh ada 1 class yang berlabel "public"
		-dan nama file HARUS SAMA DENGAN nama class yang berlabel public


CLASS
=====
	-adalah "blue print" / "cetakan" dari object
	-dengan 1 class kita bisa membuat BANYAAAAK object
		-analog: 
			-class : cetakan roti
			-object : roti
			kita bisa membuat banyaaak roti (object) menggunakan 1 cetakan roti (class)
	-seni mendesain class adalah skill utama yang dibutuhkan untuk menguasai java
	-langkah2 mendesain class
		1. amati object di real world
			a. object tersebut, punya apa (fields/attributes)?
				-buat daftarnya
			b. object tersebut , bisa apa (method/behaviour)?
				-buat daftarnya

			CONTOH:	
			=======		
			MOBIL
				a. punya apa:
					-roda
					-mesin
					-body

				b. bisa apa:
					-maju
					-mundur
					-belok
					-berhenti

		2. lakukan implementasi
			a. dia punya apa (fields/attributes), implementasikan menjadi variable
			b. dia bisa apa (method/behaviour), implementasikan menjadi function
			c. nama object di real world , jadikan nama class

	-jenis class:
		a. library class
			-class yang TIDAK mempunyai function "public static void main"
			-class ini TIDAK BISA berjalan sendiri
			-biasanya class ini akan di panggil oleh class lain
			-dalam sebuah aplikasi, biasanya hanya ada banyak

		b. main class / Driver class
			-class yang mempunyai function "public static void main"
			-class ini BISA berjalan sendiri
			-biasanya class ini akan memanggil class lain
			-dalam sebuah aplikasi, biasanya hanya ada 1

	-dengan membuat sebuah class, itu berarti kita telah MEMBUAT TYPE DATA BARU
			
STATIC
=======
	-bisa diletakkan di:
	a. field/variable
		-maka field tersebut, alokasi memorinya HANYA SATU dan akan di-refer oleh SEMUA object dari
		class tersebut
		-jika ada salah 1 object mengubah value-nya, maka SEMUA OBJECT akan terdampak
		-static variable MIRIP dengan "global" variable di bahasa lain
		-variable static BOLEH diakses langsung dengan nama class

	b. method/function

	-static rules
		-static mengakses sama2 static --> OK
		-non-static mengakses static --> OK
		-non-static mengakses non-static --> OK
		-static mengakses  non-static --> ERROR
		


CARA MEMBUAT FILE JAR (Java Archive)
====================================
	-jar , adalah cara yang digunakan untuk membundling java app anda yg terdiri dari banyak file .class,
	agar lebih mudah di distribusikan ke end user
	-langkah2 membuat file .jar
		a. buatlah sebuah folder dengan nama: META-INF
			-letak folder, selevel dengan lokasi file .class anda
		b. di dalam folder META-INF, buatlah sebuah file:
			1. nama file : MANIFEST.MF
			2. isi file:-sebutkan nama class utama / main class / class yg di dalamnya
				ada function "public static void main(String [] x)"
		c. gunakan zip tol (winzip/winrar/7 zip), zip semuanya, dengan catatan:
			1. algoritma compression HARUS ZIP
			2. Ekstensi file HARUS .jar

	-JENIS JAVA ARCHIVE
		a. jar (aplikasi java standart)
		b. war (aplikasi web)
		c. ear (enterprise java beans)
			a: biasanya bisa jalan stand alone
			b&c: biasanya harus di deploy di application server



















