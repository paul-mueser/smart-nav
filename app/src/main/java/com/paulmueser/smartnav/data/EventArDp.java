package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false)
public abstract class EventArDp {
    /** Changed distant endpoint. */
    @Attribute(required = false)
    private String cde;

    /** Cancellation time. Time when the cancellation of this stop was created. The time,
     * in ten digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String clt;

    /** Changed platform. */
    @Attribute(required = false)
    private String cp;

    /** Changed path. */
    @Attribute(required = false)
    private String cpth;

    /** Event status. * p - PLANNED The event was planned. This status is also used when the
     * cancellation of an event has been revoked. * a - ADDED The event was added to the
     * planned data (new stop). * c - CANCELLED The event was canceled (as changedstatus, can
     * apply to planned and added stops). */
    @Attribute(required = false)
    private EventStatus cs;

    /** Changed time. New estimated or actual departure or arrival time. The time, in ten
     * digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String ct;

    /** Distant change. */
    @Attribute(required = false)
    private Integer dc;

    /** Hidden. 1 if the event should not be shown on WBT because travellers are not
     * supposed to enter or exit the train at this stop. */
    @Attribute(required = false)
    private Integer hi;

    /** Line. The line indicator (e.g. "3" for an S-Bahn or "45S" for a bus). */
    @Attribute(required = false)
    private String l;

    /** List of messages. */
    @ElementList(required = false, inline = true)
    private List<Message> m = new ArrayList<>();

    /** Planned distant endpoint. */
    @Attribute(required = false)
    private String pde;

    /** Planned platform. */
    @Attribute(required = false)
    private String pp;

    /** Planned Path. A sequence of station names separated by the pipe symbols ('|').
     * E.g.: 'Mainz Hbf|Rüsselsheim|Frankfrt(M) Flughafen'. For arrival, the path indicates
     * the stations that come before the current station. The first element then is the
     * trip's start station. For departure, the path indicates the stations that come
     * after the current station. The last element in the path then is the trip's
     * destination station. Note that the current station is never included in the path
     * (neither for arrival nor for departure). */
    @Attribute(required = false)
    private String ppth;

    /** Event status. * p - PLANNED The event was planned. This status is also used when
     * the cancellation of an event has been revoked. * a - ADDED The event was added to
     * the planned data (new stop). * c - CANCELLED The event was canceled (as changedstatus,
     * can apply to planned and added stops). */
    @Attribute(required = false)
    private EventStatus ps;

    /** Planned time. Planned departure or arrival time. The time, in ten digit 'YYMMddHHmm'
     * format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String pt;

    /** Transition. Trip id of the next or previous train of a shared train. At the start
     * stop this references the previous trip, at the last stop it references the next trip.
     * E.g. '2016448009055686515-1403311438-1' */
    @Attribute(required = false)
    private String tra;

    /** Wing. A sequence of trip id separated by the pipe symbols ('|'). E.g. '-906407760000782942-1403311431'. */
    @Attribute(required = false)
    private String wings;


    // region Getters
    public String getCde() {
        return cde;
    }

    public String getClt() {
        return clt;
    }

    public String getCp() {
        return cp;
    }

    public String getCpth() {
        return cpth;
    }

    public EventStatus getCs() {
        return cs;
    }

    public String getCt() {
        return ct;
    }

    public Integer getDc() {
        return dc;
    }

    public Integer getHi() {
        return hi;
    }

    public String getL() {
        return l;
    }

    public List<Message> getM() {
        return m;
    }

    public String getPde() {
        return pde;
    }

    public String getPp() {
        return pp;
    }

    public String getPpth() {
        return ppth;
    }

    public EventStatus getPs() {
        return ps;
    }

    public String getPt() {
        return pt;
    }

    public String getTra() {
        return tra;
    }

    public String getWings() {
        return wings;
    }
    // endregion

    @Override
    public String toString() {
        return "EventArDp{" +
                "cde='" + cde + '\'' +
                ", clt='" + clt + '\'' +
                ", cp='" + cp + '\'' +
                ", cpth='" + cpth + '\'' +
                ", cs=" + cs +
                ", ct='" + ct + '\'' +
                ", dc=" + dc +
                ", hi=" + hi +
                ", l='" + l + '\'' +
                ", m=" + m +
                ", pde='" + pde + '\'' +
                ", pp='" + pp + '\'' +
                ", ppth='" + ppth + '\'' +
                ", ps=" + ps +
                ", pt='" + pt + '\'' +
                ", tra='" + tra + '\'' +
                ", wings='" + wings + '\'' +
                '}';
    }
}
