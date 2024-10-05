public abstract class Dispenser {

    public Dispenser nextDispenser;

    public void setNext(Dispenser dispenser) {
        nextDispenser = dispenser;
    }

    public abstract void dispense(Currency currency);

}
