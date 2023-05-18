package com.example.handlingexceptions.sensorsandtemperatureapplication;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isSensorOn;

    public TemperatureSensor() {
        isSensorOn = false;
    }

    @Override
    public boolean isOn() {
        return isSensorOn;
    }

    @Override
    public void setOn() {
        isSensorOn = true;
    }

    @Override
    public void setOff() {
        isSensorOn = false;
    }

    @Override
    public int read() {
        if (!isSensorOn) {
            throw new IllegalStateException("Sensor is off");
        }

        Random random = new Random();
        int temperature = random.nextInt(61) - 30;
        return temperature;
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        sensor.setOn();
        System.out.println(sensor.read());

        sensor.setOff();
        // Throws an IllegalStateException
        System.out.println(sensor.read());
    }
}

