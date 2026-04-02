package OOP.inheritence;

public class Polymor {
}

interface Bapak {
    void kerja();
}

class Anak1 implements Bapak {
    String nama = "Habibi";
    @Override
    public void kerja() {
        System.out.println("Anak 1 bekerja sebagai dokter");
    }
}

class Anak2 extends Anak1 {
    int umur = 25;
    @Override
    public void kerja() {
        System.out.println("Anak 2 bekerja sebagai insinyur");
    }
}

class MainApps {
    public static void main(String[] args) {
        Bapak anak1 = new Anak1();
        Bapak anak2 = new Anak2();

        anak1.kerja(); // Output: Anak 1 bekerja sebagai dokter
        anak2.kerja(); // Output: Anak 2 bekerja sebagai insinyur

        System.out.println();

        System.out.println("Nama anak 1: " + ((Anak1) anak1).nama); // Output: Nama anak 1: Habibi
        System.out.println("Umur anak 2: " + ((Anak2) anak2).umur); // Output: Umur anak 2: 25
        System.out.println("Nama anak 2: " + ((Anak2) anak2).nama); // Output: Nama anak 2: Habibi
    }
}