package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;
    private int IncreaseCurrentTemperature;
    private int DecreaseCurrentTemperature;
    private int minIncrease;
    private int maxIncrease;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }


    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setMinDecreaseCurrentTemperature(int DecreaseCurrentTemperature) {
        if (DecreaseCurrentTemperature > maxTemperature) {
            return;
        }
        if (DecreaseCurrentTemperature < minTemperature) {
            return;
        }
        this.DecreaseCurrentTemperature = DecreaseCurrentTemperature;
    }

    public void setMaxIncreaseCurrentTemperature(int[] maxTemp) {
        int minIncrease = maxTemp[0];
        int minIndex = 0;
        for (int i = 1; i < maxTemp.length; i++) {
            if (maxTemp[i] < minIncrease) {
                minIncrease = maxTemperature;
                minIndex = i-1;
            }
        }
        return minIndex;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}