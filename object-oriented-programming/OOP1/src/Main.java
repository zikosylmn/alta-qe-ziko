import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersegiPanjang hitung = new PersegiPanjang(7, 8);
        hitung.MenghitungLuas();
        hitung.MenghitungKel();
        System.out.println("Luas Persegi Panjang : " + hitung.MenghitungLuas() );
        System.out.println("Keliling Persegi Panjang : " + hitung.MenghitungKel() );

        Segitiga hitung1 = new Segitiga(3, 4);
        hitung1.LuasSegitiga();
        hitung1.KelSegitiga();
        System.out.println("Luas Segitiga : " + hitung1.LuasSegitiga() );
        System.out.println("Keliling Segitiga : " + hitung1.KelSegitiga() );

        Persegi hitung2 = new Persegi(4);
        hitung2.luasPersegi();
        hitung2.kelPersegi();
        System.out.println("Luas Persegi : " + hitung2.luasPersegi() );
        System.out.println("Keliling Persegi : " + hitung2.kelPersegi() );


    }
}

    /*Manusia orang1 = new Manusia("Ziko", 1996, "L");
    orang1.introduce();
    System.out.println("Umur " + orang1.nama + " = " + orang1.hitungUmur());

    Manusia orang2 = new Manusia("Suzy", 1994, "P");
    orang2.introduce();
    System.out.println("Umur " + orang2.nama + " = " + orang2.hitungUmur());*/

//  Scanner input = new Scanner(System.in);
//  int luas1 = input.nextInt();