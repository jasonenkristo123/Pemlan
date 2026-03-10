package OOP.privat;

public class BankMain {
    public static void main(String[] args) {
        Bank akun1 = new Bank();
        akun1.setName("W");
        akun1.setAccountNumber("12345678");
        akun1.setPassword("habibi");
        akun1.addBalance(1000000);
        akun1.withdrawBalance(500000);
        akun1.displayMessage();
    }
}
