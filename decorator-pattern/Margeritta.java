// One of the available Pizza
public class Margeritta implements Pizza{
    
    public Margeritta(){
        System.out.println("Created Margeritta");
    }
    @Override
    public int getPrice(){
        return 100;
    }
}
