import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0, rataNilai;
        int jmlMhs, tertinggi = 0, terendah = 100;
        
        System.out.println("==========================================================");
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        jmlMhs = sc.nextInt();
        System.out.println("==========================================================");

        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (tertinggi < nilaiMhs[i]) {
                tertinggi = nilaiMhs[i];
            }
            if (terendah > nilaiMhs[i]) {
                terendah = nilaiMhs[i];
            }
        }
        rataNilai = total / nilaiMhs.length;
        System.out.println("==========================================================");
        System.out.println("Nilai rata-rata = " + rataNilai);
        System.out.println("Nilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah = " + terendah);
        System.out.println("==========================================================");
        System.out.println("                NILAI SEMUA MAHASISWA");

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i]);
        }
        System.out.println("==========================================================");
        sc.close();
    }
}