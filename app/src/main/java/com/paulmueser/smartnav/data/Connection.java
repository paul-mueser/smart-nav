package com.paulmueser.smartnav.data;

public class Connection {
    /** Connection status. * w - WAITING This (regular) connection is waiting. * n - TRANSITION
     * This (regular) connection CANNOT wait. * a - ALTERNATIVE This is an alternative (unplanned)
     * connection that has been introduced as a replacement for one regular connection that cannot
     * wait. The connections "tl" (triplabel) attribute might in this case refer to the replaced
     * connection (or more specifi-cally the trip from that connection). Alternative connections
     * are always waiting (they are re-moved otherwise). */
    private ConnectionStatus cs;

    /** EVA station number. */
    private Integer eva;

    /** Id. */
    private String id;

    /** A stop is a part of a Timetable. */
    private TimetableStop ref;

    /** A stop is a part of a Timetable. */
    private TimetableStop s;

    /** Time stamp. The time, in ten digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ts;

    public Connection(ConnectionStatus cs, String id, TimetableStop s, String ts) {
        this.cs = cs;
        this.id = id;
        this.s  = s;
        this.ts = ts;
    }

    public Connection(ConnectionStatus cs, Integer eva, String id, TimetableStop ref, TimetableStop s, String ts) {
        this.cs  = cs;
        this.eva = eva;
        this.id  = id;
        this.ref = ref;
        this.s   = s;
        this.ts  = ts;
    }

    // region Getters
    public ConnectionStatus getCs() {
        return cs;
    }

    public Integer getEva() {
        return eva;
    }

    public String getId() {
        return id;
    }

    public TimetableStop getRef() {
        return ref;
    }

    public TimetableStop getS() {
        return s;
    }

    public String getTs() {
        return ts;
    }
    // endregion
}
