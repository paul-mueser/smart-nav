package com.paulmueser.smartnav.data;

public class DistributorMessage {
    /** Internal text. */
    private String internal;

    /** Distributor name. */
    private String n;

    /** Distributor type. * s - CITY * r - REGION * f - LONG DISTANCE * x - OTHER */
    private DistributorType t;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ts;

    public DistributorMessage(String internal, String n, DistributorType t, String ts) {
        this.internal = internal;
        this.n        = n;
        this.t        = t;
        this.ts       = ts;
    }

    // region Getters
    public String getInternal() {
        return internal;
    }

    public String getN() {
        return n;
    }

    public DistributorType getT() {
        return t;
    }

    public String getTs() {
        return ts;
    }
    // endregion
}
