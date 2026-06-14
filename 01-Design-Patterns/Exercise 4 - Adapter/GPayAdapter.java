package DesignPatterns.Exercise04;
public class GPayAdapter implements PaymentProcessor {
    private GPay gPayInstance;
    public GPayAdapter(GPay gPayInstance) {
        this.gPayInstance = gPayInstance;
    }
    @Override
    public void processPayment(double amount) {
        gPayInstance.makePayment(amount);
    }
}
