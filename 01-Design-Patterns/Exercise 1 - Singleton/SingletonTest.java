package DesignPatterns.Exercise01;
public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Testing logger instance 1");
        logger2.log("Testing logger instance 2");
        if (logger1 == logger2) {
            System.out.println("Success: Both logger1 and logger2 point to the same instance.");
            System.out.println("Logger1 HashCode: " + logger1.hashCode());
            System.out.println("Logger2 HashCode: " + logger2.hashCode());
        } else {
            System.out.println("Failure: logger1 and logger2 are different instances.");
        }
    }
}
