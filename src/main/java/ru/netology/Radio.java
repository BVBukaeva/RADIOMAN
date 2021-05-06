package ru.netology;

public class Radio {
    int volume;
    int radioStation;
    private int maxVolume = 100;
    private int countRadioStations = 9;

    public Radio() {
    }

    public Radio(int countRadioStations) {
        this.countRadioStations = countRadioStations;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        this.radioStation = radioStation;
    }

    public void changeVolume(String arg) {
        if ("+".equals(arg)) {
            if (volume < maxVolume) {
                volume++;
            }
        } else if ("-".equals(arg)) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void changeRadioStation(String arg) {
        if (arg.matches("[0-9]*")) {
            int radioStation = Integer.parseInt(arg);
            if (radioStation <= countRadioStations)
                this.radioStation = radioStation;
        } else if ("next".equals(arg)) {
            if (radioStation == countRadioStations) {
                radioStation = 0;
            } else {
                radioStation++;
            }
        } else if ("prev".equals(arg)) {
            if (radioStation == 0) {
                radioStation = maxVolume;
            } else {
                radioStation--;
            }
        }
    }
}
