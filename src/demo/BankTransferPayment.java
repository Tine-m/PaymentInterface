package demo;

// Klasse der implementerer Payment-kontrakten for bankoverførsel
class BankTransferPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }
}