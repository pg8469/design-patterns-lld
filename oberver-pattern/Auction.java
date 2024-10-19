import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject{

    List<Observer> observers;
    double price = 100;

    public Auction(){
        this.observers=new ArrayList<>();
    }

    public double getPrice(){
        return price;
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void auctionPlaced(){
        price+=10;
        notifyObservers();
    }
    
}
