public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public int luasPersegi(){
        int luas = this.sisi * this.sisi;
        return luas;
    }
    public int kelPersegi(){
        int kel = this.sisi * 4;
        return kel;
    }
}
