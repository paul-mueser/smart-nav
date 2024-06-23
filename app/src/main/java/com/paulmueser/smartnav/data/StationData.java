package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "station")
public class StationData {
    /** DS100 station code. */
    @Attribute(required = false)
    private String ds100;

    /** EVA station number. */
    @Attribute(required = false)
    private Integer eva;

    /** List of meta stations. A sequence of station names separated by the pipe symbols ("|"). */
    @Attribute(required = false)
    private String meta;

    /** Station name. */
    @Attribute(required = false)
    private String name;

    /** List of platforms. A sequence of platforms separated by the pipe symbols ("|"). */
    @Attribute(required = false)
    private String p;

    // region Getters
    public String getDs100() {
        return ds100;
    }

    public Integer getEva() {
        return eva;
    }

    public String getMeta() {
        return meta;
    }

    public String getName() {
        return name;
    }

    public String getP() {
        return p;
    }
    // endregion

    @Override
    public String toString() {
        return "StationData{" +
                "ds100='" + ds100 + '\'' +
                ", eva=" + eva +
                ", meta='" + meta + '\'' +
                ", name='" + name + '\'' +
                ", p='" + p + '\'' +
                '}';
    }
}
