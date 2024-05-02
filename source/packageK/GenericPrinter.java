package source.packageK;
//public class GenericPrinter <T extends Employee> { is an example of a bounded generic
public class GenericPrinter <T> {

    private static int counter = 0;
    T thingToPrint;

    


    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
        counter++;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

    
    public T getThingToPrint(){
        return thingToPrint;
    }




    public static void main(String args[]) {
    }
    
    
}

