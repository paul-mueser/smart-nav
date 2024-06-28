package com.paulmueser.smartnav.data.apidata;

public enum EventStatus {
    p, // PLANNED The event was planned. This status is also used when the cancellation of an event has been revoked.
    a, // ADDED The event was added to the planned data (new stop).
    c // CANCELLED The event was canceled (as changedstatus, can apply to planned and added stops).
}
