package DesignPatterns.Exercise05;
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;
    public NotifierDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }
    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}
