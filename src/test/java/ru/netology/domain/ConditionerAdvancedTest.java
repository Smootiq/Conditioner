package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {
    @Test
    public void shouldCreate() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();

        String expected = "bosch";
        assertNull( conditioner.getName() );
        conditioner.setName( expected );
        assertEquals( expected, conditioner.getName());
    }
    @Test
    public void shouldSetterLogic() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature( 25 );
        conditioner.setMinTemperature( 12 );

        assertEquals( 0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature( 22 );
        assertEquals( 22, conditioner.getCurrentTemperature());
    }
}
