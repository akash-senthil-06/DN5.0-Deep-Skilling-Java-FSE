package DesignPatterns.Exercise08;
public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        PaymentStrategy ccPayment = new CreditCardPayment("John Doe", "1234-5678-9012-3456", "123", "12/28");
        context.setPaymentStrategy(ccPayment);
        System.out.println("Processing first transaction...");
        context.executePayment(250.75);
        PaymentStrategy paypalPayment = new PayPalPayment("johndoe@example.com", "securepass123");
        context.setPaymentStrategy(paypalPayment);
        System.out.println("Processing second transaction...");
        context.executePayment(89.99);
    }
}
