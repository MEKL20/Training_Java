CONSTRUCTOR
===========
	merupakan block kode yang mirip method atau function, dgn ciri2 sbb:
	a. namanya PERSIS dengan nama class, tetapi dia tidak ada label void / return type
	b. dipanggil otomatis ketika kita create object
	c. digunakan untuk inisialisasi field/variable agar ketika create object lebih flexible
	
	-jenis konstruktor:
	a. default
		-tanpa parameter
		-jika class memilikinya, maka kita bisa membuat object dengan cara default
		-membuat object cara default: membuat object ketika belum ada constructor
	b. non-default
		-dengan parameter
		-jika class HANYA memiliki konstruktor jenis ini, maka kita TIDAK BISA membuat object 
		dengan cara default

	-sebuah constructor, bisa memanggil contructor yg lain, menggunakan keyword "this", dengan syarat:
	a. pemanggil & yang dipanggil HARUS sama2 constructor
	b. dalam 1 konstruktor, hanya bisa menggunakan "this" 1x DAN harus baris paling atas selain remark


INHERITANCE
===========
	-kita bisa membuat class baru, dengan cara menyatakan class baru tersebut turunan dari class yg sudah 	ada, hasilnya class baru tersebut akan mewarisi (inherit) SEMUA field & method dari class parent-nya

	-overriding: kita membuat function di class turunan ,dimana function tersebut sudah ada di class parent
		-hasilnya: object dari class turunan SUDAH TIDAK BISA memanggil function warisan dari parent

	-jika kita membuat object dari class turunan, maka secara otomatis di memory juga akan terbuat juga
	object dari parent class.
		-urutan pembuatan objectnya adalah dari parent yg tertinggi, kemudian ke bawah
		-object dari parent class otomatis akan dibuatkan oleh JVM
		*) JVM hanya bisa membuatkan object otomatis dari parent class, jika constructor parent class
		adalah default (tanpa parameter)
		-jika parent class memiliki constructor non default, maka class anak harus memanggil 		constructor parent tersebut

POLYMORPHISME
=============
	-POLY: banyak
	-MORPH: bentuk
	-polymorphisme: Object bisa berubah2 bentuk/type ketika runtime (program berjalan)
	sering juga disebut dengan:
		1. RTTI (Runtime Type Identification)
		2. late object binding
	-polymorphisme sering juga disebut dengan "generic programming"
		(+) kita bisa membuat 1 method yang bisa menerima berbagai macam type data
		(-) performance tidak sebaik "early binding"

	-untuk menghasilkan efek polymorph , ada 3 cara:
	1. membuat turunan dari class biasa
		(-) anda HARUS membuat method di parent class, yang mungkin method tersebut TIDAK PERNAH di 			panggil
		(-) boros memory , karena di memory juga akan tercreate object parent class

	2. membuat turunan dari abstract class
		abstract class, adalah class yang mempunyai ciri2:
		a. TIDAK BISA dibuat objectnya dengan operator "new"
		b. minimal memiliki 1 method abstract
			*) method abstract: method tanpa implementasi, hanya kerangka saja

		guidelines membuat abstract class:
		a. jika method implementasi di child class bersifat "spesifik", maka di parent buatlah 
		   "abstract method"
		b. jika method implementasi di child class bersifat "uniform/general", maka di parent buatlah 
		   "real method"

		-turunan dari abstract class WAJIB meng-override method abstract di parent-nya, jika tidak,
		maka class turunan akan ikut menjadi abstract class juga

	3. membuat sebuah class yang mengimplements sebuah atau lebih interface
		interface, adalah block yang "mirip" dengan abstract class, dengan beberapa perbedaan:
		a. di dalam interface SEMUA method HARUS abstract
		b. keyword "abstract" bersifat optional
		c. class yang menggunakan interface TIDAK menggunakan keyword "extends" tetapi "implements"
			-java hanya mengenal "single inheritance", sehingga sebuah class HANYA BISA menjadi
			turunan langsung dari 1 class (extends)
		d. sebuah class BISA mengimplements lebih dari 1 interface
		e. class yang mengimplement sebuah interface maka WAJIB meng-override SEMUA method yg ada
		 di dalam interface & method tersebut HARUS BERLABEL public

	
		
















		