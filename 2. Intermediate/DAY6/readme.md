java.util.Scanner
=================
	-library di package java.util
	-digunakan untuk menangkap inputan dari keyboard secara interactive

	
java.io
========
	-merupakan library basic (Java Standart Library) yang kita gunakan untuk berurusan dengan input/output
	-contoh i/o:
		-File
		-Directory
		-Standart Input/Output

	-java.io.File
		-merupakan library yang digunakan untuk meng-investigasi properties dari file / directory

	-java.io.FileInputStream
		-merupakan library yang digunakan untuk membaca isi file dalam mode byte / char
		-cocok digunakan untuk membaca file binary yang nantinya akan di copy ke tempat lain

	-java.io.FileOutputStream
		-merupakan library yang digunakan untuk menulis isi file dalam mode byte / char
		-cocok digunakan untuk membaca file binary yang nantinya akan di copy ke tempat lain

	-java.io.BufferedInputStream
		-merupakan library yang digunakan untuk melakukan "buffering ke memory", setelah membaca isi 			file dalam mode byte / char
		-biasanya digunakan untuk mempercepat proses penulisan / copy


	-java.io.BufferedOutputStream
		-merupakan library yang digunakan untuk melakukan "buffering ke memory", sebelum menulis isi 			file dalam mode byte / char
		-biasanya digunakan untuk mempercepat proses penulisan / copy

	-java.io.FileReader
		-merupakan library yang digunakan untuk membaca isi file dalam mode String
		-cocok digunakan untuk membaca file dan isinya di tampilkan ke browser/GUI component
		-FileReader biasanya digunakan bersamaan dengan java.io.BufferedReader


	-java.io.FileWriter
		-merupakan library yang digunakan untuk menulis isi file dalam String
		-jangan gunakan library ini untuk copy file binary

	-java.io.Serializable
		-adalah sebuah "marker" interface
		-jika sebuah Class implements interface ini, maka object dari class tersebut akan di tandai
		sebagai "serializable object"
		-serializable object: object yg bisa di tulis ke file atau di transfer via network
		-jika anda menggunakan tehnik "object composition" ATAU "has-a relationship", dan 
		ingin melakukan serialisasi, maka SEMUA object di dalam class anda harus merupakan
		implementor dari java.io.Serializable
		

























	