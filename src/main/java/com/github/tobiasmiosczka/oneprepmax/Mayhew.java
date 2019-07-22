package com.github.tobiasmiosczka.oneprepmax;

public class Mayhew extends OneRepMaxCalculator{

    double calculate1rm(double weight, double repetitions) {
        return 100.0 * weight / (52.2 + (41.9 * Math.pow(Math.E, -0.055 * repetitions)));
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return (oneRepMax * (52.2 + (41.9 * Math.pow(Math.E, -0.055 * repetitions)))) / 100.0;
    }
}
