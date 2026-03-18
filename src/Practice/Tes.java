package Practice;

public class Tes {
    
}

class HewanParent {
    int x = 10;
    public void suaraHewan() {
        System.out.println("Suara hewan");
    }
}

class HewanChild extends HewanParent {
    public void suaraKucing() {
        System.out.println("Meow meow");
        System.out.println(super.x);
    }
    
}

class Panggil {
    public static void main (String[] args) {
        HewanChild child = new HewanChild();
        child.suaraHewan();
        child.suaraKucing();
    }
}
