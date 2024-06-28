package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "rt")
public class ReferenceTrip extends ApiData {
    /**
     * The cancellation flag. True means, the reference trip is cancelled.
     */
    @Attribute(required = false)
    private Boolean c;

    /**
     * It's a compound data type that contains common data items that characterize
     * a reference trip stop. The contents is represented as a compact 4-tuple in XML.
     */
    @Element(required = false)
    private ReferenceTripStopLabel ea;

    /**
     * An id that uniquely identifies the reference trip. It consists of the following
     * two elements separated by dashes: * A 'daily trip id' that uniquely identifies a
     * reference trip within one day. This id is typically reused on subsequent days.
     * This could be negative. * A 10-digit date specifier (YYMMddHHmm) that indicates
     * the planned departure date of the referenced regular trip from its start station.
     * Example: '-7874571842864554321-1403311221' would be used for a trip with daily
     * trip id '-7874571842864554321' that starts on march the 31th 2014.
     */
    @Attribute(required = false)
    private String id;

    /**
     * It's a compound data type that contains common data items that characterize a
     * reference trip. The con-tents is represented as a compact 3-tuple in XML.
     */
    @Element(required = false)
    private ReferenceTripLabel rtl;

    /**
     * It's a compound data type that contains common data items that characterize
     * a reference trip stop. The contents is represented as a compact 4-tuple in XML.
     */
    @Element(required = false)
    private ReferenceTripStopLabel sd;


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

    public ReferenceTripLabel getRtl() {
        return rtl;
    }

    public ReferenceTripStopLabel getSd() {
        return sd;
    }
    // endregion

    @Override
    public String toString() {
        return "ReferenceTrip{" +
                "c=" + c +
                ", ea=" + ea +
                ", id='" + id + '\'' +
                ", rtl=" + rtl +
                ", sd=" + sd +
                '}';
    }
}
