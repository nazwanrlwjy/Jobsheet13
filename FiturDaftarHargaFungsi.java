import java.util.Scanner;

public class FiturDaftarHargaFungsi {

    static Scanner sc = new Scanner(System.in);
    static String nama[];
    static int harga[];
    static int stok[];

    public static void main(String[] args) {
        tampilkanMenu();
    }

    static void tampilkanMenu() {
        System.out.println("=============================================");
        System.out.println("\t\tDAFTAR HARGA ");
        System.out.println("=============================================");

        System.out.print("Banyak barang yang akan di input : ");
        int barang = sc.nextInt();

        nama = new String[barang];
        harga = new int[barang];
        stok = new int[barang];

        isiDaftarBarang(barang);
        tampilkanDaftarBarang(barang);
        cariBarang(barang);
    }

    static void isiDaftarBarang(int barang) {
        for (int b = 0; b < barang; b++) {
            System.out.print("Nama Barang " + (b + 1) + " = ");
            nama[b] = sc.next();
            System.out.print("Harga       = ");
            harga[b] = sc.nextInt();
            System.out.print("Banyak Stok = ");
            stok[b] = sc.nextInt();
            System.out.println(" ");
        }
    }

    static void tampilkanDaftarBarang(int barang) {
        System.out.println("================================================");
        System.out.println("|| No. || Nama Barang || Harga || Banyak Stok ||");
        System.out.println("================================================");
        for (int c = 0; c < barang; c++) {
            System.out.printf("|| %-4d|| %-12s|| %-6d|| %-12d||\n", (c + 1), nama[c], harga[c], stok[c]);
        }
        System.out.println("================================================");
    }

    static void cariBarang(int barang) {
        System.out.println("Apakah ingin mencari barang? (y/t)");
        char cari = sc.next().charAt(0);
        System.out.println(" ");
        if (cari == 'Y' || cari == 'y') {
            System.out.println("===== CARI BARANG =====");
            System.out.print("Masukkan nama barang yang ingin dicari: ");
            String barangDicari = sc.next();
            System.out.println(" ");
            boolean ditemukan = false;
            for (int i = 0; i < barang; i++) {
                if (nama[i].equalsIgnoreCase(barangDicari)) {
                    System.out.println("===== Barang ditemukan =====");
                    System.out.println("Nama Barang : " + nama[i]);
                    System.out.println("Harga       : " + harga[i]);
                    System.out.println("Stok        : " + stok[i]);
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Barang tidak ditemukan.");
            }
        }
    }
}