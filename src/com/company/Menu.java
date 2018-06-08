package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private Scanner input = new Scanner(System.in);

    public void  mainMenu() throws InputMismatchException{


        System.out.println("Please Choose an option. " + "\n1. Manage People" + "\n2. Manage Animals" + "\n3. Manage Inventory");
        //Handles user input for navigation
        try {
            switch (input.nextInt()) {
                case 1:
                    //manage People
                    managePeople();
                    break;
                case 2:
                    //manage Animals
                    manageAnimals();
                    break;
                case 3:
                    //manage Inventory
                    manageInventory();
                    break;

                case 4:
                    System.out.println("thank you for using the zoo program");
                    System.exit(0);
                    break;

                default:
                    //handle wrong number
                    System.out.println("that is not a valid entry. Please enter a number between 1 and 3");
                    mainMenu();
                    // Restart method to allow user to try again
                break;
            }
        }catch(InputMismatchException ime){
            // Handle if a  user puts in something that is not an int
            input.nextLine();
            System.out.println("that is not a valid entry please enter a number between 1 and 3");
            mainMenu();
        }
    }
    //Handles incentory options
    private void manageInventory() {
        try {
            // enter code here that you would like to run that MAY throw an exceptio

        } catch (InputMismatchException ime) {
            //what you want your program to do IF this exception happens
        }

    }
    //handles Animals options
    private void manageAnimals() {

    }
    // handles People options
    private void managePeople() {

        //find out what type of people to manage
        System.out.println("are you" + "\n1. an Employee" + "\n2. a Visitor" + "\n3. go back" + "\n4. exit");
//handles people management options
        switch (input.nextInt()) {
            case 1:
                // Handle Employee
                break;
            case 2:
                //Handle Viditor
                break;
            //Handle oncorrect input
            case 4:
                break;
            default:
                break;
        }
    }
    }
}
