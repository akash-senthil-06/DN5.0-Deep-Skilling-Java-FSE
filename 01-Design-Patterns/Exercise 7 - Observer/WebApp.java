package DesignPatterns.Exercise07;
public class WebApp implements Observer {
    private String name;
    public WebApp(String name) {
        this.name = name;
    }
    @Override
    public void update(String stockName, double price) {
        System.out.println("[Web Portal - " + name + "] Notification: Stock " + stockName + " price changed to $" + price);
    }
}
