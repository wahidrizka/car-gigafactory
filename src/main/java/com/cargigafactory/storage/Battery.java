package com.cargigafactory.storage;

/**
 * Represents a battery for storing electric energy.
 */
public class Battery implements StorageInterface {
    @Override
    public void fillStorage() {
        System.out.println("Battery is charging...");
    }
}
