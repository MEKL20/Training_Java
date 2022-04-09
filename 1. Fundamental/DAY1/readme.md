JAVA
=====
	-BAHASA turunan dari C/C++
	-punya moto : WORA (Write Once Run Anywhere)
		-multiplatform language

	-kekurangan java:
		a. very complicated language
		b. speed execution-nya tidak secepat native language

	-kelebihan java:
		a. multiplatform
		b. general purpose

	java edition
	============
	-semua edisi java menggunakan bahasa yang sama persis, yaitu Java Programming Language
	-yang membedakan adalah library yg digunakan

	1. Java Standart Edition (JSE)
		-merupakan library basic
		-biasanya digunakan untuk develop aplikasi console/desktop

	2. Java Micro Edition (JME)
		-biasanya digunakan untuk develop aplikasi pada embedded devices
		-contoh embedded devices: smart tv, smart watch,modem,router,smart refrigerator

	3. Java Enterprise Edition (JEE)
		-biasanya digunakan untuk develop aplikasi:
		a. web app
		b. REST API

	4. Android Mobile App


apa yang dibutuhkan untuk develop java app
==========================================
1. text editor (notepad/vi/notepad++/visualstudio code, etc..)
2. JDK (java development Kit) / Java SDK (Software Development Kit)
	-TERDiri dari 2 komponen:
	a. development tools 
		-berisi tools yg digunakan untuk :
			a. compiling
			b. debungging
			c. generate docs..
			dll..
	b. JRE (java runtime environment)
		-tools yg digunakan agar java program yg kita buat bisa running

optional:
java IDE (Integrated Development Environment)
contoh java IDE:
a. eclipse
b. netbeans
c. jetbrains intellij <----
d. oracle jdeveloper
e. ibm websphere studio
dll...



-membuat variable di dalam java:
	syntax:
		type_data nama_var [=value];

	CONTOH:
		int angka;
		boolean benar=true;
		char huruf='a';

	
coding convention nama class
============================
	-diawali dengan UpperCase (huruf besar)
	-diikuti lower case (huruf kecil)
	-jika ketemu kata baru, diawalu upper case
	-diikuti lower case
	-jika ketemu singkatan, ditulis upper case

	CONTOH
	=======
	Motor
	MotorMatic
	MotorMaticButut

	SepedaBMX
	SepedaBMXBaru
	SepedaBMXBaruKredit


coding convention nama Variable/function
========================================
	-diawali lower case (huruf kecil)
	-diikuti lower case (huruf kecil)
	-jika ketemu kata baru, diawalu upper case
	-diikuti lower case
	-jika ketemu singkatan, ditulis upper case

	CONTOH
	======
	angka
	angkaBulat
	angkaBulatLagi
	
	sepedaBMX
	sepedaBMXBaru
	sepedaBMXBaruKredit
	

JENIS TYPE DATA DI DALAM JAVA
==============================
a. primitive data type
	-type data dasar bawaan dari java
	-ciri2nya:
		a. hanya ada 8 type : (byte,short,int,long,float,double,char,boolean)
		b. semua nama typenya merupakan "java keyword", sehingga TIDAK BOLEH digunakan sebagai
			nama class/function/variable
		c. semuanya menggunakan "lower case"

	-ada 8 type, dibagi menjadi 4 family:
	1. bilangan bulat (bilangan yang tidak mengandung point desimal)
		jenisnya:
		a. byte : 8 bit
		b. short: 16 bit
		c. int  : 32 bit
		d. long : 64 bit
		*) makin banyak bit-nya,maka makin panjang range-nya
		*) rumus menghitung range:
			((2^n) - 1)/2
				-1 separo negatif
				-2 separo positif
	

	2. bilangan pecahan (bilangan yang mempunyai point desimal)
		jenisnya:
		a. float  : 32 bit (maksimal 7 point desimal)	
		b. double : 64 bit (maksmial 14 point desimal)

	3. karakter tunggal (hanya bisa memuat 1 karakter & diapit dengan single quote ('))
		a. char : 16 bit / 2 byte
			-ascii code hanya membutuhkan 8 bit
			-java menggunakan unicode (16 bit/2 bytes)
				-tujuannya adalah untuk internationalization support
				-internationalization support: java ingin bisa menyimpan semua karakter selain 				yg standart
	
	4. boolean (hanya bisa memuat 1 diantara 2 value, yaitu true & false)
		a. boolean
			-sering juga disebut dengan type "binary"



b. object/complex/user defined data type
	-merupakan type data yang "bukan" merupakan type data bawaan dari java language
	-type ini ada karena:
		a. library
		b. kita membuat sendiri
	-ciri type data ini adalah, namanya mengikuti convention nama class








sistem bilangan:
a. binary (sistem bilangan yang hanya memuat 2 simbol yaitu 1 & 0 atau true & false)
	-bi: dua
	-biasanya dipakai oleh komputer program

2. octal (sistem bilangan yang hanya memuat 8 simbol, yaitu 0-7)
	-biasa dipakai oleh unix/linux OS untuk mengatur security

3. desimal (sistem bilangan yang hanya memuat 10 simbol, yaitu 0-9)
	-biasa dipakai oleh manusia

4. hexadecimal (sistem bilangan yang hanya memuat 16 simbol, yaitu 0-F)
	-biasa dipakai untuk MAC ADDRESS



control structures
==================
	-sering dijuga dengan "structure" yang digunakan untuk mengatur jalannya program
	-ada 2 jenis control structure:
	a. percabangan (branching)
		-digunakan untuk mengambil keputusan
		-bisa di implement menggunakan 2 cara:
		1. if - else
			-pengujian kondisi HARUS bertype boolean

		2. switch
			-pengujian kondisi HARUS bertype bilangan bulat,karakter atau String


	b. perulangan (looping)
		-digunakan untuk repetitive task (pekerjaan yg sama berulang2)
		-ada 3 jenis loop:
		a. for loop
		b. while loop
		c. do..while




LOGIC OPERATOR
	a. AND (&&)
		-hasilnya akan true jika SEMUA value yg dibandingkan bernilai true
		-jika salah 1 value yg dibandingkan bernilai false, maka hasilnya false
	B. OR (||)
		-hasil akan true JIKA SALAH 1 value yg dibandingkan bernilai true
	C. NOT (!)
		-jika input true maka hasilnya false
		-jika input false maka hasilnya true





break & continue
================
	jika di dalam loop:
	1. break digunakan untuk menghentikan loop secara premature
	2. continue, digunakan untuk memerintahkan loop untuk terus berputar tanpa melakukan apapun
	jika bertemu dengan kondisi tertentu



















































