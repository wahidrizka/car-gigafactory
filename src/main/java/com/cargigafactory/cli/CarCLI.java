package com.cargigafactory.cli;

import com.cargigafactory.engine.ElectricEngine;
import com.cargigafactory.engine.PetrolEngine;
import com.cargigafactory.storage.Battery;
import com.cargigafactory.storage.Tank;
import com.cargigafactory.vehicle.Car;

import java.util.Scanner;

/**
 * CLI class to demonstrate car operations.
 */
public class CarCLI {

    private Scanner scanner;

    /**
     * Constructs the CLI with a Scanner for user input.
     */
    public CarCLI() {
        scanner = new Scanner(System.in);
    }

    /**
     * Runs the CLI for demonstrating petrol and electric car operations.
     */

    public void run() {
        System.out.println("Welcome to the Car GigaFactory CLI!");
        System.out.println("Choose a car type to operate: ");

        Car car = chooseCarType();
        if (car == null) {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        boolean keepRunning = true;
        while (keepRunning)  {
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Accelerate");
            System.out.println("2. Brake");
            System.out.println("3. Refuel/Recharge");
            System.out.println("4. Switch Car");
            System.out.println("5. Exit");

            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    car.accelerate();
                    break;
                case 2:
                    car.brake();
                    break;
                case 3:
                    car.refuel();
                    break;
                case 4:
                    car = chooseCarType();
                    if (car == null) {
                        System.out.println("Invalid choice. Exiting program.");
                        keepRunning = false;
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Car GigaFactory CLI. Goodbye!");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Prompts the user to choose between a petrol or electric car.
     *
     * @return a Car instance based on user choice.
     */
    private Car chooseCarType() {
        System.out.println("\nSelect Car Type: ");
        System.out.println("1. Petrol Car");
        System.out.println("2. Electric Car");

        int choice = getUserChoice();
        switch (choice) {
            case 1:
                System.out.println("You have chosen the Petrol Car.");
                return new Car(new PetrolEngine(), new Tank());
            case 2:
                System.out.println("You have chosen the Electric Car.");
                return new Car(new ElectricEngine(), new Battery());
            default:
                System.out.println("Invalid choice.");
                return null;
        }
    }

    /**
     * Reads the user input and returns it as an integer.
     *
     * @return the user's choice as an integer, or-1 if input is invalid.
     */
    private int getUserChoice() {
        System.out.println("Enter your choice: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return -1;
        }
    }
}
