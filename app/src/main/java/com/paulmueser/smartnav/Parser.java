package com.paulmueser.smartnav;

import android.util.Log;
import com.paulmueser.smartnav.data.MultipleStationData;
import com.paulmueser.smartnav.data.StationData;
import com.paulmueser.smartnav.data.Timetable;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Parser {
    public static Timetable parseTimetableStop(String xmlData) {
        Serializer serializer = new Persister();
        try {
            return serializer.read(Timetable.class, xmlData);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("SmartNav", "Error parsing XML data\n" + e.getMessage());
            return null;
        }
    }
}
