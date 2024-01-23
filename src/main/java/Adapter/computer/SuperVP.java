package Adapter.computer;

public class SuperVP implements Vga ,Hdmi{
    @Override
    public void print(String message) {
        System.out.println("++++ SuperVP Vga ++++");
        System.out.println(message);
        System.out.println("++++ SuperVP Vga ++++");

    }

    @Override
    public void view(byte[] data) {
        System.out.println("++++ SuperVP Hdmi ++++");
        System.out.println(new String(data));
        System.out.println("++++ SuperVP Hdmi ++++");

    }
}
