package de.fham.oop.airplane;

import java.util.List;

public class  AirplaneBuilder {

    private String model;
    private int flightNumber;
    private List<Engine> engines;
    private List<Passanger> passangers;

    // not mandatory
    public AirplaneBuilder anAirplane() {
        return this;
    }

    public AirplaneBuilder ofModel(String model) {
        this.model = model;
        return this;
    }

    public AirplaneBuilder withFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public AirplaneBuilder withEngines(List<Engine> engines) {
        this.engines = engines;
        return this;
    }

    public AirplaneBuilder withPassangers(List<Passanger> passangers) {
        this.passangers = passangers;
        return this;
    }

    public Airplane build() {
        return new Airplane(model, flightNumber, engines, passangers);
    }

}
