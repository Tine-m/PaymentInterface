package demo;

public class Main {
    public static void main(String[] args) {
        // Payment er interface
        Payment paymentMethod1 = new CreditCardPayment();
        Payment paymentMethod2 = new PayPalPayment();
        Payment paymentMethod3 = new BankTransferPayment();

        // Uanset hvilken betalingsmetode vi bruger, kan vi altid kalde makePayment()
        paymentMethod1.makePayment(100.00); // Kreditkortbetaling
        paymentMethod2.makePayment(50.00);  // PayPal betaling
        paymentMethod3.makePayment(200.00); // Bankoverførsel
    }
}
