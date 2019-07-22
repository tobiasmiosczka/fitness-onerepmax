package com.github.tobiasmiosczka.oneprepmax;

public class Brzycki extends OneRepMaxCalculator {

    double calculate1rm(double weight, double repetitions) {
        return weight * (36.0 / (37.0 - repetitions));
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return (oneRepMax * (37.0 - repetitions) / 36.0);
    }
}
