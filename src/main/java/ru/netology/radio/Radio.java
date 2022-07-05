package ru.netology.radio;
public class Radio {
    private int countRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = countRadioStation - 1;
    private int currentRadioStation = minRadioStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = countRadioStation - 1;
        this.currentRadioStation = minRadioStation;
    }

    public Radio() {

    }

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }

        return currentRadioStation;
    }

    public int nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }


    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


}
