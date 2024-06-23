package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "timetable")
public class Timetable {
    /** EVA station number. */
    @Attribute(required = false)
    private Integer eva;

    /** List of Message. */
    @ElementList(required = false, inline = true)
    private List<Message> m = new ArrayList<>();

    /** List of TimetableStop. */
    @ElementList(required = false, inline = true)
    private List<TimetableStop> s = new ArrayList<>();

    /** Station name. */
    @Attribute(required = false)
    private String station;


    // region Getters
    public Integer getEva() {
        return eva;
    }

    public List<Message> getM() {
        return m;
    }

    public List<TimetableStop> getS() {
        return s;
    }

    public String getStation() {
        return station;
    }
    // endregion

    @Override
    public String toString() {
        return "Timetable{" +
                "eva=" + eva +
                ", m=" + m +
                ", s=" + s +
                ", station='" + station + '\'' +
                '}';
    }
}
