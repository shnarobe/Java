package source;

public interface PoweredInterface {
    //interfaces can have static final constants
    public static final double powerLevel=9.0;
    public void modifyPower(double level);
    //default methods in an interface don't have to be implemented and can be used to add
    //a new method without breaking the interface and maintain backward compatibility
    default boolean isPower(double power_level){
        return powerLevel>power_level;
    }
    
}
