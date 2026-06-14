package DesignPatterns.Exercise04;
public class PhonePeAdapter implements PaymentProcessor {
    private PhonePe phonePeInstance;
    public PhonePeAdapter(PhonePe phonePeInstance) {
        this.phonePeInstance = phonePeInstance;
    }
    @Override
    public void processPayment(double amount) {
        phonePeInstance.doTransaction(amount);
    }
}
