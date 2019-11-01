package de.fham.oop.airplane;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AirplaneBuilderShould {

    @Test
    void createAnAirplane() {
        Airplane airplane = new AirplaneBuilder().anAirplane().ofModel("123").withFlightNumber(123).build();

        assertThat(airplane.getFlightNumber()).isEqualTo(123);
        assertThat(airplane.getModel()).isEqualTo("123");
    }
}