package adapter;

import Adapter.computer.Hdmi;
import Adapter.computer.TV;
import Adapter.computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga {

    @Override
    public void print(String message) {
        System.out.println("==== Adapter ====");
        byte[] data = message.getBytes();
       super.view(data);
        System.out.println("==== / Adapter ====");
    }
}
