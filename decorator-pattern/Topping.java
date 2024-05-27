// This is the Topping decorator
// Topping is a type of Pizza and contains a pizza(is-a and has-a)
// Since we add topping to a pizza and after adding it, we get a Pizza
public abstract class Topping implements Pizza{
    Pizza pizza;

    public Topping(Pizza pizza){
        this.pizza=pizza;
    }
}
