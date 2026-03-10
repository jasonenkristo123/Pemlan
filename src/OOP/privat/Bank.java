package OOP.privat;

import java.util.Scanner;

public class Bank {
    private String name;
    private double balance = 0;
    private String accountNumber;
    private String password;
    Scanner in = new Scanner(System.in);

    public void setName(String name) {
        if (name.length() > 4) {
            System.out.println("Nama harus lebih dari 4 karakter");
            return;
        } else {
            this.name = name;
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() < 8) {
            System.out.println("Nomor rekening harus lebih dari 8 karakter");
            return;
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 8 && !password.contains(password.toUpperCase())) {
            System.out.println("Password harus lebih dari 8 karakter dan mengandung huruf besar");
            return;
        } else {
            this.password = password;
        }
    }

    public void addBalance(double amount) {
        System.out.print("Masukkan password untuk menambah saldo: ");
        String inputPassword = in.nextLine();
        if (amount < 0 && !inputPassword.equals(this.password)) {
            System.out.println("Transaksi gagal, coba cek kembali password atau jumlah yang ingin dimasukkan");
            return;
        } else {
            this.balance += amount;
            System.out.println("Transaksi berhasil, saldo anda sekarang: " + (this.balance));
        }
    }

    public void withdrawBalance(double amount) {
        System.out.print("Masukkan password untuk withdraw saldo: ");
        
        String inputPassword = in.nextLine();
        if (this.balance < amount || amount < 0 || !inputPassword.equals(this.password)) {
            System.out.println("Transaksi gagal, coba cek kembali password atau jumlah yang ingin ditarik");
            return;
        } else {
            this.balance -= amount;
            System.out.println("Transaksi berhasil, saldo anda sekarang: " + (this.balance));
        }
    }

    public void displayMessage() {
        System.out.println();
        System.out.println("Nama: " + this.name);
        System.out.println("Nomor Rekening: " + this.accountNumber);
        System.out.println("Saldo: " + this.balance);
    }

}
