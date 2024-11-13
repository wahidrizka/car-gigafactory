package com.cargigafactory.engine;

import com.cargigafactory.storage.Battery;

/**
 * Manages the battery in an electric vehicle.
 */
public class BatteryManagementSystem {
    /**
     * Retrieves the battery for use in the electric engine.
     *
     * @return a Battery instance
     */
    public Battery getBattery() {
        System.out.println("BatteryManagementSystem providing battery...");
        return new Battery();
    }
}
