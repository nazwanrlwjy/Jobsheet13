public class ProgramKu {
    public static void TampilhinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }
    public static void TampilJumlah(int bil1, int bil2) {
        TampilhinggaKei(Jumlah(bil1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}