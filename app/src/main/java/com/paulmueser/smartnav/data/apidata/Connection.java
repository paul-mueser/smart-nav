package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "conn")
public class Connection extends ApiData {
    /** Connection status. * w - WAITING This (regular) connection is waiting. * n - TRANSITION
     * This (regular) connection CANNOT wait. * a - ALTERNATIVE This is an alternative (unplanned)
     * connection that has been introduced as a replacement for one regular connection that cannot
     * wait. The connections "tl" (triplabel) attribute might in this case refer to the replaced
     * connection (or more specifi-cally the trip from that connection). Alternative connections
     * are always waiting (they are re-moved otherwise). */
    @Attribute(required = false)
    private ConnectionStatus cs;

    /** EVA station number. */
    @Attribute(required = false)
    private Integer eva;

    /** Id. */
    @Attribute(required = false)
    private String id;

    /** A stop is a part of a Timetable. */
    @Element(required = false)
    private ReferenceStop ref;

    /** A stop is a part of a Timetable. */
    @Element(required = false)
    private TimetableStop s;

    /** Time stamp. The time, in ten digit 'YYMMddHHmm' format, e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    @Attribute(required = false)
    private String ts;


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

    public ReferenceStop getRef() {
        return ref;
    }

    public TimetableStop getS() {
        return s;
    }

    public String getTs() {
        return ts;
    }
    // endregion

    @Override
    public String toString() {
        return "Connection{" +
                "cs=" + cs +
                ", eva=" + eva +
                ", id='" + id + '\'' +
                ", ref=" + ref +
                ", s=" + s +
                ", ts='" + ts + '\'' +
                '}';
    }
}
