public class Kubus {
    int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int volKubus () {
        int vol = this.sisi * this.sisi * this.sisi;
        return vol;
    }
}
