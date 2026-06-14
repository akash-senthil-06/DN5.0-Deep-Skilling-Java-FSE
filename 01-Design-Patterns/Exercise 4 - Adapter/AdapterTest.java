package DesignPatterns.Exercise04;
public class AdapterTest {
    public static void main(String[] args) {
        GPay gpayGateway = new GPay();
        PhonePe phonepeGateway = new PhonePe();
        PaymentProcessor gpayProcessor = new GPayAdapter(gpayGateway);
        PaymentProcessor phonepeProcessor = new PhonePeAdapter(phonepeGateway);
        System.out.println("Processing payments via unified PaymentProcessor interface:");
        gpayProcessor.processPayment(150.00);
        phonepeProcessor.processPayment(275.50);
    }
}
