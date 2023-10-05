import java.util.Scanner;

public class Pemilihan2Percobaan227 {
    public static void main(String[] args) {
        
        Scanner input27 = new Scanner(System.in);
        
        int SudutA;
        System.out.print("Masukkan Sudut A : ");
        SudutA = input27.nextInt();

        int SudutB;
        System.out.print("Masukkan Sudut B : ");
        SudutB = input27.nextInt();

        int SudutC;
        System.out.print("Masukkan Sudut C : ");
        SudutC = input27.nextInt();
        int TotalSudut;
        TotalSudut = SudutA + SudutB + SudutC;
        if (TotalSudut == 180) {
            if (SudutA == 90 || SudutB == 90 || SudutC == 90) 
                System.out.println("Segitiga Tersebut Merupakan Segitiga Siku-Siku");
            else if ((SudutA < SudutB && SudutA < SudutC && SudutB == SudutC) ||
                     (SudutB < SudutA && SudutB < SudutC && SudutA == SudutC) ||
                     (SudutC < SudutA && SudutC < SudutB && SudutA == SudutB))
                System.out.println("Segitiga Tersebut Merupakan Segitiga Sama Kaki");
            else if (SudutA == SudutB && SudutA == SudutC && SudutB == SudutC)
                System.out.println("Segitiga Tersebut Merupakan Segitiga Sama Sisi");
            else 
                System.out.println("Segitiga Tersebut Merupakan Segitiga Sembarang");
        } else {
            System.out.println("Bukan Segitiga");
        }
        
    }

}
