package com.cargigafactory.engine;

import com.cargigafactory.storage.Battery;

/**
 * Represents an electric engine for a vehicle.
 */
public class ElectricEngine implements EngineInterface {
    private BatteryManagementSystem batteryManagementSystem = new BatteryManagementSystem();
    private ElectricMotor motor = new ElectricMotor();

    @Override
    public void moveVehicle() {
        System.out.println("Using electric engine to move the vehicle...");
        Battery battery = batteryManagementSystem.getBattery();
        motor.rotateElectricMotor(battery);
    }
}
