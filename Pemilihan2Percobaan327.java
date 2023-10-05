import java.util.Scanner;

public class Pemilihan2Percobaan327 {
    public static void main(String[] args) {
    
        Scanner input27 = new Scanner(System.in);

        String Kategori;
        int Penghasilan, GajiBersih;
        double Pajak = 0;

        System.out.print("Masukkan Kategori : ");
        Kategori = input27.nextLine();
        System.out.print("Masukkan Penghasilan : ");
        Penghasilan = input27.nextInt();

        if (Kategori.equalsIgnoreCase("Pekerja")) {
            if (Penghasilan <= 2000000)
            Pajak = 0.1;
        else if (Penghasilan <= 3000000)
            Pajak = 0.15;
        else 
            Pajak = 0.2;
        GajiBersih = (int) (Penghasilan - (Pajak * Penghasilan));
        System.out.println("Penghasilan bersih : " + (GajiBersih));
        }else if (Kategori.equalsIgnoreCase("Pebisnis")) {
            if (Penghasilan <= 2500000)
                Pajak = 0.15;
            else if (Penghasilan <= 3500000)
                Pajak = 0.2;
            else 
                Pajak = 0.25;
            GajiBersih = (int) (Penghasilan - (Pajak * Penghasilan));
            System.out.println("Penghasilan Bersih : " + (GajiBersih));
        }else 
            System.out.println("Masukan Kategori Salah");
    }
}
