package com.paulmueser.smartnav.data;

public enum ReferenceTripRelationToStop {
    b, // BEFORE The reference trip ends before that stop.
    e, // END The reference trips ends at that stop.
    c, // BETWEEN The stop is between reference trips start and end, in other words, the stop is contained within its travel path.
    s, // START The reference trip starts at that stop.
    a // AFTER The reference trip starts after that stop.
}
