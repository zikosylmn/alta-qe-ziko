public class Manusia {
    String nama;
    int thnLahir;
    String jenKel;

    public Manusia(String nama, int thnLahir, String jenKel) {
        this.nama = nama;
        this.thnLahir = thnLahir;
        this.jenKel = jenKel;
    }

    public void introduce() {
        String status = "";
        if (this.jenKel.equals("L")) {
            status = "boy";
        } else {
            status = "Girl";
        }
        System.out.println("Hi, My name is " + this.nama);
    }
    public int hitungUmur(){
        int umur = 2023 - this.thnLahir;
        return umur;
    }
}
