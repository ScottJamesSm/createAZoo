package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

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
                //Handle oncorrect input
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
    }

    private void manageEmployee() {
    }
}
