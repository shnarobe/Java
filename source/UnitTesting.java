package source;

public class UnitTesting {
    public UnitTesting(){

    }

    public int printSum(int a, int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "UnitTesting []";
    }

    public void except() throws IllegalArgumentException{
        throw new IllegalArgumentException("For testing purposes");
    }
}
