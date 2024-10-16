public class Driver {
    public static void main(String[] args) {
        USBTypeA USBTypeAPendrive = new USBTypeAPenDrive();
        USBTypeC usbTypeCAdapter = new USBTypeCToAAdapter(USBTypeAPendrive);

        // Needs a adapter to read from USB type A pendrive
        Phone phone = new Phone(usbTypeCAdapter);
        phone.readDataFromUSB(); // Reading data from USB Type A

        // Can read from USB type C pendrive without adapter
        USBTypeC usbTypeCPendrive = new USBTypeCPenDrive();
        Phone phone2 = new Phone(usbTypeCPendrive);
        phone2.readDataFromUSB(); // Reading data from USB Type C
    }
}
