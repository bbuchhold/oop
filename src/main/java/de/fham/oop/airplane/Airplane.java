package de.fham.oop.airplane;

import java.util.List;

public class Airplane {
    private String model;
    private int flightNumber;
    private List<Engine> engines;
    private List<Passanger> passangers;

    Airplane(String model, int flightNumber, List<Engine> engines, List<Passanger> passangers) {
        this.model = model;
        this.flightNumber = flightNumber;
        this.engines = engines;
        this.passangers = passangers;
    }

    public void takeOff() {
        engines.forEach(engine -> engine.start());
    }

    public void landing() {
        engines.forEach(engine -> engine.stop());
    }

    public void dock() {
        passangers.forEach(passanger -> {
            if (passanger.hasUpcommingFlight()) {
                passanger.goToGate(1);
            } else {
                passanger.goToBaggageClaim();
            }
        });
    }

    public String getModel() {
        return model;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
}
