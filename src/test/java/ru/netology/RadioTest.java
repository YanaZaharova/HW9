package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumber() {
        Radio station = new Radio();

        station.setCurrentStationNumber(7);

        int expected = 7;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSNAboveMax() {
        Radio station = new Radio();

        station.setCurrentStationNumber(10);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSNBelowMin() {
        Radio station = new Radio();

        station.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToNextAboveMax() {
        Radio station = new Radio();

        station.setCurrentStationNumber(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextIfNearToLimit() {
        Radio station = new Radio();

        station.setCurrentStationNumber(8);

        station.next();

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSwitchToPrevIfMin() {
        Radio station = new Radio();

        station.setCurrentStationNumber(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevIfNearToLimit() {
        Radio station = new Radio();

        station.setCurrentStationNumber(1);

        station.prev();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolume(101);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio vol = new Radio();

        vol.setCurrentVolume(-1);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(99);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseAboveMax() {
        Radio vol = new Radio();

        vol.setCurrentVolume(100);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(1);

        vol.turnDownVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownIfMin() {
        Radio vol = new Radio();

        vol.setCurrentVolume(0);

        vol.turnDownVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
