package subjectPublisher;

import observerSubscriber.ObserverSubscriber;

import java.util.ArrayList;
import java.util.Observer;

public class StockGrabber implements SubjectPublisher {
//Subscribers
    private ArrayList<ObserverSubscriber> subscribersList;
//Data to publish
    private float appleStockPrice;
    private float ibmStockPrice;
    private float googleStockPrice;
//Constructor
    public StockGrabber(){
        this.subscribersList=new ArrayList<ObserverSubscriber>();
        this.appleStockPrice=0;
        this.ibmStockPrice=0;
        this.googleStockPrice=0;
    }
//Data setters
    public void setStockPrice(float appleStockPrice, float ibmStockPrice, float googleStockPrice){
        this.appleStockPrice=appleStockPrice;
        this.ibmStockPrice=ibmStockPrice;
        this.googleStockPrice=googleStockPrice;
        this.notifyObserverSubscribers();
    }
    public void setAppleStockPrice(float appleStockPrice){
        this.appleStockPrice=appleStockPrice;
        this.notifyObserverSubscribers();
    }
    public void setIbmStockPrice(float ibmStockPrice){
        this.ibmStockPrice=ibmStockPrice;
        this.notifyObserverSubscribers();
    }
    public void setGoogleStockPrice(float googleStockPrice){
        this.googleStockPrice=googleStockPrice;
        this.notifyObserverSubscribers();
    }
//Publisher main methods
    @Override
    public void register(ObserverSubscriber newObserverSubscriber) {
        this.subscribersList.add(newObserverSubscriber);
    }

    @Override
    public void unregister(ObserverSubscriber deleteObserverSubscriber) {
        int observerIndex=this.subscribersList.indexOf(deleteObserverSubscriber);
        this.subscribersList.remove(observerIndex);
        System.out.println("ObserverSubscriber" + (observerIndex+1) + " is deleted");
    }

    @Override
    public void notifyObserverSubscribers() {
        for(ObserverSubscriber o : subscribersList)
            o.update(this.appleStockPrice,this.ibmStockPrice,this.googleStockPrice);
    }
}
