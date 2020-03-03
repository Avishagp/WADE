import java.util.ArrayList;

//import okhttp3.*;

/**
 * The DataPoller abstract class - Determines polling methods resources and strategies, e.g.: usage of databases,
 * proxies, external services, etc.
 */
public abstract class DataPoller {

    /**
     * @param request The client request to be analyzed and satisfied.
     * @return Reply for the given request.
     */
    public abstract String sendRequest(String request);


//    private boolean changed;
//    private ArrayList<Observer> observers;
//
//    public DataPoller() {
//        this.observers = new ArrayList<Observer>();
//    }
//
//    /**
//     * Add an observer to this observable
//     *
//     * @param o the observer to be added
//     */
//    public void addObserver(Observer o) {
//        observers.add(o);
//    }
//
//    /**
//     * Notify all observers observing this observable about changes
//     */
//    public void notifyObservers() {
//        if (this.changed) {
//            for (Observer observer : observers) {
//                observer.update(this);
//            }
//            clearChanged();
//        }
//    }
//
//    /**
//     * Set the changed value
//     *
//     * @param changed the new value
//     */
//    public void setChanged(boolean changed) {
//        this.changed = changed;
//    }
//
//    /**
//     * Return the current changed value
//     *
//     * @return variable changed
//     */
//    public boolean hasChanged() {
//        return this.changed;
//    }
//
//    /**
//     * Clear the current changed value and set it to false
//     */
//    public void clearChanged() {
//        this.changed = false;
//    }

}
