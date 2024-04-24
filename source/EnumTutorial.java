package source;

public class EnumTutorial {
    public static void main(String args[]){
        DaysOfTheWeek d=DaysOfTheWeek.FRIDAY;
        if(d==DaysOfTheWeek.FRIDAY){
            System.out.println("Today is Friday");
          
        }

        for(DaysOfTheWeek myday:DaysOfTheWeek.values()){
            System.out.println("Today is "+myday+" and this is the number: "+myday.weekNumber+" ,emotion: "+myday.emotion);

        }

    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    
}
