public class Dollar1Dispenser extends Dispenser{
    @Override
    public void dispense(Currency currency){
        System.out.println("Trying to dispense 1 Dollars");
        int amount=currency.getAmount();
        int notes=amount/1;
        int remaining = amount%1;
        System.out.println("Dispensed 1 dollars: "+notes);
        if(remaining!=0 && nextDispenser!=null) nextDispenser.dispense(new Currency(remaining));
        
    }
}
