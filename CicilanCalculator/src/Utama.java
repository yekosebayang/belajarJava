import java.text.NumberFormat;

public class Utama {

	// tampilBayaran
	public static void tampilBayaran(double bayaranPerBulan) {
	    System.out.println("---------- PEMBAYARAN SETIAP BULAN ----------");
	    System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
	}

	public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
	    return (hargaAwal + (hargaAwal * bunga)) / durasiCicilan;
	}

	public static void hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga,
	        double bayaranPerBulan) {
	    System.out.println("---------- SISA BAYARAN PER BULAN ----------");
	    double sisaBayaran = hargaAwal + (hargaAwal * bunga);
	    for (int i = 0; i < durasiCicilan; i++) {
	        sisaBayaran -= bayaranPerBulan;
	        System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
	    }
	}
    
}