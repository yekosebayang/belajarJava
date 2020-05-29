import java.util.*;

public class App2 {
    static Scanner scanner = new Scanner(System.in); // biar global gitu
    static ArrayList<Buah> listBuah = new ArrayList<Buah>(); // bisa masuk ke fn

    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit
        // boolean y = true;
        while (true){
            System.out.println("========== MAIN MENU ==========");
            System.out.print("1. Tambah buah\n" + "2. List buah\n" + "3. Keluar\n" + ">");
            int x = scanner.nextInt();
            if (x == 1) {
                System.out.println("Tambah Buah");
                menu.tambahBuah();
            } else if (x == 2) {
                menu.tampilBuah();
            } else if (x == 3) {
                System.out.println("Keluar");
                break;
            }
        }

    }
    
}
