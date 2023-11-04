TUGAS PERTAMA

#  Buatlah perulangan hingga 100 menggunakan Java
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
# Penjelasan Loop
Didalam program ini perulangan terjadi sebanyak 100 kali namun di perulangan ke-10 sampai 100, berbentuk nama Ammar Siraj Ananda, oleh karena itu untuk membuat angka berulang berhenti di angka 9 atau <10 maka masukkan if(a<10) dan System.Out.Printin(x=a); yang dimana a akan berulang 9 kali, agar berhenti di angka 9 tapi perulangan tetap berlanjut, masukkan String nama = "Ammar Siraj Ananda", String ini diperlukan agar else bisa bekerja, masukkan else System.Out.PrintIn(x=nama);
# Kode Perulangan100 Ammar
    public class Perulangan100 {
    public static void main(String[] args) {
        String nama = "Ammar Siraj Ananda";
        for(int a = 1 ; a<=100; a++){
            if(a<10){
                System.out.println(a);
            }
            else{
                System.out.println(nama);
            }
        }
    }
    }
# Maka hasilnya sebagai berikut
    run:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    Ammar Siraj Ananda
    Ammar Siraj Ananda


TUGAS KEDUA

# Buatlah program bebas, dengan menerapkan if else dalam perulangan while
Penjelasan If, Else, dan While, If adalah tipe data yang berfungsi sebagai jika, seperti if(angka % 2 == 0), berarti angka dibagi 2 dengan hasil bilangan bulat akan ada output System.out.println(angka + " adalah angka genap"); dan else, adalah tipe data yang berfungsi berlawanan dengan if, seperti else System.out.println(angka + " adalah angka genap");, yang berarti jika bilangannya bulat dia genap dan begitu pula kebalikannya, namun kita bisa menggunakan while agar fungsi if dan else bisa bekerja, seperti while (angka <= 10) berarti angkat lebih kurang dan sama dengan 10, untuk menentukan angka nya berapa kita gunakan int, dengan masukkan int angka = 1;
# Kode
    public class IfElseWhilenb {
    public static void main(String[] args) {
        int angka = 1;

        while (angka <= 10) {
            if (angka % 2 == 0) /*angka dari 1-10 jika dibagi 2*/ {
                System.out.println(angka + " adalah angka genap");
            } else {
                System.out.println(angka + " adalah angka ganjil");
            }
            angka++;
        }
    }
    }
# Maka hasilnya sebagai berikut
        run:
    1 adalah angka ganjil
    2 adalah angka genap
    3 adalah angka ganjil
    4 adalah angka genap
    5 adalah angka ganjil
    6 adalah angka genap
    7 adalah angka ganjil
    8 adalah angka genap
    9 adalah angka ganjil
    10 adalah angka genap


TUGAS KETIGA

# Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
    import java.util.Scanner;

    public class Zodiaknb{
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan tanggal lahir kalian pakai format, tanggal/bulan ");
            String tanggalLahir = input.nextLine();
            
            int tanggal = Integer.parseInt(tanggalLahir.split("/")[0]);
            int bulan = Integer.parseInt(tanggalLahir.split("/")[1]);
            
            String zodiak = "";
            
            if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
                zodiak = "Aries";
            } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
                zodiak = "Taurus";
            } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
                zodiak = "Gemini";
            } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
                zodiak = "Cancer";
            } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
                zodiak = "Leo";
            } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
                zodiak = "Virgo";
            } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
                zodiak = "Libra";
            } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
                zodiak = "Scorpio";
            } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
                zodiak = "Sagittarius";
            } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
                zodiak = "Capricorn";
            } else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
                zodiak = "Aquarius";
            } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
                zodiak = "Pisces";
            }
            
            System.out.println("Zodiak Anda adalah " + zodiak);
        }
    }
    }
# Penjelasan Kode
Disini saya menggunakan utiitas scanner yang berfungsi supaya kita bisa memasukkan angka di terminal sesuai dengan kode yang terbuat, kemudian saya menggunakan integer parse untuk membuat tanda / menjadi pembagi inputan, agar angka yang dimasukkan menjalankan fungsinya masing-masing dan tidak membuat kode eror, saya menggunakan Aries sebagai fungsi if dan sisanya menggunakan else, cara membacanya ialah if bulan sama dengan 3 dan tanggal lebih dari sama dengan 1 sampai bulan sama dengan 4 dan tanggal kurang dari sama dengan 19, ouputnya Aries selain dari itu dia akan menyesuaikan dengan input kode zodiak lain, cara inputnyanya adalah tanggal/bulan.

#Maka hasilnya sebagai berikut

    run:
    Masukkan tanggal lahir kalian pakai format, tanggal/bulan 
    21/3
    Zodiak Anda adalah Aries
    BUILD SUCCESSFUL (total time: 8 seconds)
    

TUGAS KEEMPAT

#Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for

        public class TipeDataArraynb {
        public static void main(String[] args) {
        int[] angka = {1, 10, 100, 1000, 10000};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Angka-angka: " + java.util.Arrays.toString(angka));
        System.out.println("Total: " + total);
       
    }
    }
# Penjelasan Kode
Tipe Data Array adalah tipe data terstruktur yang merujuk kepada sebuah atau sekumpulan elemen yang mempunyai tipe data yang sama melalui indeks. Array disimpan dengan urutan yang sesuai dengan definisi indeks secara berurutan, Berikut contoh kodenya

    public class TipeDataArraynb {
    public static void main(String[] args) {
        int[] angka = {1, 10, 100, 1000, 10000};
        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Angka-angka: " + java.util.Arrays.toString(angka));
        System.out.println("Total: " + total);
       
    }
    }

Terlihat int[] angka = {1, 10, 100, 1000, 10000}; yang berarti [] adalah memuat banyak data di dalam satu int, kemudian menggunakan for untuk membuat array tersebut tampil nilai seluruhnya, cara membaca  for (int i = 0; i < angka.length; i++) total += angka[i]; adalah for integer i sama dengan 0, i lebih dari panjang angka, i menambahkan angkana sendiri, totalnya ditambah sama dengan angka i, maka output System.out.println("Angka-angka: " + java.util.Arrays.toString(angka)) akan keluar angka 1, 10, 100, 1000, 10000 dan totalnya keluar angka 1+10+100+1000+10000.

#Maka berikut hasilnya

    run:
    Angka-angka: [1, 10, 100, 1000, 10000]
    Total: 11111
    BUILD SUCCESSFUL (total time: 0 seconds)

