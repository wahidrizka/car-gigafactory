package com.cargigafactory.engine;

import com.cargigafactory.storage.Battery;

/**
 * Represents an electric motor that uses battery power to rotate.
 */
public class ElectricMotor {
    /**
     * Rotates the motor using battery power.
     *
     * @param battery The battery providing power to the motor.
     */
    public void rotateElectricMotor(Battery battery) {
        System.out.println("ElectricMotor rotating using battery power...");
    }
}
