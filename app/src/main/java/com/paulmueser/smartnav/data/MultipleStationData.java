package com.paulmueser.smartnav.data;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(name = "stations")
public class MultipleStationData {
    /** List of stations with additional data. */
    @ElementList(name = "station", required = false, inline = true)
    private List<StationData> stations = new ArrayList<>();


    // region Getters
    public List<StationData> getStations() {
        return stations;
    }
    // endregion

    @Override
    public String toString() {
        return "MultipleStationData{" +
                "stations=" + stations +
                '}';
    }
}
