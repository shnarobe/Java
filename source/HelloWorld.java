package source;
import java.io.*;
import java.util.ArrayList;
/**
 * @author: Krishna
 * @version: 1.2
 * @
 */
public class HelloWorld{
    int num=0;
    boolean b;
    static int numHellos;//static variable not tied to class instance
    private static final String[] GREETINGS = {"Hello!", "Hi!", "W'sup!"};
    public HelloWorld(int num) {
        this.num = num;
        this.b=true;
        numHellos++;

    }
    /**
     * 
     * @param args
     * @return
     * @throws
     */
    public static void main(String [] args){
        HelloWorld h=new HelloWorld(7);
        System.out.println("I is equal to: "+h.num);

    }
    
    public int loop(int until){
        int count=0;
        while(until<100){
            count++;
            until++;
        }
        for(int j=0;j<until;j++){
            count++;
        }
        return count;
    }

    public String decision(String [] value){
        for(int j=0;j<value.length;j++){
            System.out.println("value of J is: "+j+" and the array value is: "+value[j]);
            if(value[j]=="krishna"){
                System.out.println("Match found: "+value[j]);
                return value[j];
            }
        }
        return "Value not found";
    }



public void createArrays(){
    int [] numbers = new int[25];
    
}

public String userInput(){
    ArrayList <String> arr=new ArrayList<String>();
    System.out.println("Please enter your input: ");
    String inputLine;
    try{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    inputLine=br.readLine();
    if(inputLine.length()==0){
        return inputLine="";
    }
    }
    catch(IOException err){
        System.out.println(err);
        return inputLine="";
    }
    return inputLine;

}
}