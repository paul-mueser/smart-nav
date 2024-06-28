package com.paulmueser.smartnav.data;

import android.util.Log;
import com.paulmueser.smartnav.data.apidata.ApiData;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Parser {
    public static ApiData parseTimetableStop(String xmlData, Class<? extends ApiData> apiDataClass) {
        Serializer serializer = new Persister();
        try {
            return serializer.read(apiDataClass, xmlData);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("SmartNav", "Error parsing XML data\n" + e.getMessage());
            return null;
        }
    }
}
