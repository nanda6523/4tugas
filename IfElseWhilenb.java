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

