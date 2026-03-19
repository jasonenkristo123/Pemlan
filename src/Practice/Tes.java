package Practice;

public class Tes {
    
}

class HewanParent {
    int x = 10;
    String namaHewan;
    int umurHewan;

    public HewanParent(String nama, int umur) {
        this.namaHewan = nama;
        this.umurHewan = umur;
    }

    public void suaraHewan() {
        System.out.println("Suara hewan");
    }
}

class HewanChild extends HewanParent {
    String namaAnak;
    int umurAnak;
    public HewanChild(String nama, int umur) {
        super(nama, umur);
        this.namaAnak = nama;
        this.umurAnak = umur;
    }
    public void suaraKucing() {
        System.out.println("Meow meow");
        System.out.println(super.x);
    }
    
}

class Panggil {
    public static void main (String[] args) {
        HewanParent parent = new HewanParent("Anjing", 5);
        HewanChild child = new HewanChild("Kucing", 2);
        System.out.println(parent.namaHewan);
        System.out.println(parent.umurHewan);
        System.out.println(child.namaAnak);
        System.out.print(child.umurAnak);

    }
}
