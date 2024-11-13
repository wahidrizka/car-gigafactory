package com.cargigafactory.vehicle;

/**
 * Abstract base class representing a vehicle.
 */
public abstract class Vehicle {
    /**
     * Accelerates the vehicle.
     */
    public abstract void accelerate();

    /**
     * Brakes the vehicle.
     */
    public abstract void brake();

    /**
     * Refills the vehicle's fuel or energy storage.
     */
    public abstract void refuel();
}
