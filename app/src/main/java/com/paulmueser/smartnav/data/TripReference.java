package com.paulmueser.smartnav.data;

import java.util.ArrayList;

public class TripReference {
    /** The referred trips reference trip elements. */
    private ArrayList<TripLabel> rt;

    /** It's a compound data type that contains common data items that characterize
     * a Trip. The contents is represented as a compact 6-tuple in XML. */
    private TripLabel tl;

    public TripReference(TripLabel tl) {
        this.tl = tl;
    }

    public TripReference(ArrayList<TripLabel> rt, TripLabel tl) {
        this.rt = rt;
        this.tl = tl;
    }

    // region Getters
    public ArrayList<TripLabel> getRt() {
        return rt;
    }

    public TripLabel getTl() {
        return tl;
    }
    // endregion
}
