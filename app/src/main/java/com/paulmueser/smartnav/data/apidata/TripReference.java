package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root(strict = false, name = "ref")
public class TripReference extends ApiData {
    /** The referred trips reference trip elements. */
    @ElementList(required = false, inline = true)
    private List<ReferredTripLabel> rt = new ArrayList<>();

    /** It's a compound data type that contains common data items that characterize
     * a Trip. The contents is represented as a compact 6-tuple in XML. */
    @Element(required = false)
    private TripLabel tl;


    // region Getters
    public List<ReferredTripLabel> getRt() {
        return rt;
    }

    public TripLabel getTl() {
        return tl;
    }
    // endregion

    @Override
    public String toString() {
        return "TripReference{" +
                "rt=" + rt +
                ", tl=" + tl +
                '}';
    }
}
