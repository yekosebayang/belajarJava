import java.util.*;

public class App2 {
    public static Scanner scanner = new Scanner(System.in); // biar global gitu
    public static ArrayList<Buah> listBuah = new ArrayList<Buah>(); // bisa masuk ke fn

    public static void main(String[] args) throws Exception {
        // Tampilan menu
        // 1. Tambah buah
        // 2. List buah
        // 3. Exit
        // boolean y = true;
        while (true){
            System.out.println("========== MAIN MENU ==========");
            System.out.print("1. Tambah buah\n" + "2. List buah\n" + "3. Keluar\n" + ">");
            int x = scanner.nextInt(); //store data input dari text diatas
            if (x == 1) {
                System.out.println("Tambah Buah");
                menu.tambahBuah();
            } else if (x == 2) {
                menu.tampilBuah();
            } else {
                System.out.println("Keluar");
                break;
            }
        }

    }
    
}
