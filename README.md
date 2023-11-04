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

