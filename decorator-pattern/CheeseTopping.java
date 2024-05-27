// Topping is a type of Pizza and contains a pizza(is-a and has-a)
// Since we add topping to a pizza and after adding it, we get a Pizza
public class CheeseTopping implements Topping{
    Pizza pizza;

    public CheeseTopping(Pizza pizza){
        this.pizza=pizza;
        System.out.println("Added Cheese Topping");
    }

    @Override
    public int getPrice(){
        return pizza.getPrice()+20;
    }
}
