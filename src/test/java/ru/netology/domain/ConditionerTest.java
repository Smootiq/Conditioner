package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldCreate() {
        Conditioner conditioner = new Conditioner();
        Conditioner conditioner1 = new Conditioner();

        System.out.println( "Hi!" );
    }

    @Test
    @Disabled
    public void shouldNPE() {
        Conditioner conditioner = new Conditioner();
        assertEquals( 0, conditioner.name.length());
    }
    @Test
    public void shouldChangeFields() {
        Conditioner conditioner = new Conditioner();
        assertEquals( 0, conditioner.currentTemperature);
        conditioner.currentTemperature = -100;
        assertEquals( -100, conditioner.currentTemperature);
    }
}
