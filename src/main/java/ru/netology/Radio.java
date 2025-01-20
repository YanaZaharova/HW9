package ru.netology;

public class Radio {
    public int currentStationNumber;

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
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        }
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        }
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        }
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
