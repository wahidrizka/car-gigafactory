package com.cargigafactory.storage;

/**
 * Represents a fuel tank for storing petrol.
 */
public class Tank implements StorageInterface {
    @Override
    public void fillStorage() {
        System.out.println("Filling tank with petrol...");
    }
}
