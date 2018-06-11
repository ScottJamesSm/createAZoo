package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.company.people.*;

public class PeopleMenu {


    private Scanner input = new Scanner(System.in);

    // handles People options
    protected void managePeople() {
        try {

            //find out what type of people to manage
            System.out.println("are you" + "\n1. an Employee" + "\n2. a Visitor" + "\n3. go back" + "\n4. exit");
//handles people management options
            switch (input.nextInt()) {
                case 1:
                    // Handle Employee
                    manageEmployee();
                    break;
                case 2:
                    //Handle Viditor
                    manageVisitor();
                    break;
                //Handle on correct input
                case 3:
                    //Handle going back ot the main men
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException ime) {

        }
    }

    private void manageVisitor() {
        System.out.println("you are in the Visitor Menu" + "\n1. Create New Visitor" + "\n2. View All Visitors" + "\n3. Remove an Visitor" + "\n4. edit an Visitor" + "\n5. Go back" + "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //

                    break;
                case 5:
                    //manage people
                    managePeople();
                    break;
                case 6:
                    //exit program
                    //Exit Program
                    System.exit(0);
                    break;
                    default:
                        System.out.println("that is not valid. please try again");
                        manageVisitor();
                        break;



            }

    } catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("that is not valid. please try again");
            manageVisitor();


    }

}
    private void manageEmployee() {
        System.out.println("you are in the Employee Menu" + "\n1. Create New Employee" + "\n2. View All Employees" + "\n3. Remove an Employee" + "\n4. edit an Employee" + "\n5. Go back" + "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
                    //
                    break;
                case 2:
                    //
                    break;
                case 3:
                    //
                    break;
                case 4:
                    //

                    break;
                case 5:
                    //manage people
                    managePeople();
                    break;
                case 6:
                    //exit program
                    //Exit Program
                    System.exit(0);
                    break;
                    default:
                        System.out.println("that is not valid. please try again");
                        manageEmployee();
                        break;


            }

        } catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("that is not valid. please try again");
            manageEmployee();



        }
    }
    private void createPerson(int location){
        if(location == 1) {

            System.out.println(" What is the Employee’s age");
            int employeeAge = input.nextInt();
            input.nextLine();
            System.out.println("what is the employee's name?");
            String employeeName = input.nextLine ();
            System.out.println("what is your employee's gender?");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("what is the employee's race?");
            String employeeRace = input.nextLine();
            System.out.println("what is the employee number");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's job?");
                    String employeeTitle = input.nextLine();
            System.out.println("what is the employee's hire date?");
                    String employeeHireDate = input.nextLine();
            Employee newEmployee = new Employee(employeeAge,employeeName, employeeGender,employeeRace, employeeNumber, employeeTitle, employeeHireDate );

            //add Employee to employee list


    } else if (location == 2) {
}