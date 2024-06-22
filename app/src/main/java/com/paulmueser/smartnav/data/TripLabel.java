package com.paulmueser.smartnav.data;

public class TripLabel {
    /** Category. Trip category, e.g. "ICE" or "RE". */
    private String c;

    /** Filter flags. */
    private String f;

    /** Trip/train number, e.g. "4523". */
    private String n;

    /** Owner. A unique short-form and only intended to map a trip to specific evu. */
    private String o;

    /** Trip type. */
    private TripType t;

    public TripLabel(String c, String n, String o) {
        this.c = c;
        this.n = n;
        this.o = o;
    }

    public TripLabel(String c, String f, String n, String o, TripType t) {
        this.c = c;
        this.f = f;
        this.n = n;
        this.o = o;
        this.t = t;
    }

    // region Getters
    public String getC() {
        return c;
    }

    public String getF() {
        return f;
    }

    public String getN() {
        return n;
    }

    public String getO() {
        return o;
    }

    public TripType getT() {
        return t;
    }
    // endregion
}
