public class Driver {
    public static void main(String[] args) {
        Auction carAuction = new Auction();
        Observer bidder1 = new Bidder("Bidder1", carAuction);
        Observer bidder2 = new Bidder("Bidder2", carAuction);
        Observer bidder3 = new Bidder("Bidder3", carAuction);
        carAuction.registerObserver(bidder1);
        carAuction.registerObserver(bidder2);
        
        carAuction.auctionPlaced();

        carAuction.registerObserver(bidder3);
        carAuction.auctionPlaced();

        carAuction.unregisterObserver(bidder1);
        carAuction.auctionPlaced();

    }
}
