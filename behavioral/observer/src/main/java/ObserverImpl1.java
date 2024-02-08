public class ObserverImpl1 implements Observer {

    // Push
    @Override
    public void update(int state) {
        System.out.println("***********");
        System.out.println("State from observer 1 ="+state);
        System.out.println("***********");
    }

    /* Pop
    @Override
    public void update(Observable observable) {

        int state = ((ObservableImpl) observable).getState() ;
        System.out.println("***********");
        System.out.println("State from observer 1 ="+state);
        System.out.println("***********");
    }

     */
}
