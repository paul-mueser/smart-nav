package com.paulmueser.smartnav.data;

public class ReferenceTripStopLabel {
    /** The eva number of the correspondent stop of the regular trip. */
    private Integer eva;

    /** The index of the correspondent stop of the regular trip. */
    private Integer i;

    /** The (long) name of the correspondent stop of the regular trip. */
    private String n;

    /** The planned time of the correspondent stop of the regular trip. */
    private String pt;

    public ReferenceTripStopLabel(Integer eva, Integer i, String n, String pt) {
        this.eva = eva;
        this.i   = i;
        this.n   = n;
        this.pt  = pt;
    }

    // region Getters
    public Integer getEva() {
        return eva;
    }

    public Integer getI() {
        return i;
    }

    public String getN() {
        return n;
    }

    public String getPt() {
        return pt;
    }
    // endregion
}
