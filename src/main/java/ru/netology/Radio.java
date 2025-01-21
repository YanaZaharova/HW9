package ru.netology;

public class Radio {

    private int currentStationNumber;

    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prev() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
