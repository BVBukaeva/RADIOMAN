package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void checkVolumeWrongSymbol() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.changeVolume("!");
        assertEquals(radio.getVolume(), 10);
    }

    @Test
    public void checkVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.changeVolume("+");
        assertEquals(radio.getVolume(), 10);
    }

    @Test
    public void checkVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.changeVolume("-");
        assertEquals(radio.getVolume(), 0);
    }

    @Test
    public void checkVolumeMoreThanZero() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.changeVolume("+");
        assertEquals(radio.getVolume(), 1);
    }

    @Test
    public void checkVolumeLessThanTen() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.changeVolume("-");
        assertEquals(radio.getVolume(), 9);
    }

    @Test
    public void checkRadioWrongSymbol() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.changeRadioStation("nex");
        assertEquals(radio.getRadioStation(), 9);
    }

    @Test
    public void checkRadioStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.changeRadioStation("next");
        assertEquals(radio.getRadioStation(), 0);
    }

    @Test
    public void checkRadioStationLessThanZero() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.changeRadioStation("prev");
        assertEquals(radio.getRadioStation(), 9);
    }

    @Test
    public void checkRadioStationMoreThanZero() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.changeRadioStation("next");
        assertEquals(radio.getRadioStation(), 1);
    }

    @Test
    public void checkRadioStationLessThanNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.changeRadioStation("prev");
        assertEquals(radio.getRadioStation(), 8);
    }

    @Test
    public void checkRadioStationSetNumber() {
        Radio radio = new Radio();
        radio.changeRadioStation("7");
        assertEquals(radio.getRadioStation(), 7);
    }
}
