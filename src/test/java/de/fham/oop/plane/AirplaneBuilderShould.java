package de.fham.oop.plane;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AirplaneBuilderShould {

    @Test
    public void createAnAirplaneWithModel() {
        AirplaneBuilder test1 = new AirplaneBuilder();
        test1.setModel("airbus");
        Airplane airbus = test1.build();

        Assertions.assertThat(airbus.getModel()).isEqualTo("airbus");
    }
    @Test
    public void createAnAirplaneWithEngines(){
        AirplaneBuilder test2 = new AirplaneBuilder();
        List<String> engines = new ArrayList<>();
        engines.add("Turbine1");
        engines.add("Turbine2");
        test2.setEngines(engines);
        Airplane airbus = test2.build();
        Assertions.assertThat(airbus.getEngines()).isEqualTo(engines);

    }

}