package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "m")
public class Message extends ApiData {
    /**
     * Code.
     */
    @Attribute(required = false)
    private String c;

    /**
     * Category.
     */
    @Attribute(required = false)
    private String cat;

    /**
     * Deleted.
     */
    @Attribute(required = false)
    private Integer del;

    /**
     * Distributor message.
     */
    @ElementList(required = false, inline = true)
    private List<DistributorMessage> dm = new ArrayList<>();

    /**
     * External category.
     */
    @Attribute(required = false)
    private String ec;

    /**
     * External link associated with the message.
     */
    @Attribute(required = false)
    private String elnk;

    /**
     * External text.
     */
    @Attribute(required = false)
    private String ext;

    /**
     * Valid from. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String from;

    /**
     * Message id.
     */
    @Attribute(required = false)
    private String id;

    /**
     * Internal text.
     */
    @Attribute(name = "int", required = false)
    private String internal;

    /**
     * Owner.
     */
    @Attribute(required = false)
    private String o;

    /**
     * Priority. * 1 - HIGH * 2 - MEDIUM * 3 - LOW * 4 - DONE
     */
    @Attribute(required = false)
    private String pr;

    /**
     * Message status * h - HIM A HIM message (generated through the Hafas
     * Information Manager). * q - QUALITY CHANGE A message about a quality
     * change. * f - FREE A free text message. * d - CAUSE OF DELAY A message
     * about the cause of a delay. * i - IBIS An IBIS message (generated from
     * IRIS-AP). * u - UNASSIGNED IBIS MESSAGE An IBIS message (generated from
     * IRIS-AP) not yet assigned to a train. * r - DISRUPTION A major
     * disruption. * c - CONNECTION A connection.
     */
    @Attribute(required = false)
    private MessageType t;

    /**
     * Trip label.
     */
    @ElementList(required = false, inline = true)
    private List<TripLabel> tl = new ArrayList<>();

    /**
     * Valid to. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String to;

    /**
     * Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. "1404011437" for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String ts;


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

    public List<DistributorMessage> getDm() {
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

    public List<TripLabel> getTl() {
        return tl;
    }

    public String getTo() {
        return to;
    }

    public String getTs() {
        return ts;
    }
    // endregion

    @Override
    public String toString() {
        return "Message{" +
                "c='" + c + '\'' +
                ", cat='" + cat + '\'' +
                ", del=" + del +
                ", dm=" + dm +
                ", ec='" + ec + '\'' +
                ", elnk='" + elnk + '\'' +
                ", ext='" + ext + '\'' +
                ", from='" + from + '\'' +
                ", id='" + id + '\'' +
                ", internal='" + internal + '\'' +
                ", o='" + o + '\'' +
                ", pr='" + pr + '\'' +
                ", t=" + t +
                ", tl=" + tl +
                ", to='" + to + '\'' +
                ", ts='" + ts + '\'' +
                '}';
    }
}
