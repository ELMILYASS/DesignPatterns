package RemoteTvControl;



// Receiver
class TV2 {
    void turnOn() {
        System.out.println("TV is turned on.");
    }

    void turnOff() {
        System.out.println("TV is turned off.");
    }

    void changeChannel(int channel) {
        System.out.println("Changed to channel " + channel + ".");
    }

    void adjustVolume(int volume) {
        System.out.println("Volume set to " + volume + ".");
    }
}

// Invoker
class RemoteControl2 {
    private TV2 tv;

    RemoteControl2(TV2 tv) {
        this.tv = tv;
    }

    void pressButton(String button) {
        if ("on".equals(button)) {
            tv.turnOn();
        } else if ("off".equals(button)) {
            tv.turnOff();
        } else if ("channel".equals(button)) {
            tv.changeChannel(10);
        } else if ("volume".equals(button)) {
            tv.adjustVolume(50);
        }
    }
}

// Client
public class WithoutCommandPattern {
    public static void main(String[] args) {
        TV2 tv = new TV2();
        RemoteControl2 remote = new RemoteControl2(tv);

        remote.pressButton("on");
        remote.pressButton("channel");
    }
}


// the invoker of the operations ( remote Controller) is tightly coupled to the performer of the operations ( tv)
//If we wante to add a new operation (e.g., mute), we would need to modify both the RemoteControl and TV classes. This tight coupling makes the system less flexible and harder to maintain.