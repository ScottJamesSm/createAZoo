package com.company.menu;

public class PeopleMenu {
}
    // handles People options
    private void managePeople() {
        try {

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
                case 3:
                    mainMenu();
                case 4:
                    break;
                default:
                    break;
            }
        }
    }
}
