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
    public void shouldSwitchToNext() {
        Radio station = new Radio();

        station.setCurrentStationNumber(9);

        station.next();

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrev() {
        Radio station = new Radio();

        station.setCurrentStationNumber(0);

        station.prev();

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(50);

        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio vol = new Radio();

        vol.setCurrentVolume(50);

        vol.turnDownVolume();

        int expected = 49;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
