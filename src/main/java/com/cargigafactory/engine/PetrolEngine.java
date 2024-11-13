package com.cargigafactory.engine;

/**
 * Represents a petrol engine for a vehicle.
 */
public class PetrolEngine implements EngineInterface {
    private OilPipe oilPipe = new OilPipe();
    private Piston piston = new Piston();

    @Override
    public void moveVehicle() {
        System.out.println("Using petrol engine to move the vehicle...");
        oilPipe.suckOil();
        piston.movePiston();
    }
}
