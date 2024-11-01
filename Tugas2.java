
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
            totalBiaya += hargaPesanan[i];
        }
   
        System.out.println("\nDaftar pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1) + ": " + namaPesanan[i] + " - " + hargaPesanan[i]);
        }
        System.out.println("Total harga pesanan: " + totalBiaya);
}
}