package de.fham.oop.plane;

import java.util.List;

public class AirplaneBuilder{

    private List<String> engines;
    private String model;

    public Airplane build (){
        return new Airplane(model, engines);
         }
    public void setModel(String model){
        this.model = model;
        }
    public void setEngines(List<String> engines){
        this.engines = engines;
    }
    }
