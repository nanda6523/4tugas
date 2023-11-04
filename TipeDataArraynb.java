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
