
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makanan = sc.nextLine();

        boolean tersedia = false;

        for (int i = 0; i < menu.length; i++) {
            if (makanan.equalsIgnoreCase(menu[i])) {
                tersedia = true;
                break;
            }
        }

        if (tersedia) {
            System.out.println("Makanan " + makanan + " tersedia di menu");
        } else {
            System.out.println("Makanan " + makanan + " tidak tersedia di menu");
        }
        sc.close();
    }
}