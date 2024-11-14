package com.cargigafactory.cli;

import com.cargigafactory.engine.ElectricEngine;
import com.cargigafactory.engine.PetrolEngine;
import com.cargigafactory.storage.Battery;
import com.cargigafactory.storage.Tank;
import com.cargigafactory.vehicle.Car;

/**
 * CLI class to demonstrate car operations.
 */
public class CarCLI {
    /**
     * Runs the CLI for demonstrating petrol and electric car operations.
     */
    public void run() {
        Car petrolCar = new Car(new PetrolEngine(), new Tank());
        Car electricCar = new Car(new ElectricEngine(), new Battery());

        System.out.println("Petrol Car Operations:");
        petrolCar.accelerate();
        petrolCar.brake();
        petrolCar.refuel();

        System.out.println("\nElectric Car Operations:");
        electricCar.accelerate();
        electricCar.brake();
        electricCar.refuel();
    }
}
