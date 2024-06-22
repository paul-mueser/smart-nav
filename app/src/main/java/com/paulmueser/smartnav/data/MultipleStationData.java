package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class MultipleStationData {
    /** List of stations with additional data. */
    private ArrayList<StationData> stations;

    public MultipleStationData(ArrayList<StationData> stations) {
        this.stations = stations;
    }

    // region Getters
    public ArrayList<StationData> getStations() {
        return stations;
    }
    // endregion
}
