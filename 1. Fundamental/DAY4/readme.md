di dalam java, jika kita membuat class TANPA parent class, maka class kita tersebut secara explisit akan menjadi turunan dari "java.lang.Object"

java.lang.Object adalah induk dari semua class di dalam java

INNER CLASS
===========
	-sering juga disebut dengan "nested class"
	-adalah class yang letaknya di dalam class Lain
	-inner class SANGAT INTENSIVE penggunaanya dalam:
		a. GUI programming
		b. Android / Mobile Programming
	-jika class yang di dalamnya ada inner class, jika dicompile file .class yang dihasilkan berformat:
		ClassLuar$ClassDalam$ClassLebihDalam dst....
	-jika kita akan membuat object dari "inner class", maka kita WAJIB membuat object dari outer class
	terlebih dahulu

	-inner class PASTI BISA mengakses method/field milik dari outer classnya TETAPI TIDAK SEBALIKNYA	
		-gunakan prinsip "kaca film"

	-jenis inner class
	a. ordinary inner class
		-inner class biasa
	b. anonymous inner class
		-inner class yang TIDAK MEMPUNYAI NAMA
		-dia WAJIB menjadi turunan dari sebuah class lain ATAU mengimplements interface