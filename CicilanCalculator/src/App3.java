import java.util.*;

public class App3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Harga Awal = P
        // Durasi Cicilan = D (tahun)
        // Bunga = B
        // Bayaran per bulan = M

        // M = [P + (P * B / 100)] / D * 12
        int hargaAwal;
        int durasiCicilan;
        double bunga;

        while (true) {
            hargaAwal = (int) Konsol.readInputNumber("Harga Awal: ");
            if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
                break;
            }
            System.out.println("Harga minimal 1.000.000");
        }

        while (true) {
            durasiCicilan = (int) Konsol.readInputNumber("Durasi Cicilan: ");
            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("Tahun minimal 1");
        }

        while (true) {
            bunga = (int) Konsol.readInputNumber("Bunga: ");
            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }

        Komponen olah = new Komponen(hargaAwal, durasiCicilan, bunga);

        double bayaranPerBulan = Utama.hitungBayaranPerBulan(olah.getHargaAwal(), olah.getDurasiCicilan(), olah.getBunga());
        Utama.tampilBayaran(bayaranPerBulan);

        Utama.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
    }
}