package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "s")
public class TimetableStop {
    /** An event (arrival or departure) that is part of a stop. */
    @Element(required = false)
    private EventAr ar;

    /** Connection element. */
    @ElementList(required = false, inline = true)
    private List<Connection> conn = new ArrayList<>();

    /** An event (arrival or departure) that is part of a stop. */
    @Element(required = false)
    private EventDp dp;

    /** The eva code of the station of this stop. Example '8000105' for Frankfurt(Main)Hbf. */
    @Attribute(required = false)
    private Integer eva;

    /** Historic delay element. */
    @ElementList(required = false, inline = true)
    private List<HistoricDelay> hd = new ArrayList<>();

    /** Historic platform change element. */
    @ElementList(required = false, inline = true)
    private List<HistoricPlatformChanges> hpc = new ArrayList<>();

    /** An id that uniquely identifies the stop. It consists of the following three elements
     * separated by dashes * a 'daily trip id' that uniquely identifies a trip within one day.
     * This id is typically reused on subsequent days. This could be negative. * a 6-digit date
     * specifier (YYMMdd) that indicates the planned departure date of the trip from its start
     * station. * an index that indicates the position of the stop within the trip (in rare
     * cases, one trip may arrive multiple times at one station). Added trips get indices above
     * 100. Example '-7874571842864554321-1403311221-11' would be used for a trip with daily
     * trip id '-7874571842864554321' that starts on march the 31th 2014 and where the current
     * station is the 11th stop. */
    @Attribute(required = false)
    private String id;

    /** Message element. */
    @ElementList(required = false, inline = true)
    private List<Message> m = new ArrayList<>();

    /** It's a reference to another trip, which holds its label and reference trips, if available. */
    @Element(required = false)
    private TripReference ref;

    /** Reference trip relation element. */
    @ElementList(required = false, inline = true)
    private List<ReferenceTripRelation> rtr = new ArrayList<>();

    /** It's a compound data type that contains common data items that characterize a Trip.
     * The contents is represented as a compact 6-tuple in XML. */
    @Element(required = false)
    private TripLabel tl;


    // region Getters
    public EventAr getAr() {
        return ar;
    }

    public List<Connection> getConn() {
        return conn;
    }

    public EventDp getDp() {
        return dp;
    }

    public Integer getEva() {
        return eva;
    }

    public List<HistoricDelay> getHd() {
        return hd;
    }

    public List<HistoricPlatformChanges> getHpc() {
        return hpc;
    }

    public String getId() {
        return id;
    }

    public List<Message> getM() {
        return m;
    }

    public TripReference getRef() {
        return ref;
    }

    public List<ReferenceTripRelation> getRtr() {
        return rtr;
    }

    public TripLabel getTl() {
        return tl;
    }
    // endregion

    @Override
    public String toString() {
        return "TimetableStop{" +
                "ar=" + ar +
                ", conn=" + conn +
                ", dp=" + dp +
                ", eva=" + eva +
                ", hd=" + hd +
                ", hpc=" + hpc +
                ", id='" + id + '\'' +
                ", m=" + m +
                ", ref=" + ref +
                ", rtr=" + rtr +
                ", tl=" + tl +
                '}';
    }
}
