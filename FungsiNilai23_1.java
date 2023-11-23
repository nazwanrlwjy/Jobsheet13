import java.util.Scanner;

public class FungsiNilai23_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa dan tugas
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jum_mahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas: ");
        int jum_tugas = scanner.nextInt();

        // Inisialisasi array untuk nilai mahasiswa dan nama mahasiswa
        int[][] nilaiMahasiswa = new int[jum_mahasiswa][jum_tugas];
        String[] namaMahasiswa = new String[jum_mahasiswa];

        // Input data mahasiswa dan nilai
        inputDataMahasiswa(scanner, jum_mahasiswa, jum_tugas, namaMahasiswa, nilaiMahasiswa);

        // Menampilkan nilai mahasiswa
        tampilkanNilaiMahasiswa(jum_mahasiswa, jum_tugas, namaMahasiswa, nilaiMahasiswa);

        // Menutup scanner
        scanner.close();
    }

    // Fungsi untuk input data mahasiswa dan nilai
    static void inputDataMahasiswa(Scanner scanner, int jum_mahasiswa, int jum_tugas, String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < jum_mahasiswa; i++) {
            scanner.nextLine(); // Membersihkan buffer
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            for (int j = 0; j < jum_tugas; j++) {
                System.out.print("Masukkan nilai tugas ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan nilai mahasiswa
    static void tampilkanNilaiMahasiswa(int jum_mahasiswa, int jum_tugas, String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("\n===============================================================================");
        System.out.println("|                              Data Nilai Mahasiswa                             |");
        System.out.println("=================================================================================");
        System.out.printf("|%-15s|", "Nama Mahasiswa");
        for (int j = 0; j < jum_tugas; j++) {
            System.out.printf("Tugas %d|", j + 1);
        }
        System.out.println("\n===============================================================================");

        for (int i = 0; i < jum_mahasiswa; i++) {
            System.out.printf("|%-15s|", namaMahasiswa[i]);
            for (int j = 0; j < jum_tugas; j++) {
                System.out.printf("%-7d|", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("=================================================================================");
    }
}