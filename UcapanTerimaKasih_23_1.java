import java.util.Scanner;

public class UcapanTerimaKasih_23_1 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(String nama, String ucapanTambahan) {
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask you anything.\n" +
        ucapanTambahan);
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        String ucapanTambahan = "I am very grateful for the guidance and support you have provided..";
        UcapanTerimaKasih(nama, ucapanTambahan);
    }
}
