package Chap3;

public class EmployeeTest {
    public static void main(String... args){
        Employee employee = new Employee("bolu","lamidi",60000);
        Employee employee1 = new Employee("hamed","tinubu",-50);

        //display each employee's yearly salary
        double yearlySalary = employee.getSalary() * 12;
        System.out.printf("Your yearly salary is %.2f: ", yearlySalary);
        yearlySalary = employee1.getSalary() * 12;
        System.out.printf("\nYour Yearly Salary is %.2f: ", yearlySalary);

        //give each employee a 10% raise
        employee.setSalary(employee.getSalary() + (0.10 * employee.getSalary()));
        employee1.setSalary(employee1.getSalary() + (0.10 * employee1.getSalary()));

        //display salary after raise
        yearlySalary = employee.getSalary() * 12;
        System.out.printf("\nYou received a 10 percent raise,your new yearly salary is %.2f: ", yearlySalary);
        yearlySalary = employee1.getSalary() * 12;
        System.out.printf("\nYou received a 10 percent raise,your new yearly salary is %.2f: ", yearlySalary);


    }
}
