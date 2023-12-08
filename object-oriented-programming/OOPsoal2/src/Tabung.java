public class Tabung {
    int jari2;
    int tinggi;

    public Tabung(int jari2, int tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public double volTabung(){
        return (double) 22 /7 * this.jari2 * this.jari2 * this.tinggi;
    }
}
