package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "rtr")
public class ReferenceTripRelation {
    /** A reference trip is another real trip, but it doesn't have
     * its own stops and events. It refers only to its ref-erenced
     * regular trip. The reference trip collects mainly all different
     * attributes of the referenced regular trip. */
    @Element(required = false)
    private ReferenceTrip rt;

    /** The reference trips relation to the stop, which contains it. * b - BEFORE
     * The reference trip ends before that stop. * e - END The reference trips ends
     * at that stop. * c - BETWEEN The stop is between reference trips start and
     * end, in other words, the stop is contained within its travel path. * s - START
     * The reference trip starts at that stop. * a - AFTER The reference trip starts
     * after that stop. */
    @Attribute(required = false)
    private ReferenceTripRelationToStop rts;


    // region Getters
    public ReferenceTrip getRt() {
        return rt;
    }

    public ReferenceTripRelationToStop getRts() {
        return rts;
    }
    // endregion

    @Override
    public String toString() {
        return "ReferenceTripRelation{" +
                "rt=" + rt +
                ", rts=" + rts +
                '}';
    }
}
