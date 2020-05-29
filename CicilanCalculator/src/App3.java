package CicilanCalculator.src;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App3 {
    public static Scanner scanner = new Scanner(System.in);
    private static final int BULAN_DALAM_TAHUN = 12;
    private static final int PERCENT = 100;

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
            hargaAwal = (int) readInputNumber("Harga Awal: ");

            if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
                break;
            }
            System.out.println("Harga minimal 1.000.000");
        }

        while (true) {
            durasiCicilan = (int) readInputNumber("Durasi Cicilan: ");

            if (durasiCicilan >= 1) {
                break;
            }
            System.out.println("Tahun minimal 1");
        }

        while (true) {
            bunga = (int) readInputNumber("Bunga: ");

            if (bunga >= 0) {
                break;
            }
            System.out.println("Bunga minimal 0");
        }

        double bayaranPerBulan = hitungBayaranPerBulan(hargaAwal, durasiCicilan, bunga);

        tampilBayaran(bayaranPerBulan);

        hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
    }

    public static double readInputNumber(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static void tampilBayaran(double bayaranPerBulan) {
        System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");
        System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
    }

    public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
        return (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasiCicilan * BULAN_DALAM_TAHUN);
    }

    public static void hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga,
            double bayaranPerBulan) {
        System.out.println("---------- SISA BAYARAN PER BULAN ----------");
        double sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
        for (int i = 0; i < durasiCicilan * BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
        }
    }
}