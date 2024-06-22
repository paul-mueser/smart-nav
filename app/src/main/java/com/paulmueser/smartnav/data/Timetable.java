package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class Timetable {
    /** EVA station number. */
    private Integer eva;

    /** List of Message. */
    private ArrayList<Message> m;

    /** List of TimetableStop. */
    private ArrayList<TimetableStop> s;

    /** Station name. */
    private String station;

    public Timetable(Integer eva, ArrayList<Message> m, ArrayList<TimetableStop> s, String station) {
        this.eva     = eva;
        this.m       = m;
        this.s       = s;
        this.station = station;
    }

    // region Getters
    public Integer getEva() {
        return eva;
    }

    public ArrayList<Message> getM() {
        return m;
    }

    public ArrayList<TimetableStop> getS() {
        return s;
    }

    public String getStation() {
        return station;
    }
    // endregion
}
