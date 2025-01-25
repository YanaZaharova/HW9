package ru.netology;

public class Radio {

    private int maxStationNumber;
    private int minStationNumber;
    private int currentStationNumber;
    private int currentVolume;

    public Radio() {
        this.maxStationNumber = 9;
        this.minStationNumber = 0;
    }

    public Radio(int numberOfStations) {
        this.maxStationNumber = numberOfStations - 1;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        if (newCurrentStationNumber < minStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = minStationNumber;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = maxStationNumber;
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
