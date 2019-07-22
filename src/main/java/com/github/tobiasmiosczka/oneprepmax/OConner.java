package com.github.tobiasmiosczka.oneprepmax;

public class OConner extends OneRepMaxCalculator {

    double calculate1rm(double weight, double repetitions) {
        return weight * (1.0 + ( repetitions / 40.0));
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return oneRepMax / (1.0 + (repetitions / 40.0));
    }
}
