package com.company;
import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);

    public void  mainMenu() {


        System.out.println("Please Choose an option. " + "\n1. Manage People" + "\n2. Manage Animals" + "\n3. Manage Inventory");
        //Handles user input for navigation
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
            default:
                //handle wrong number
                // Restart method to allow user to try again
    }

    }

    private void manageInventory() {
        
    }

    private void manageAnimals() {

    }

    private void managePeople() {

    }
}
