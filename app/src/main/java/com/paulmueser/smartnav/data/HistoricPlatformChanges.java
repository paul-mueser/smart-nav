package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "hpc")
public class HistoricPlatformChanges {
    /** Arrival platform. */
    @Attribute(required = false)
    private String ar;

    /** Detailed cause of track change. */
    @Attribute(required = false)
    private String cot;

    /** Departure platform. */
    @Attribute(required = false)
    private String dp;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String ts;


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

    @Override
    public String toString() {
        return "HistoricPlatformChanges{" +
                "ar='" + ar + '\'' +
                ", cot='" + cot + '\'' +
                ", dp='" + dp + '\'' +
                ", ts='" + ts + '\'' +
                '}';
    }
}
