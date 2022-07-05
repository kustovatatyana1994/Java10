package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetCountRadioStation() {
        Radio station = new Radio(15);

        int expected = 15;
        int actual = station.getCountRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio station = new Radio(15);

        int expected = 14;
        int actual = station.getMaxRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinRadioStation() {
        Radio station = new Radio(15);

        int expected = 0;
        int actual = station.getMinRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio station = new Radio(15);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio(24);

        station.setCurrentRadioStation(3);

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetRadioStationAboveMax() {
        Radio station = new Radio(15);

        station.setCurrentRadioStation(17);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationBelowMin() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(7);

        int expected = 8;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAtMax() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(9);

        int expected = 0;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAtMin() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(0);

        int expected = 1;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationBeforeMax() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(8);

        int expected = 9;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(7);

        int expected = 6;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAtMin() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(0);

        int expected = 9;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationBeforeMin() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(1);

        int expected = 0;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAtMax() {
        Radio station = new Radio(10);

        station.setCurrentRadioStation(9);

        int expected = 8;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeOnDefault() {
        Radio volume = new Radio();

        volume.getCurrentVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();

        volume.getMinVolume();

        int expected = 0;
        int actual = volume.getMinVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();

        volume.getMaxVolume();

        int expected = 100;
        int actual = volume.getMaxVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(4);

        int expected = 4;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(120);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-15);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(15);

        int expected = 16;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAtMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeBeforeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        int expected = 100;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAtMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 1;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTurnDownVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(4);

        int expected = 3;
        int actual = volume.turnDownVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetTurnDownVolumeAtMin() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.turnDownVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetTurnDownVolumeAtMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        int expected = 99;
        int actual = volume.turnDownVolume();

        assertEquals(expected, actual);
    }
}
