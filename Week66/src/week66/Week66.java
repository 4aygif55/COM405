/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week66;

import java.util.Scanner;

/**
 *
 * @author 4aygif55
 */
public class Week66 {

    public static void main(String[] args) {

        int state = 1;
        CarPark cp = new CarPark();
        Scanner scanIn = new Scanner(System.in);

        while (state == 1) {
            System.out.println("Please enter one of the following options: ");
            System.out.println("A - Add a car");
            System.out.println("B - Remove a car");
            System.out.println("C - View number of empty spaces");
            System.out.println("X - exit");

            
            String input = scanIn.nextLine();
            if (input.equals("a")) {
                System.out.println("You have chose to add a car \n Please enter a registration number");

                String reg = scanIn.nextLine();

                if (cp.addCar(new Car(reg))) {
                    System.out.println("The car has been added!");
                } else {
                    System.out.println("The carpark is full!");
                }

            } else if (input.equals("b")) {
                System.out.println("You have chose to remove a car \n Please enter a reg number!");

                String reg = scanIn.nextLine();

                if (cp.removeCar(reg)) {
                    System.out.println("The car has been removed!");
                } else {
                    System.out.println("The car does not exist");
                }
            } else if (input.equals("c")) {
                System.out.println("Empty spaces: " + cp.getEmptySpace());

            } else if (input.equals("x")) {
                state = 0;
            } else {
                System.out.println("Please enter a valid choice from the menu");
            }
// Get user input
// Perform actions based on user selection
        }
        scanIn.close();

    }

}
