package tugas_pertemuan_7;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.print("Masukkan item barang: ");
        int jumlahBarang = scanner.nextInt();

        String[] kodeBarang = new String[jumlahBarang];
        String[] namaBarang = new String[jumlahBarang];
        double[] hargaBarang = new double[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];
        double[] totalHargaBarang = new double[jumlahBarang];
        
        // Menambahkan variabel totalPembelian
        double totalPembelian = 0;

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            kodeBarang[i] = scanner.next();
            System.out.print("Masukkan Nama Barang: ");
            namaBarang[i] = scanner.next();
            System.out.print("Masukkan Harga Barang: ");
            hargaBarang[i] = scanner.nextDouble();
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();

            // Menghitung total harga untuk setiap barang
            totalHargaBarang[i] = hargaBarang[i] * jumlahBeli[i];

            // Mengakumulasi total pembelian
            totalPembelian += totalHargaBarang[i];
        }

        ArrayList<pembelian> detailPembelianList = new ArrayList<>();

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************");
        System.out.println(" No | Kode Barang | Nama Barang | Harga Barang | Jumlah Beli | Jumlah Bayar ");
        System.out.println("===========================================================================");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println(" " + (i + 1) + "  | " + kodeBarang[i] + "        | " + namaBarang[i] + "        | " + hargaBarang[i] + "       | " + jumlahBeli[i] + "           | " + totalHargaBarang[i]);
        }
        // Menampilkan total pembelian di luar loop
        System.out.println("===========================================================================");
        System.out.println("Total Bayar: " + totalPembelian);
        System.out.println("===========================================================================");
    }
}