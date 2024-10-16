public class PercentDiscount implements DiscountStrategy{
    @Override
    public double getFinalPriceAfterDiscount(double price){
        // Flat 10% off
        return price*0.9;
    }
}
