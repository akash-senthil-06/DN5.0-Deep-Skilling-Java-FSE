package DesignPatterns.Exercise07;
import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double price;
    public StockMarket(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.price = initialPrice;
        this.observers = new ArrayList<>();
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
