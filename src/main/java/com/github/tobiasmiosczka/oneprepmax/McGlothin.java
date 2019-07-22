package com.github.tobiasmiosczka.oneprepmax;

public class McGlothin extends OneRepMaxCalculator{

    double calculate1rm(double weight, double repetitions) {
        return 100.0 * weight / (101.3 - (2.67123 * repetitions));
    }

    double calculateXrmWeight(double oneRepMax, double repetitions) {
        return (oneRepMax * (101.3 - (2.67123 * repetitions))) / 100.0;
    }
}
