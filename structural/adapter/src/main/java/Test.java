
import adapter.HdmiVgaAdapter;
import adapter.HdmiVgaAdapterH;
import computer.*;

public class Test {

    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour");
        // uniteCentrale.setVga(new TV()); // Impossible
        HdmiVgaAdapter hdmiVgaAdapter =new HdmiVgaAdapter() ;
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        uniteCentrale.print("Bonjour TV");

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter2 =new HdmiVgaAdapter() ;
        hdmiVgaAdapter2.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter2);
        uniteCentrale.print("Bonjour SuperVP");

        HdmiVgaAdapterH hdmiVgaAdapter3 =new HdmiVgaAdapterH() ;
        uniteCentrale.setVga(hdmiVgaAdapter3);
        uniteCentrale.print("Bonjour TV");

    }
}
