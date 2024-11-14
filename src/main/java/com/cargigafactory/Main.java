package com.cargigafactory;

import com.cargigafactory.cli.CarCLI;

/**
 * The main entry point of the application.
 */
public class Main {
    /**
     * Main method to run the Car Gigafactory application.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        CarCLI cli = new CarCLI();
        cli.run();
    }
}
