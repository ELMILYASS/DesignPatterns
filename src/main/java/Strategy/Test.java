package Strategy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        while (true){
            System.out.println("What Strategy ?");
            String strategyClassName = scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();
        }
    }
}
