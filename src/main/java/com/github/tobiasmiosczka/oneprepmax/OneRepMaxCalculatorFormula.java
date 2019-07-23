package com.github.tobiasmiosczka.oneprepmax;

public enum OneRepMaxCalculatorFormula {
    BRZYCKI(new Brzycki(), "Brzycki"),
    EPLEY(new Epley(), "Epley"),
    LOMBARDI(new Lombardi(), "Lombardi"),
    MAYHEW(new Mayhew(), "Mayhew"),
    MCGLOTHIN(new McGlothin(), "McGlothin"),
    OCONNER(new OConner(), "OConner"),
    WATHAN(new Wathan(), "Wathan");

    private OneRepMaxCalculator oneRepMaxCalculator;
    private String title;

    OneRepMaxCalculatorFormula(OneRepMaxCalculator oneRepMaxCalculator, String title) {
        this.oneRepMaxCalculator = oneRepMaxCalculator;
        this.title = title;
    }

    public OneRepMaxCalculator getOneRepMaxCalculator() {
        return oneRepMaxCalculator;
    }

    public String getTitle() {
        return title;
    }
}
