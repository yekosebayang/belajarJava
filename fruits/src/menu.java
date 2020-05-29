public class menu {

	public static void tambahBuah() {
	    while (true){
	        // System.out.print("Nama buah: ");
	        // String inputNama = App2.scanner.next();
	        // System.out.print("Harga buah: ");
	        // int inputHarga = App2.scanner.nextInt();
	        // System.out.print("Stock buah: ");
			// int inputStock = App2.scanner.nextInt();
			String inputNama = console.readInputString("Nama buah: ");
			int inputHarga = (int) console.readInputNumber("Harga buah: ");
			int inputStock = (int) console.readInputNumber("Stock buah: ");
	    
	        Buah buah = new Buah(inputNama, inputHarga, inputStock);
	        
	        App2.listBuah.add(buah); // tambah array
	
	        System.out.println("Isi lagi? (y/n)");
	        String option = App2.scanner.next();
	        if (option.equalsIgnoreCase("n")){
	            System.out.println("Masuk N");
	            break;
	        }
	    }
	}

	public static void tampilBuah() {
	    System.out.println("====================NAMA BUAH=================");
	    for (int i=0; i<App2.listBuah.size(); i++){
	        System.out.println((i+1) + ". " + App2.listBuah.get(i).getNama() + " <> " 
	        + App2.listBuah.get(i).getHarga() + " <> " + App2.listBuah.get(i).getStock() + " pcs");
	    }
	}
    
}