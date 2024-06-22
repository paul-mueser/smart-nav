package com.paulmueser.smartnav.data;

public enum MessageType {
    h, // HIM A HIM message (generated through the Hafas Information Manager).
    q, // QUALITY CHANGE A message about a quality change.
    f, // FREE A free text message.
    d, // CAUSE OF DELAY A message about the cause of a delay.
    i, // IBIS An IBIS message (generated from IRIS-AP).
    u, // UNASSIGNED IBIS MESSAGE An IBIS message (generated from IRIS-AP) not yet assigned to a train.
    r, // DISRUPTION A major disruption.
    c // CONNECTION A connection.
}
