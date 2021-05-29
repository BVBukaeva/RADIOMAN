package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void checkVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(radio.getVolume(), 10);
    }

    @Test
    public void checkVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(radio.getVolume(), 0);
    }

    @Test
    public void checkVolumeMoreThanZero() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.increaseVolume();
        assertEquals(radio.getVolume(), 1);
    }

    @Test
    public void checkVolumeLessThanTen() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseVolume();
        assertEquals(radio.getVolume(), 9);
    }

    @Test
    public void checkRadioStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextRadioStation();
        assertEquals(radio.getRadioStation(), 0);
    }

    @Test
    public void checkRadioStationLessThanZero() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prevRadioStation();
        assertEquals(radio.getRadioStation(), 9);
    }

    @Test
    public void checkRadioStationMoreThanZero() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.nextRadioStation();
        assertEquals(radio.getRadioStation(), 1);
    }

    @Test
    public void checkRadioStationLessThanNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.prevRadioStation();
        assertEquals(radio.getRadioStation(), 8);
    }

    @Test
    public void checkRadioStationSetNumber() {
        Radio radio = new Radio();
        radio.setRadioStation(7);
        assertEquals(radio.getRadioStation(), 7);
    }
}
