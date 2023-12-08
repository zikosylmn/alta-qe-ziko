public class PersegiPanjang {
    int lebar;
    int panjang;

    public PersegiPanjang(int lebar, int panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
    public int MenghitungLuas(){
        int luas = this.lebar * this.panjang;
        return luas;
    }
    public double MenghitungKel(){
        double keliling = 2 * (this.panjang + this.lebar);
        return keliling;
    }
}
