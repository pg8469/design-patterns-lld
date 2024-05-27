public class CheeseTopping extends Topping{

    public CheeseTopping(Pizza pizza){
        super(pizza);
        System.out.println("Added Cheese Topping");
    }

    @Override
    public int getPrice(){
        return this.pizza.getPrice()+20;
    }
}
