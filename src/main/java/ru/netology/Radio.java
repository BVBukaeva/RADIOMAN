package ru.netology;

public class Radio {
    int volume;
    int radioStation;

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
            if (volume < 10) {
                volume++;
            }
        } else if ("-".equals(arg)) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void changeRadioStation(String arg) {
        if (arg.matches("[0-9]")) {
            radioStation = Integer.parseInt(arg);
        } else if ("next".equals(arg)) {
            if (radioStation == 9) {
                radioStation = 0;
            } else {
                radioStation++;
            }
        } else if ("prev".equals(arg)) {
            if (radioStation == 0) {
                radioStation = 9;
            } else {
                radioStation--;
            }
        }
    }
}
