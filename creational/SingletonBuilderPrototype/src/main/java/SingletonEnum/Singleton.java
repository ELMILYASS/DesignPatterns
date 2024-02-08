package SingletonEnum;

public enum Singleton {
    INSTANCE;

    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }
}

class Main {
    public static void main(String[] args) {
        // Access the singleton instance
        Singleton singleton = Singleton.INSTANCE;

        // Use the singleton
        System.out.println("Initial value: " + singleton.getValue());
        singleton.setValue(42);
        System.out.println("Updated value: " + singleton.getValue());
    }
}
