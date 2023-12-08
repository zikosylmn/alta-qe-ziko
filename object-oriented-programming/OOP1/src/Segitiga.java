public class Segitiga {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public int LuasSegitiga(){
        int luas = (this.alas * this.tinggi) / 2;
        return luas;
    }
    public  int KelSegitiga(){
        int kel = this.tinggi * this.alas;
        return kel;
    }
}
