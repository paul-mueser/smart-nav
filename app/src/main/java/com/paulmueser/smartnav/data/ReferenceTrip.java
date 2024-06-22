package com.paulmueser.smartnav.data;

public class ReferenceTrip {
    /** The cancellation flag. True means, the reference trip is cancelled. */
    private Boolean c;

    /** It's a compound data type that contains common data items that characterize
     * a reference trip stop. The contents is represented as a compact 4-tuple in XML. */
    private ReferenceTripStopLabel ea;

    /** An id that uniquely identifies the reference trip. It consists of the following
     * two elements separated by dashes: * A 'daily trip id' that uniquely identifies a
     * reference trip within one day. This id is typically reused on subsequent days.
     * This could be negative. * A 10-digit date specifier (YYMMddHHmm) that indicates
     * the planned departure date of the referenced regular trip from its start station.
     * Example: '-7874571842864554321-1403311221' would be used for a trip with daily
     * trip id '-7874571842864554321' that starts on march the 31th 2014. */
    private String id;

    /** It's a compound data type that contains common data items that characterize a
     * reference trip. The con-tents is represented as a compact 3-tuple in XML. */
    private ReferenceTripLabel tl;

    /** It's a compound data type that contains common data items that characterize
     * a reference trip stop. The contents is represented as a compact 4-tuple in XML. */
    private ReferenceTripStopLabel sd;

    public ReferenceTrip(Boolean c, ReferenceTripStopLabel ea, String id, ReferenceTripLabel tl, ReferenceTripStopLabel sd) {
        this.c  = c;
        this.ea = ea;
        this.id = id;
        this.tl = tl;
        this.sd = sd;
    }

    // region Getters
    public Boolean getC() {
        return c;
    }

    public ReferenceTripStopLabel getEa() {
        return ea;
    }

    public String getId() {
        return id;
    }

    public ReferenceTripLabel getTl() {
        return tl;
    }

    public ReferenceTripStopLabel getSd() {
        return sd;
    }
    // endregion
}
