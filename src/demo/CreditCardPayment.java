package demo;

// Klasse der implementerer Payment-kontrakten for kreditkortbetaling
class CreditCardPayment implements Payment {
    public void makePayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}