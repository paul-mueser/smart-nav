package com.paulmueser.smartnav.data;

public class ReferenceTripLabel {
    /** Category. Trip category, e.g. "ICE" or "RE". */
    private String c;

    /** Trip/train number, e.g. "4523". */
    private String n;

    public ReferenceTripLabel(String c, String n) {
        this.c = c;
        this.n = n;
    }

    // region Getters
    public String getC() {
        return c;
    }

    public String getN() {
        return n;
    }
    // endregion
}
