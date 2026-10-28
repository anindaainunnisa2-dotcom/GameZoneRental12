 package gamezonerental1;

import java.util.Scanner;

public class GameZoneRental1 {

    static Scanner input = new Scanner(System.in);

    public static void cetakStruk(
            String nama, String konsol, int durasi,
            int biayaSewa, int diskon, int minuman,
            int total) {

        System.out.println("\n------------------------------------");
        System.out.println("          STRUK GAMEZONE");
        System.out.println("------------------------------------");
        System.out.println("Pelanggan    : " + nama);
        System.out.println("Konsol       : " + konsol);
        System.out.println("Durasi       : " + durasi + " jam");
        System.out.println("Biaya Sewa   : Rp" + biayaSewa);
        System.out.println("Diskon (10%) : Rp" + diskon);
        System.out.println("Minuman      : Rp" + minuman);
        System.out.println("TOTAL BAYAR  : Rp" + total);
        System.out.println("====================================");
    }

    public static void main(String[] args) {

        char transaksi;

        do {
            System.out.println("\n====================================");
            System.out.println("          GAMEZONE RENTAL PS");
            System.out.println("====================================");

            System.out.print("Nama Pelanggan : ");
            String nama = input.nextLine();

            System.out.println("\nPilihan Konsol:");
            System.out.println("1. PlayStation 4 - Rp8000/jam");
            System.out.println("2. PlayStation 5 - Rp12000/jam");

            int pilihan;
            do {
                System.out.print("Pilihan         : ");
                pilihan = input.nextInt();

                if (pilihan != 1 && pilihan != 2) {
                    System.out.println(
                        "Pilihan tidak valid. Masukkan 1 atau 2."
                    );
                }
            } while (pilihan != 1 && pilihan != 2);

            String konsol;
            int harga;

            if (pilihan == 1) {
                konsol = "PlayStation 4";
                harga = 8000;
            } else {
                konsol = "PlayStation 5";
                harga = 12000;
            }

            int durasi;
            do {
                System.out.print("Lama Bermain    : ");
                durasi = input.nextInt();

                if (durasi <= 0) {
                    System.out.println(
                        "Durasi harus berupa bilangan positif."
                    );
                }
            } while (durasi <= 0);

            int biayaSewa = harga * durasi;
            int diskon = 0;

            if (durasi >= 3) {
                diskon = biayaSewa * 10 / 100;
            }

            System.out.print("Tambah Minuman (Y/T): ");
            char pilihanMinuman = input.next().charAt(0);

            int minuman = 0;

            if (pilihanMinuman == 'Y' ||
                pilihanMinuman == 'y') {
                minuman = 5000;
            }

            int total = biayaSewa - diskon + minuman;

            input.nextLine();

            cetakStruk(
                nama, konsol, durasi,
                biayaSewa, diskon, minuman, total
            );

            System.out.print("Transaksi Baru (Y/T): ");
            transaksi = input.next().charAt(0);
            input.nextLine();

        } while (transaksi == 'Y' || transaksi == 'y');

        System.out.println("\nTerima kasih telah menggunakan GameZone!");
        input.close();
    }
}
   

