package Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state = 0 ;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            //Push
            observer.update(state);
            // Pop
            //observer.update(this);

        }
    }
    public int getState(){
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
