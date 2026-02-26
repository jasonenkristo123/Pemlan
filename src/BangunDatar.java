public class BangunDatar {
    public static void main(String[] args) {
        Segitiga a = new Segitiga(10, 10);
        Segitiga b = new Segitiga(6, 10);
        Segitiga c = new Segitiga(8, 10);

        b = a;
        b.alas = 20;
        a.alas = 40;
        System.out.println("Luas A " + a.hitungLuas());
        System.out.println("Luas B " + b.hitungLuas());
        System.out.println("Luas C " + c.hitungLuas());
    }
}

class Segitiga {
    double alas;
    double tinggi;

    public Segitiga() {
        System.out.println("Alas segitiganya adalah" + alas);
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

}
