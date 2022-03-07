package Chap3;

public class Employee {
    private String name;
    private String lastName;
    private double salary;

//    public boolean isSalary() {
//        boolean salary = false;
//        if (salary > 1) {
//            return salary;
//        }
//    }

    public Employee(String name,String lastName, double salary){
        this.name = name;
        this.lastName = lastName;
        if (salary > 1){
            this.salary = salary;
        }
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(double salary){
        if (salary > 1){
            this.salary = salary;
        }
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public double getSalary(){
        return salary;
    }

}
