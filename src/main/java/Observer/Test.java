package Observer;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);
        Observer observer1 =new ObserverImpl1();
        observable.subscribe(observer1);
        observable.subscribe(new ObserverImpl2());
        observable.setState(70);
        observable.unsubscribe(observer1);
        //Anonymous Object
        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("...........");
                System.out.println("State from anonymous object ="+state);
                System.out.println("..........");
            }
        });
        //Lambda function
        observable.subscribe( state -> {
            System.out.println("...........");
            System.out.println("State from lambda function="+state);
            System.out.println("..........");
        });
        observable.setState(100);

    }
}
