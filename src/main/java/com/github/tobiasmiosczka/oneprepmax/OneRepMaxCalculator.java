package com.github.tobiasmiosczka.oneprepmax;

public abstract class OneRepMaxCalculator {
   abstract double calculate1rm (double weight, double repetitions);
   abstract double calculateXrmWeight (double oneRepMax, double repetitions);
}
