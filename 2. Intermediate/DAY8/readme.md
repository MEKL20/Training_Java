JAVA COLLECTION FRAMEWORK
=========================
	-collection: library yang bisa digunakan untuk menyimpan sekumpulan object mirip seperti array
	-collection dibuat dengan tujuan untuk mengatasi kekurangan yang ada di dalam Array
	-kekurangan Array yang coba diatasi dengan collection:
	a. jumlah element yang kurang flexible (tidak bisa di tambah/kurang)
	b. array hanya bisa menyimpan data yang typenya seragam
	-semua collection ada di dalam package java.util

	-ArrayList
		-mirip seperti Array (index menggunakan bilangan integer, start dari 0), dengan perbedaan:
		a. jumlah element flexible
		b. di dalamnya kita bisa menyimpan data dengan type yang beragam

	-HashMap
		-mirip seperti Array, dengan perbedaan
		a. jumlah element flexible
		b. di dalamnya kita bisa menyimpan data dengan type yang beragam
		c. indexnya TIDAK HARUS berupa bilangan integer

WRAPPER CLASS
=============
	-merupakan library di dalam java.lang (kita tidak perlu import), yang digunakan untuk membungkus
	type primitive agar bisa diperlakukan seperti type Object
	-semua type Primitive mempunya wrapper class.
	-daftar:
		a. bilangan bulat:
			byte-->java.lang.Byte
			short-->java.lang.Short
			int-->java.lang.Integer
			long-->java.lang.Long
		b. bilangan pecahan
			float-->java.lang.Float
			double-->java.lang.Double
		c. karakter
			char-->java.lang.Char
		d. boolean
			boolean-->java.lang.Boolean


JDBC
====
	-java database connectivity
	-adalah sekumpulan library yg digunakan oleh java untuk berinteraksi dengan RDBMS (database)
	-jdbc berada di dalam package : java.sql
	-untuk mengakses sebuah database dari java kita membutuhkan "jdbc driver"
		-jdbc driver bersifat "vendor specific"



































