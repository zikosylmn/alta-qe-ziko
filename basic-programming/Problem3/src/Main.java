import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan :");
        int inputBilangan = input.nextInt();

        for (int i = 1; i <= 20; i++){
            {
                if (inputBilangan % i == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}