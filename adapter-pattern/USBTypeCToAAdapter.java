// Adapter
public class USBTypeCToAAdapter implements USBTypeC {

    USBTypeA usbTypeA;

    public USBTypeCToAAdapter(USBTypeA usbTypeA){
        this.usbTypeA=usbTypeA;
    }
    @Override
    public void readData(){
        usbTypeA.readDataFromUSBTypeA();
    }
    
}
