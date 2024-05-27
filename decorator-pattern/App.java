public class App {
    public static void main(String[] args) {
        Pizza pizza = new CheeseTopping(new MushroomTopping(new CheeseTopping(new Margeritta())));
        System.out.println(pizza.getPrice());
    }
}
