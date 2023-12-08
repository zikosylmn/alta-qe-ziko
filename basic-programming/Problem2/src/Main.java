import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {
        String skor;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai Anda :");
        int inputNilai = input.nextInt();

        if (inputNilai >= 80 && inputNilai <= 100) {
            skor = "A";
            System.out.println(skor);
        } else if (inputNilai >= 65 && inputNilai <= 79) {
            skor = "B+";
            System.out.println(skor);
        } else if (inputNilai >= 50 && inputNilai <= 64) {
            skor = "B";
            System.out.println(skor);
        } else if (inputNilai >= 35 && inputNilai <= 49) {
            skor = "C";
            System.out.println(skor);
        } else if (inputNilai >= 0 && inputNilai <= 34) {
            skor = "D";
            System.out.println(skor);
        } else {
            System.out.println("Tolong Masukkan Nilai Dengan Benar!");
        }
    }

}