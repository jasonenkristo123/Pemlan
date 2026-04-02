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


interface PaymentMethod {
    void pay(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}

class Qris implements  PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using QRIS");
    }
}

class Checkout {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod qris = new Qris();

        checkout.processPayment(creditCard, 100.0);
        checkout.processPayment(qris, 50.0);
    }
} 


class Parent {
    String nama;
    int umur;

    public Parent(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    void displayMessage() {
        System.out.println("Namaku " + nama + " umur " + umur);
    }
}

class Child extends Parent {
    String sekolah;
    public Child(String nama, int umur, String sekolah) {
        super(nama, umur);
        this.sekolah = sekolah;
    }
    @Override
    void displayMessage() {
        System.out.println("Namaku " + nama + " umur " + umur + " sekolah " + sekolah);
    }
}

class Panggilan {
    public static void main(String[] args) {
        Parent parent = new Parent("Dihgo", 19);
        Parent child = new Child("Asep", 19, "Brawijaya");

        parent.displayMessage();
        child.displayMessage();
    }
}

