package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class TimetableStop {
    /** An event (arrival or departure) that is part of a stop. */
    private EventArDp ar;

    /** Connection element. */
    private ArrayList<Connection> conn;

    /** An event (arrival or departure) that is part of a stop. */
    private EventArDp dp;

    /** The eva code of the station of this stop. Example '8000105' for Frankfurt(Main)Hbf. */
    private Integer eva;

    /** Historic delay element. */
    private ArrayList<HistoricDelay> hd;

    /** Historic platform change element. */
    private ArrayList<HistoricPlatformChanges> hpc;

    /** An id that uniquely identifies the stop. It consists of the following three elements
     * separated by dashes * a 'daily trip id' that uniquely identifies a trip within one day.
     * This id is typically reused on subsequent days. This could be negative. * a 6-digit date
     * specifier (YYMMdd) that indicates the planned departure date of the trip from its start
     * station. * an index that indicates the position of the stop within the trip (in rare
     * cases, one trip may arrive multiple times at one station). Added trips get indices above
     * 100. Example '-7874571842864554321-1403311221-11' would be used for a trip with daily
     * trip id '-7874571842864554321' that starts on march the 31th 2014 and where the current
     * station is the 11th stop. */
    private String id;

    /** Message element. */
    private ArrayList<Message> m;

    /** It's a reference to another trip, which holds its label and reference trips, if available. */
    private TripReference ref;

    /** Reference trip relation element. */
    private ArrayList<ReferenceTripRelation> rtr;

    /** It's a compound data type that contains common data items that characterize a Trip.
     * The contents is represented as a compact 6-tuple in XML. */
    private TripLabel tl;


    public TimetableStop(Integer eva, String id) {
        this.eva = eva;
        this.id  = id;
    }

    public TimetableStop(EventArDp ar, ArrayList<Connection> conn, EventArDp dp, Integer eva, ArrayList<HistoricDelay> hd, ArrayList<HistoricPlatformChanges> hpc, String id, ArrayList<Message> m, TripReference ref, ArrayList<ReferenceTripRelation> rtr, TripLabel tl) {
        this.ar   = ar;
        this.conn = conn;
        this.dp   = dp;
        this.eva  = eva;
        this.hd   = hd;
        this.hpc  = hpc;
        this.id   = id;
        this.m    = m;
        this.ref  = ref;
        this.rtr  = rtr;
        this.tl   = tl;
    }

    // region Getters
    public EventArDp getAr() {
        return ar;
    }

    public ArrayList<Connection> getConn() {
        return conn;
    }

    public EventArDp getDp() {
        return dp;
    }

    public Integer getEva() {
        return eva;
    }

    public ArrayList<HistoricDelay> getHd() {
        return hd;
    }

    public ArrayList<HistoricPlatformChanges> getHpc() {
        return hpc;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Message> getM() {
        return m;
    }

    public TripReference getRef() {
        return ref;
    }

    public ArrayList<ReferenceTripRelation> getRtr() {
        return rtr;
    }

    public TripLabel getTl() {
        return tl;
    }
    // endregion
}
