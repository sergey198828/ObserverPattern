import observerSubscriber.*;
import subjectPublisher.*;

public class Main {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();

        StockAgent stockAgent1 = new StockAgent(stockGrabber);
        StockAgent stockAgent2 = new StockAgent(stockGrabber);
        StockAgent stockAgent3 = new StockAgent(stockGrabber);

        stockGrabber.setAppleStockPrice(197.5f);
        stockGrabber.setIbmStockPrice(200.4f);
        stockGrabber.setGoogleStockPrice(190.8f);

        stockGrabber.unregister(stockAgent1);
        stockGrabber.setStockPrice(0f,0f,0f);
    }
}