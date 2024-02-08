public class Context {
    private Strategy strategy = new DefaultStrategy();
    public void applyStrategy(){
        System.out.println("********* Strategy Start **********");
        strategy.apply();
        System.out.println("********* Strategy End **********");
    }

    public void setStrategy(Strategy strategy){
        this.strategy=strategy ;
    }
}
