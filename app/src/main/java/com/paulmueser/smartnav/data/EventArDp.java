package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class EventArDp {
    /** Changed distant endpoint. */
    private String cde;

    /** Cancellation time. Time when the cancellation of this stop was created. The time,
     * in ten digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String clt;

    /** Changed platform. */
    private String cp;

    /** Changed path. */
    private String cpth;

    /** Event status. * p - PLANNED The event was planned. This status is also used when the
     * cancellation of an event has been revoked. * a - ADDED The event was added to the
     * planned data (new stop). * c - CANCELLED The event was canceled (as changedstatus, can
     * apply to planned and added stops). */
    private EventStatus cs;

    /** Changed time. New estimated or actual departure or arrival time. The time, in ten
     * digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ct;

    /** Distant change. */
    private Integer dc;

    /** Hidden. 1 if the event should not be shown on WBT because travellers are not
     * supposed to enter or exit the train at this stop. */
    private Integer hi;

    /** Line. The line indicator (e.g. "3" for an S-Bahn or "45S" for a bus). */
    private String l;

    /** List of messages. */
    private ArrayList<Message> m;

    /** Planned distant endpoint. */
    private String pde;

    /** Planned platform. */
    private String pp;

    /** Planned Path. A sequence of station names separated by the pipe symbols ('|').
     * E.g.: 'Mainz Hbf|Rüsselsheim|Frankfrt(M) Flughafen'. For arrival, the path indicates
     * the stations that come before the current station. The first element then is the
     * trip's start station. For departure, the path indicates the stations that come
     * after the current station. The last element in the path then is the trip's
     * destination station. Note that the current station is never included in the path
     * (neither for arrival nor for departure). */
    private String ppth;

    /** Event status. * p - PLANNED The event was planned. This status is also used when
     * the cancellation of an event has been revoked. * a - ADDED The event was added to
     * the planned data (new stop). * c - CANCELLED The event was canceled (as changedstatus,
     * can apply to planned and added stops). */
    private EventStatus ps;

    /** Planned time. Planned departure or arrival time. The time, in ten digit 'YYMMddHHmm'
     * format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String pt;

    /** Transition. Trip id of the next or previous train of a shared train. At the start
     * stop this references the previous trip, at the last stop it references the next trip.
     * E.g. '2016448009055686515-1403311438-1' */
    private String tra;

    /** Wing. A sequence of trip id separated by the pipe symbols ('|'). E.g. '-906407760000782942-1403311431'. */
    private String wings;

    public EventArDp(String cde, String clt, String cp, String cpth, EventStatus cs, String ct, Integer dc, Integer hi, String l, ArrayList<Message> m, String pde, String pp, String ppth, EventStatus ps, String pt, String tra, String wings) {
        this.cde   = cde;
        this.clt   = clt;
        this.cp    = cp;
        this.cpth  = cpth;
        this.cs    = cs;
        this.ct    = ct;
        this.dc    = dc;
        this.hi    = hi;
        this.l     = l;
        this.m     = m;
        this.pde   = pde;
        this.pp    = pp;
        this.ppth  = ppth;
        this.ps    = ps;
        this.pt    = pt;
        this.tra   = tra;
        this.wings = wings;
    }

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

    public ArrayList<Message> getM() {
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
}
