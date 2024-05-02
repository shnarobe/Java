package source.packageK;

public class GenericPrinterExample {
    public static void main(String [] args){
        GenericPrinter<Integer> printer=new GenericPrinter<Integer>(23);
        printer.print();
        System.out.println(printer.getThingToPrint());
        GenericPrinter<Double> printer1=new GenericPrinter<Double>(23.25);
        printer1.print();
        System.out.println(printer1.getThingToPrint());
        GenericPrinter<String> printer2=new GenericPrinter<String>("Hello World!");
        printer2.print();
        System.out.println(printer2.getThingToPrint());
    }
}
