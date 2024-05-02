package source.packageK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    private double salary;
    private String name;

    public Employee(String n,double s){
        this.salary=s;
        this.name=n;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Compares employees by salary
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
   */
    public int compareTo(Employee E){
        //make sure the two classes compared are Employees
        if(getClass()!=E.getClass()){
            throw new ClassCastException();
        }
        return Double.compare(getSalary(), E.getSalary());

    }
    
}




 class EmployeeExample {
    public EmployeeExample(){

    }

    public static void main(String [] args){

        ArrayList <Employee> arr=new ArrayList <Employee>();
        Employee e=new Employee("Krishna Roberston",1200.00);
        arr.add(e);
        arr.add(new Employee("Lystra Roberston",1205.00));
        arr.add(new Employee("Lystra Beggs",1105.00));
        arr.add(new Employee("Adina Bethel",1105.70));
        arr.add(new Employee("Kim Green",1305.70));
        Collections.sort(arr); 

        Employee [] arr2=new Employee[5];
        arr2[0]=new Employee("Krishna Roberston",1200.00);
        arr2[1]=new Employee("Lystra Roberston",1205.00);
        arr2[2]=new Employee("Lystra Beggs",1105.00);
        arr2[3]=new Employee("Adina Bethel",1105.70);
        arr2[4]=new Employee("Kim Green",1305.70);

        Arrays.sort(arr2);
        for (Employee e1:arr2){
        System.out.println("name"+e1.getName()+"salary: "+e1.getSalary());
        }
    }
    
}
