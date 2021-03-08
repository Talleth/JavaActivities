/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activities;

import java.util.Scanner;

/**
 *
 * @author lonst
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Define variables
        Scanner scanner     = new Scanner(System.in);
        String  dayOfWeek   = "";
        
        // Get the day of the week
        System.out.println("Please enter a day of the week");
        if (scanner.hasNextLine())
            dayOfWeek = scanner.nextLine();
        
        if (dayOfWeek.equalsIgnoreCase("monday")){
            System.out.println("On Monday there was a tornado.");
        }
        else if (dayOfWeek.equalsIgnoreCase("tuesday")){
            System.out.println("On Tuesday there was no traffic.");
        }
        else if (dayOfWeek.equalsIgnoreCase("wednesday")){
            System.out.println("We had no work on Wednesday.");
        }
        else if (dayOfWeek.equalsIgnoreCase("thursday")){
            System.out.println("On Thursday everyone held hands and sang songs.");
        }
        else if (dayOfWeek.equalsIgnoreCase("friday")){
            System.out.println("Friday was boring.");
        }
        else if (dayOfWeek.equalsIgnoreCase("saturday")){
            System.out.println("Saturday was shopping!");
        }
        else if (dayOfWeek.equalsIgnoreCase("sunday")){
            System.out.println("Sunday was just a normal day.");
        }
        else{
            System.out.println("You did not enter a day of the week, please try again.");
        }
    }
}
