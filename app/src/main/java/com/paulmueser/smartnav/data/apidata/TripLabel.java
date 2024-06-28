package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "tl")
public class TripLabel extends ApiData {
    /** Category. Trip category, e.g. "ICE" or "RE". */
    @Attribute(required = false)
    private String c;

    /** Filter flags. */
    @Attribute(required = false)
    private String f;

    /** Trip/train number, e.g. "4523". */
    @Attribute(required = false)
    private String n;

    /** Owner. A unique short-form and only intended to map a trip to specific evu. */
    @Attribute(required = false)
    private String o;

    /** Trip type. */
    @Attribute(required = false)
    private TripType t;


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

    @Override
    public String toString() {
        return "TripLabel{" +
                "c='" + c + '\'' +
                ", f='" + f + '\'' +
                ", n='" + n + '\'' +
                ", o='" + o + '\'' +
                ", t=" + t +
                '}';
    }
}
