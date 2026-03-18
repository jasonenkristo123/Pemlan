package OOP.inheritence;

public class Pewarisan {
}

class Anjing {
    public void suaraAnjing() {
        System.out.println("Guk guk");
    }
}

class Kucing extends Anjing {
    public void suaraKucing() {
        System.out.println("Meow meow");
    }
}

class Panggil {
    public static void main (String[] args) {
        Anjing anjing = new Anjing();
        Kucing kucing = new Kucing();
        
        anjing.suaraAnjing();
        kucing.suaraAnjing();
        kucing.suaraKucing();
    }
}
