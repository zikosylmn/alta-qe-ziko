public class Main {
    public static void main(String[] args) {

        Kubus hitung = new Kubus(10);
        hitung.volKubus();
        System.out.println("Volume Kubus : " + hitung.volKubus());

        Balok hitung1 = new Balok(3,6,10);
        hitung1.volBalok();
        System.out.println("Volume Balok : " + hitung1.volBalok());

        Tabung hitung2 = new Tabung(7,10);
        hitung2.volTabung();
        System.out.println("Volume Tabung : " + hitung2.volTabung());
    }
}