package com.cargigafactory.vehicle;

import com.cargigafactory.engine.EngineInterface;
import com.cargigafactory.storage.StorageInterface;

/**
 * Represents a car that uses an engine and a storage for fuel or energy.
 */
public class Car extends Vehicle {
    private EngineInterface engine;
    private StorageInterface storage;

    /**
     * Constructs a Car with a specific engine and storage.
     *
     * @param engine The engine used by the car
     * @param storage The fuel or energy storage used by the car
     */
    public Car(EngineInterface engine, StorageInterface storage) {
        this.engine = engine;
        this.storage = storage;
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
        engine.moveVehicle();
    }

    @Override
    public void brake() {
        System.out.println("Car braking...");
    }

    @Override
    public void refuel() {
        System.out.println("Car refilling...");
        storage.fillStorage();
    }
}
