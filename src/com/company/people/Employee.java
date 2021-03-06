package com.company.people;
import java.util.ArrayList;
import java.util.List;

public class Employee extends People {
    private int employeeNumbers;
    private String jobTitle;
    private String hireDay;
    private int hours;

    public Employee() {
    }

    private List<Employee> employeeList = new ArrayList<Employee>();

    public Employee(int age, String name, char gender, String race, int employeeNumbers, String jobTitle, String hireDay) {
        super(age, name, gender, race);
        this.employeeNumbers = employeeNumbers;
        this.jobTitle = jobTitle;
        this.hireDay = hireDay;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDay() {
        return hireDay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void addEmployee(Employee newEmploye) {

        employeeList.add(newEmployee);
        System.out.println(newEmplyee.getName() + "has been added")
    }
}