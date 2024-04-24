package source;

public enum DaysOfTheWeek {
    SUNDAY(1,"Resting"),MONDAY(2,"ahhh"),TUESDAY(3,"getting in groove"),
    WEDNESDAY(4,"Going strong"),THURSDAY(5,"getting tired"),FRIDAY(6,"can't wait for weekend"),
    SATURDAY(7,"finally");
    //enums can have fields and a constructor
    final int weekNumber;
     final String emotion;
     DaysOfTheWeek(int w,String s){
        this.weekNumber=w;
        this.emotion=s;
    }

    
}
