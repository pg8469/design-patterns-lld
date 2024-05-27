// One of the available Pizza
public class VegDelight implements Pizza{

public VegDelight(){
    System.out.println("Created VegDelight");
}

    @Override
    public int getPrice(){
        return 150;
    }
    
}
