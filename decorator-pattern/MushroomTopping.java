// Topping is a type of Pizza and contains a pizza(is-a and has-a)
// Since we add topping to a pizza and after adding it, we get a Pizza
public class MushroomTopping implements Topping{
    Pizza pizza;

    public MushroomTopping(Pizza pizza){
        this.pizza=pizza;
        System.out.println("Added Mushroom Topping");
    }

    @Override
    public int getPrice(){
        return pizza.getPrice()+15;
    }
}
