
public class Dollar5Dispenser extends Dispenser {
      
    @Override
    public void dispense(Currency currency){
        System.out.println("Trying to dispense 5 Dollars");
        int amount=currency.getAmount();
        int notes=amount/5;
        int remaining = amount%5;
        System.out.println("Dispensed 5 dollars: "+notes);
        if(remaining!=0 && nextDispenser!=null) nextDispenser.dispense(new Currency(remaining));
        
    }
}
