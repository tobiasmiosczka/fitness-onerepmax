package com.github.tobiasmiosczka.oneprepmax;

public class Wathan extends OneRepMaxCalculator {

    double calculate1rm(double weight, double repetitions) {
        return 100.0 * weight / (48.8 + (53.8 * Math.pow(Math.E, -0.075 * repetitions)));
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return oneRepMax * (48.8 + (53.8 * Math.pow(Math.E, -0.075 * repetitions))) / 100.0;
    }
}
