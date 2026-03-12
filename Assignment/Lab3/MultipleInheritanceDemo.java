package Assignment.Lab3;

interface ScannerDevice {
    void scan();
}

interface PrinterDevice {
    void print();
}

class AllInOneDevice implements ScannerDevice, PrinterDevice {

    @Override
    public void scan() {
        System.out.println("Scanning the document...");
    }

    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        AllInOneDevice device = new AllInOneDevice();
        device.scan();
        device.print();
    }
}