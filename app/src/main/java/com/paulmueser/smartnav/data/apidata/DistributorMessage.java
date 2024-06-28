package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "dm")
public class DistributorMessage extends ApiData {
    /** Internal text. */
    @Attribute(name = "int")
    private String internal;

    /** Distributor name. */
    @Attribute(required = false)
    private String n;

    /** Distributor type. * s - CITY * r - REGION * f - LONG DISTANCE * x - OTHER */
    @Attribute(required = false)
    private DistributorType t;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String ts;


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

    @Override
    public String toString() {
        return "DistributorMessage{" +
                "internal='" + internal + '\'' +
                ", n='" + n + '\'' +
                ", t=" + t +
                ", ts='" + ts + '\'' +
                '}';
    }
}
