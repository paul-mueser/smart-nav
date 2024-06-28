package com.paulmueser.smartnav.data;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchParameterData {
    private final String            routeStartEvaNr;
    private final String            routeStartName;
    private final String            routeEndName;
    private final ArrayList<String> routeTransferStops;
    private final String            routeStartDate;
    private final String            routeStartTime;
    private final boolean           onlyPublicTransport;
    private final boolean           isDirectConnection;

    public SearchParameterData(String routeStartEvaNr, String routeStartName, String routeEndName, ArrayList<String> routeTransferStops, String routeStartDate, String routeStartTime, boolean onlyPublicTransport) {
        this.routeStartEvaNr     = routeStartEvaNr;
        this.routeStartName      = routeStartName;
        this.routeEndName        = routeEndName;
        this.routeTransferStops  = routeTransferStops;
        this.routeStartDate      = routeStartDate;
        this.routeStartTime      = routeStartTime;
        this.onlyPublicTransport = onlyPublicTransport;
        this.isDirectConnection  = routeTransferStops == null || routeTransferStops.isEmpty();
    }

    // region Getters
    public String getRouteStartEvaNr() {
        return routeStartEvaNr;
    }

    public String getRouteStartName() {
        return routeStartName;
    }

    public String getRouteEndName() {
        return routeEndName;
    }

    public ArrayList<String> getRouteTransferStops() {
        return routeTransferStops;
    }

    public String getRouteStartDate() {
        return routeStartDate;
    }

    public String getRouteStartTime() {
        return routeStartTime;
    }

    public boolean isOnlyPublicTransport() {
        return onlyPublicTransport;
    }

    public boolean isDirectConnection() {
        return isDirectConnection;
    }
    // endregion
}