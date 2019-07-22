package com.github.tobiasmiosczka.oneprepmax;

public class Lombardi extends OneRepMaxCalculator {

    double calculate1rm(double weight, double repetitions) {
        return weight * Math.pow(repetitions, 0.1);
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return oneRepMax / Math.pow(repetitions, 0.1);
    }
}
