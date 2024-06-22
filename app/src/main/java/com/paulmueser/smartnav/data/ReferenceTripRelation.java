package com.paulmueser.smartnav.data;

public class ReferenceTripRelation {
    /** A reference trip is another real trip, but it doesn't have
     * its own stops and events. It refers only to its ref-erenced
     * regular trip. The reference trip collects mainly all different
     * attributes of the referenced regular trip. */
    private ReferenceTrip rt;

    /** The reference trips relation to the stop, which contains it. * b - BEFORE
     * The reference trip ends before that stop. * e - END The reference trips ends
     * at that stop. * c - BETWEEN The stop is between reference trips start and
     * end, in other words, the stop is contained within its travel path. * s - START
     * The reference trip starts at that stop. * a - AFTER The reference trip starts
     * after that stop. */
    private ReferenceTripRelationToStop rts;

    public ReferenceTripRelation(ReferenceTrip rt, ReferenceTripRelationToStop rts) {
        this.rt  = rt;
        this.rts = rts;
    }

    // region Getters
    public ReferenceTrip getRt() {
        return rt;
    }

    public ReferenceTripRelationToStop getRts() {
        return rts;
    }
    // endregion
}
