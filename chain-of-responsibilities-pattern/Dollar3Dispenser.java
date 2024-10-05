public class Dollar3Dispenser extends Dispenser{
    @Override
    public void dispense(Currency currency){
        System.out.println("Trying to dispense 3 Dollars");
        int amount=currency.getAmount();
        int notes=amount/3;
        int remaining = amount%3;
        System.out.println("Dispensed 3 dollars: "+notes);
        if(remaining!=0 && nextDispenser!=null) nextDispenser.dispense(new Currency(remaining));
        
    }
}
