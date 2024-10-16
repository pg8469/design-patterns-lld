// Client
public class Phone {
    USBTypeC usbTypeC;

    public Phone(USBTypeC usbTypeC){
        this.usbTypeC=usbTypeC;
    }

    public void readDataFromUSB(){
        usbTypeC.readData();
    }
}
