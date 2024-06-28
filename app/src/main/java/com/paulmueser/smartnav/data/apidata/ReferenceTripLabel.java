package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "rtl")
public class ReferenceTripLabel extends ApiData {
    /** Category. Trip category, e.g. "ICE" or "RE". */
    @Attribute(required = false)
    private String c;

    /** Trip/train number, e.g. "4523". */
    @Attribute(required = false)
    private String n;


    // region Getters
    public String getC() {
        return c;
    }

    public String getN() {
        return n;
    }
    // endregion

    @Override
    public String toString() {
        return "ReferenceTripLabel{" +
                "c='" + c + '\'' +
                ", n='" + n + '\'' +
                '}';
    }
}
