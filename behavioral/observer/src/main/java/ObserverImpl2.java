import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("-----------");
        System.out.println("State from observer 2 ="+state);
        System.out.println("-----------");

    }
}
