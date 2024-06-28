package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "ea")
public class ReferenceTripStopLabel extends ApiData {
    /** The eva number of the correspondent stop of the regular trip. */
    @Attribute(required = false)
    private Integer eva;

    /** The index of the correspondent stop of the regular trip. */
    @Attribute(required = false)
    private Integer i;

    /** The (long) name of the correspondent stop of the regular trip. */
    @Attribute(required = false)
    private String n;

    /** The planned time of the correspondent stop of the regular trip. */
    @Attribute(required = false)
    private String pt;


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

    @Override
    public String toString() {
        return "ReferenceTripStopLabel{" +
                "eva=" + eva +
                ", i=" + i +
                ", n='" + n + '\'' +
                ", pt='" + pt + '\'' +
                '}';
    }
}
