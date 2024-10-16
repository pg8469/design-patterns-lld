public class Driver {
    public static void main(String[] args) {
        // Flat discount
        ShoppingCart cart1 = new ShoppingCart(new FlatDiscount());
        System.out.println(cart1.calculateFinalPrice(1000)); // 700.0
        // Percent discount
        ShoppingCart cart2 = new ShoppingCart(new PercentDiscount());
        System.out.println(cart2.calculateFinalPrice(1000)); // 900.0
    }
}
