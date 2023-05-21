package org.example;

public class Employee {
    String empName;
    int age;
    Double salary;

    Employee(String name , int agee,Double salaryy){
        empName=name;
        age=agee;
        salary=salaryy;

    }

    void details(){
        System.out.println("Name of the Employee" + ": "+ empName);
        System.out.println("Age of Employee"+": "+age);
        System.out.println("salary of employee"+": " + salary);

    }

    public static void main(String[] args) {
        /** Example for object creation  */
//        Employee employee = new Employee();
//        employee.age=23;
//        employee.empName="Nattu";
//        employee.salary=23500.00;
        /** calling the method through the object*/
//        employee.details();
//        Employee employee1=new Employee();
//        employee1.empName="AnbuMani";
//        employee1.age=25;
//        employee1.salary=20000.06;
//        employee1.details();

        Employee employeecon =new Employee("Anbumani",23,3300.00);
        employeecon.details();
        Employee employeecon2=new Employee("Nattu",29,50000.066);
        employeecon2.details();



    }

}
