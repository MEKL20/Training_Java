jika sebuah source code mempunyai package, jangan mengcompile dengan cara masuk ke lokasi package,
tetapi compile dari luar package
CONTOH:
	nama source code : com.indivaragroup.jdt9.database.KaryawanDAO.java
	1. compile yg salah:
		cd com\indivaragroup\jdt9\database
		javac KaryawanDAO.java
	2. compile yg benar
		javac com\indivaragroup\jdt9\database\KaryawanDAO.java

jenis Statement Object
======================
	1. Statement
		-cocok untuk perintah SQL yang bersifat fix (tanpa parameter)
		-perintah SQL belum tercompile, sehingga ketika dikirim ke db, akan di compile oleh db server
		CONTOH :
			String perintahSQL="SELECT * FROM karyawan";

	2. PreparedStatement
		-cocok untuk perintah SQL yang berubah2 (dengan parameter)
		-perintah SQL berbentuk pre-compiled (Sudah tercompile di db server), sehingga ketika
		di execute db server tidak perlu meng-compile
		CONTOH :
			String perintahSQL="SELECT * FROM karyawan WHERE nip=?";
			String sql="INSERT INTO karyawan VALUES('"+nip+"','"+nama+"','"+email+"','"+posisi+"','"+gaji+"')";
		-prepared statement juga lebih secure, karena bisa mencegah terjadinya SQL injection

code akses db yg proper
=======================
	1. buat sebuah class yang mapping terhadap kolom di table
		-class ini akan menggambarkan sebuah "entity object"
		-setiap object dari class ini akan me-representasikan 1 record data di dalam table anda
		-class ini sering juga disebut dengan "model"

	2. buat sebuah class yang menjadi "glue/lem/perekat" yang menghubungkan antara class entity/model
	dengan data di database
		-class ini sering juga disebut dengan DAO (Data Access Object)

	3. buat class yang menggabungkan semuanya, yang digunakan untuk menangkap inputan user & mem-forward
	perintah ke class DAO
		-class ini sering juga disebut dengan "controller"