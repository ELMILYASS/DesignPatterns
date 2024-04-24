package RemoteTvControl;


import java.util.HashMap;
import java.util.Map;

interface Command {
    void execute();
}

// ConcreteCommands
class TurnOnCommand implements Command {
    private TV tv;

    TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}

class TurnOffCommand implements Command {
    private TV tv;

    TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}

class ChangeChannelCommand implements Command {
    private TV tv;
    private int channel;

    ChangeChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.changeChannel(channel);
    }
}

class AdjustVolumeCommand implements Command {
    private TV tv;
    private int volume;

    AdjustVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.adjustVolume(volume);
    }
}

// Receiver
class TV {
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
class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    void setCommand(String button, Command command) {
        commands.put(button, command);
    }

    void pressButton(String button) {
        Command command = commands.get(button);
        if (command != null) {
            command.execute();
        }
    }
}

// Client
public class WithCommandPattern {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl();

        remote.setCommand("on", new TurnOnCommand(tv));
        remote.setCommand("off", new TurnOffCommand(tv));
        remote.setCommand("channel", new ChangeChannelCommand(tv, 10));
        remote.setCommand("volume", new AdjustVolumeCommand(tv, 50));

        remote.pressButton("on");
        remote.pressButton("channel");
    }
}

// he RemoteControl class is no longer tightly coupled with the TV class.
// Each operation is encapsulated in a command object, which knows how to perform the operation.
// The RemoteControl class only needs to know about the command interface, not the details of how each operation is performed.
// This decoupling makes the system more modular and easier to maintain.
// For example, if you wanted to add a new operation (e.g., mute),
// you would only need to create a new command class and add it to the RemoteControl class, without needing to modify the TV class.