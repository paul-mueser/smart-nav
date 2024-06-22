package com.paulmueser.smartnav.data;

public class StationData {
    /** DS100 station code. */
    private String ds100;

    /** EVA station number. */
    private Integer eva;

    /** List of meta stations. A sequence of station names separated by the pipe symbols ("|"). */
    private String meta;

    /** Station name. */
    private String name;

    /** List of platforms. A sequence of platforms separated by the pipe symbols ("|"). */
    private String p;

    public StationData(String ds100, Integer eva, String name) {
        this.ds100 = ds100;
        this.eva   = eva;
        this.name  = name;
    }

    public StationData(String ds100, Integer eva, String meta, String name, String p) {
        this.ds100 = ds100;
        this.eva   = eva;
        this.meta  = meta;
        this.name  = name;
        this.p     = p;
    }

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
}
