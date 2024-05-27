public class MushroomTopping extends Topping{

    public MushroomTopping(Pizza pizza){
        super(pizza);
        System.out.println("Added Mushroom Topping");
    }

    @Override
    public int getPrice(){
        return this.pizza.getPrice()+15;
    }
}
