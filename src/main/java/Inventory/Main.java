package Inventory;
import java.util.Scanner;
/**
 *
 * @author kadhim
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Inventory inventory = new Inventory();

        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();
        input.nextLine();

        for(int i = 0; i < jumlahProduk; i++){

            System.out.println("\nProduk ke-" + (i+1));

            System.out.print("Nama produk: ");
            String nama = input.nextLine();

            System.out.print("ID produk: ");
            String id = input.nextLine();

            System.out.print("Kategori: ");
            String kategori = input.nextLine();

            System.out.print("Harga: ");
            double harga = input.nextDouble();

            System.out.print("Stock: ");
            int stok = input.nextInt();
            input.nextLine();

            Product produk = new Product(nama, id, harga, stok, kategori);
            inventory.addProduct(produk);
        }

        System.out.println("\nDaftar Produk:");
        inventory.showProducts();

        System.out.print("\nMasukkan ID produk yang ingin diupdate: ");
        String idCari = input.nextLine();

        Product produk = inventory.findProduct(idCari);

        if(produk != null){

            System.out.println("\n1. Tambah Stock");
            System.out.println("2. Kurangi Stock");
            System.out.print("Pilih opsi: ");
            int pilihan = input.nextInt();

            System.out.print("Jumlah stock: ");
            int jumlah = input.nextInt();

            if(pilihan == 1){
                produk.addStock(jumlah);
            }
            else if(pilihan == 2){
                produk.reduceStock(jumlah);
            }

        } else {
            System.out.println("Produk tidak ditemukan!");
        }

        System.out.println("\nData Produk Setelah Update:");
        inventory.showProducts();

        input.close();
    }
}