public class Komponen {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;
    private static final int BULAN_DALAM_TAHUN = 12;
    private static final int PERCENT = 100;

    public int getHargaAwal() {
        return hargaAwal;
    }
    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal = hargaAwal; 
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }
    public void setDurasiCicilan(int durasiCicilan) {
        this.durasiCicilan = durasiCicilan * BULAN_DALAM_TAHUN;
    }

    public double getBunga() {
        return bunga;
    }
    public void setBunga(double bunga) {
        this.bunga = bunga/PERCENT;
    }

    public Komponen(int hargaAwal, int durasiCicilan, double bunga) {
        this.hargaAwal = hargaAwal;
        this.durasiCicilan = durasiCicilan;
        this.bunga = bunga;
    }
}

    