public interface Subject{
    void notifyObservers();
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
}