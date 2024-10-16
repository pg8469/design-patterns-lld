public class FlatDiscount implements DiscountStrategy{
    @Override
    public double getFinalPriceAfterDiscount(double price){
        // Flat 100 off if >=500 or Flat 300 off if >=1000
        if(price>=1000){
            return price-300.0;
        }
        if(price>=500){
            return price-100.0;
        }
        return price;
    }
}
