package observerSubscriber;


import subjectPublisher.SubjectPublisher;

public class StockAgent implements ObserverSubscriber {
    //Data to store
    private float appleStockPrice;
    private float ibmStockPrice;
    private float googleStockPrice;
    // Identificator
    private static int observerSubscriberIDTracker=0;
    private int observerSubscriberID;
    //Link to publisher
    private SubjectPublisher stockGrabber;
    //Constructor
    public StockAgent(SubjectPublisher stockGrabber){
        this.appleStockPrice=0;
        this.ibmStockPrice=0;
        this.googleStockPrice=0;
        this.stockGrabber = stockGrabber;
        this.observerSubscriberID = ++observerSubscriberIDTracker;
        System.out.println("New observer " + this.observerSubscriberID + "Created");
        this.stockGrabber.register(this);
    }
    //Main subscriber method
    @Override
    public void update(float appleStockPrice, float ibmStockPrice, float googleStockPrice) {
        this.appleStockPrice=appleStockPrice;
        this.ibmStockPrice=ibmStockPrice;
        this.googleStockPrice=googleStockPrice;
        System.out.println(observerSubscriberID + "\nApple: " + appleStockPrice + "USD" + "\n"
                + "IBM: " + ibmStockPrice + "USD" + "\n"
                + "Google:" + googleStockPrice + "USD");
    }
}
