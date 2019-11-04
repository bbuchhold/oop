package de.fham.oop.plane;

import java.util.List;

public class Airplane {
    private String model;
    private List<String> engines;

    public Airplane(String model, List<String> engines) {
        this.model = model;
        this.engines = engines;
    }
    public String getModel(){
        return model;
    }
    public List getEngines(){
        return engines;
    }

}
