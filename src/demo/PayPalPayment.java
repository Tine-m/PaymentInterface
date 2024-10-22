package demo;

// Klasse der implementerer Payment-kontrakten for PayPal-betaling
class PayPalPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
