public class Bidder implements Observer{

    String name;
    Auction auction;
    public Bidder(String name, Auction auction){
        this.name=name;
        this.auction=auction;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public void update() {
        System.out.println("["+name+"]"+ " Bid placed, current price is " + auction.getPrice());
    }
    
}
