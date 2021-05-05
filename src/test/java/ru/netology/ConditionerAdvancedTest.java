package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }
    @Test
    public void checkTemperatureMoreThanMaxTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(4);
        conditioner.setCurrentTemperature(3);
        conditioner.setCurrentTemperature(5);
        assertEquals(conditioner.getCurrentTemperature(), 3);
    }
    @Test
    public void checkTemperatureLessThanMinTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(4);
        conditioner.setMinTemperature(1);
        conditioner.setCurrentTemperature(3);
        conditioner.setCurrentTemperature(0);
        assertEquals(conditioner.getCurrentTemperature(), 3);
    }


    @Test
    public void checkTemperatureSetCurrentTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(4);
        conditioner.setMinTemperature(1);
        conditioner.setCurrentTemperature(3);
        assertEquals(conditioner.getCurrentTemperature(), 3);
    }
}