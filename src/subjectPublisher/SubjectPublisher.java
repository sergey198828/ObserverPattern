package subjectPublisher;

import observerSubscriber.*;

public interface SubjectPublisher {
    public void register(ObserverSubscriber observerSubscriber);
    public void unregister(ObserverSubscriber observerSubscriber);
    public void notifyObserverSubscribers();
}
