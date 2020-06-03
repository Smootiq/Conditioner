package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {
    @Test
    public void shouldIdCreate() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }
    @Test
    public void shouldSetterLogic() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());
    }
    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals( 0, conditioner.getCurrentTemperature() );
        conditioner.setMinDecreaseCurrentTemperature(15);
        assertEquals( 0, conditioner.getCurrentTemperature() );
    }
    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(0);

        assertEquals( 0, conditioner.getCurrentTemperature() );
        conditioner.setMaxIncreaseCurrentTemperature(19);
        assertEquals( 0, conditioner.getCurrentTemperature() );
    }
}