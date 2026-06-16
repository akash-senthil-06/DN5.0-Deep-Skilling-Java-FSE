package DesignPatterns.Exercise07;
public class ObserverTest {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket("AAPL", 150.00);
        Observer mobileClient1 = new MobileApp("ClientAlpha");
        Observer mobileClient2 = new MobileApp("ClientBeta");
        Observer webClient1 = new WebApp("PortalMain");
        appleStock.registerObserver(mobileClient1);
        appleStock.registerObserver(mobileClient2);
        appleStock.registerObserver(webClient1);
        System.out.println("Updating AAPL stock price to $155.25...");
        appleStock.setPrice(155.25);
        System.out.println("Deregistering ClientBeta (mobile)...");
        appleStock.deregisterObserver(mobileClient2);
        System.out.println("\nUpdating AAPL stock price to $160.00...");
        appleStock.setPrice(160.00);
    }
}
