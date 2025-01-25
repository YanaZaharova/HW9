package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio station = new Radio(15);
    Radio vol = new Radio();

    @Test
    public void shouldSetStationNumber() {
        station.setCurrentStationNumber(7);

        int expected = 7;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSNAboveMax() {
        station.setCurrentStationNumber(15);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSNBelowMin() {
        station.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToNextAboveMax() {
        station.setCurrentStationNumber(14);

        station.next();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextIfNearToLimit() {
        station.setCurrentStationNumber(13);

        station.next();

        int expected = 14;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToPrevIfMin() {
        station.setCurrentStationNumber(0);

        station.prev();

        int expected = station.getMaxStationNumber();
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevIfNearToLimit() {
        station.setCurrentStationNumber(1);

        station.prev();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        vol.setCurrentVolume(99);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseAboveMax() {
        vol.setCurrentVolume(100);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        vol.setCurrentVolume(1);

        vol.turnDownVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownIfMin() {
        vol.setCurrentVolume(0);

        vol.turnDownVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
