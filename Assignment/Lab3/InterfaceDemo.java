package Assignment.Lab3;

interface Printable {
    void print();
}

class DocumentPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        DocumentPrinter doc = new DocumentPrinter();
        doc.print();
    }
}