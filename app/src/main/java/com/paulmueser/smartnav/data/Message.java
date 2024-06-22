package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class Message {
    /** Code. */
    private String c;

    /** Category. */
    private String cat;

    /** Deleted. */
    private Integer del;

    /** Distributor message. */
    private ArrayList<DistributorMessage> dm;

    /** External category. */
    private String ec;

    /** External link associated with the message. */
    private String elnk;

    /** External text. */
    private String ext;

    /** Valid from. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String from;

    /** Message id. */
    private String id;

    /** Internal text. (Eigtl. int, nicht internal) */
    private String internal;

    /** Owner. */
    private String o;

    /** Priority. * 1 - HIGH * 2 - MEDIUM * 3 - LOW * 4 - DONE */
    private String pr;

    /** Message status * h - HIM A HIM message (generated through the Hafas
     * Information Manager). * q - QUALITY CHANGE A message about a quality
     * change. * f - FREE A free text message. * d - CAUSE OF DELAY A message
     * about the cause of a delay. * i - IBIS An IBIS message (generated from
     * IRIS-AP). * u - UNASSIGNED IBIS MESSAGE An IBIS message (generated from
     * IRIS-AP) not yet assigned to a train. * r - DISRUPTION A major
     * disruption. * c - CONNECTION A connection. */
    private MessageType t;

    /** Trip label. */
    private TripLabel tl;

    /** Valid to. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String to;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. "1404011437" for 14:37 on April the 1st of 2014. */
    private String ts;

    public Message(String id, MessageType t, String ts) {
        this.id = id;
        this.t  = t;
        this.ts = ts;
    }

    public Message(String c, String cat, Integer del, ArrayList<DistributorMessage> dm, String ec, String elnk, String ext, String from, String id, String internal, String o, String pr, MessageType t, TripLabel tl, String to, String ts) {
        this.c        = c;
        this.cat      = cat;
        this.del      = del;
        this.dm       = dm;
        this.ec       = ec;
        this.elnk     = elnk;
        this.ext      = ext;
        this.from     = from;
        this.id       = id;
        this.internal = internal;
        this.o        = o;
        this.pr       = pr;
        this.t        = t;
        this.tl       = tl;
        this.to       = to;
        this.ts       = ts;
    }

    // region Getters
    public String getC() {
        return c;
    }

    public String getCat() {
        return cat;
    }

    public Integer getDel() {
        return del;
    }

    public ArrayList<DistributorMessage> getDm() {
        return dm;
    }

    public String getEc() {
        return ec;
    }

    public String getElnk() {
        return elnk;
    }

    public String getExt() {
        return ext;
    }

    public String getFrom() {
        return from;
    }

    public String getId() {
        return id;
    }

    public String getInternal() {
        return internal;
    }

    public String getO() {
        return o;
    }

    public String getPr() {
        return pr;
    }

    public MessageType getT() {
        return t;
    }

    public TripLabel getTl() {
        return tl;
    }

    public String getTo() {
        return to;
    }

    public String getTs() {
        return ts;
    }
    // endregion
}
