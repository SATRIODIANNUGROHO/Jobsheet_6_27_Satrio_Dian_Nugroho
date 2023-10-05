import java.util.Scanner;

public class BookingKamaaar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di layanan booking kamar!");


        double saldo = 0.0;

        System.out.print("Ingin mengisi saldo? (y/n): ");
        String tambahSaldoJawaban = input.next();
        if (tambahSaldoJawaban.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jumlah saldo yang ingin Anda tambahkan: Rp. ");
            saldo = input.nextDouble();
            System.out.println("Saldo Anda sekarang: Rp. " + saldo);
        }


        String[] daftarKamar = {"Kamar Standar Rp. ", "Kamar Deluxe Rp. ", "Suite Rp. "};
        double[] hargaKamar = {200000, 400000, 800000};


        System.out.println("Daftar Kamar:");
        System.out.println("1. Kamar Standar Rp. 200000 /malam");
        System.out.println("2. Kamar Deluxe Rp. 400000 /malam");
        System.out.println("3. Suite Rp. 800000 /malam");
       


        System.out.print("Pilih nomor kamar yang ingin Anda pesan: ");
        int nomorKamar = input.nextInt();
        nomorKamar--;

        if (nomorKamar >= 0 && nomorKamar < daftarKamar.length) {
            System.out.print("Masukkan jumlah kamar yang ingin Anda pesan: ");
            int jumlahKamar = input.nextInt();

            System.out.print("Masukkan jumlah hari menginap: ");
            int jumlahHari = input.nextInt();

            double totalBiaya = hargaKamar[nomorKamar] * jumlahKamar * jumlahHari;


            if (saldo >= totalBiaya) {
              
                saldo -= totalBiaya;
                System.out.println("Pemesanan berhasil!");
                System.out.println("Total biaya: Rp. " + totalBiaya);
                System.out.println("Saldo tersisa: Rp. " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi untuk pemesanan ini.");
            }
        } else {
            System.out.println("Nomor kamar tidak valid.");
        }

        input.close();
    }
}