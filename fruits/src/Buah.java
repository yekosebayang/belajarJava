public class Buah {
    private String nama;
    private int harga;
    private int stock;
    private int count;

    public Buah(String nama, int harga, int stock) { //array
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }
    // public Buah(int count) { // count
    //     this.count = count;
    // }
    

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        if (nama.length() == 0){
            throw new IllegalArgumentException("Nama buah tidak bisa kosong");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        if (harga <= 0){
            throw new IllegalArgumentException("Masa gratis?");
        }
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if (stock <= 0){
            throw new IllegalArgumentException("kalo 0 stock nya kosong dong");
        }
        this.stock = stock;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        //  if (count == 0){
        //     count = 1;
        // } else {
        //     count = count + 1;
        // }
        this.count = count+1;
    }

    
}