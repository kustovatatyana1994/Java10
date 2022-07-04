package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(3);

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetRadioStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationBelowMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(7);

        int expected = 8;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAtMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 0;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAtMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 1;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationBeforeMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(8);

        int expected = 9;
        int actual = station.nextRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(7);

        int expected = 6;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAtMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        int expected = 9;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationBeforeMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(1);

        int expected = 0;
        int actual = station.prevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAtMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        int expected = 8;
        int actual = station.prevRadioStation();

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

        volume.setCurrentVolume(20);

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

        volume.setCurrentVolume(1);

        int expected = 2;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAtMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeBeforeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(9);

        int expected = 10;
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

        volume.setCurrentVolume(10);

        int expected = 9;
        int actual = volume.turnDownVolume();

        assertEquals(expected, actual);
    }
}
