import java.util.Scanner;

public class Pemilihan2Percobaan127 {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        int inputTahun;
        System.out.print("Masukkan Tahun : ");
        inputTahun = input27.nextInt();

        if (inputTahun % 4 == 0) {
            if (inputTahun % 100 != 0) 
                System.out.println("Tahun Kabisat");
        }else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}