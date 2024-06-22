package com.paulmueser.smartnav.data;

public class HistoricPlatformChanges {
    /** Arrival platform. */
    private String ar;

    /** Detailed cause of track change. */
    private String cot;

    /** Departure platform. */
    private String dp;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ts;

    public HistoricPlatformChanges(String ar, String cot, String dp, String ts) {
        this.ar  = ar;
        this.cot = cot;
        this.dp  = dp;
        this.ts  = ts;
    }

    // region Getters
    public String getAr() {
        return ar;
    }

    public String getCot() {
        return cot;
    }

    public String getDp() {
        return dp;
    }

    public String getTs() {
        return ts;
    }
    // endregion
}
