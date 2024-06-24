package com.paulmueser.smartnav.api;

import com.paulmueser.smartnav.BuildConfig;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiService {

    /**
     * Requests the known changes for a station
     *
     * @param listener the listener to be called when the response is received
     * @param stationId the stations EVA number
     */
    public static void requestKnownChanges(IResponseReceived listener, String stationId) {
        sendRequest(listener, "fchg/" + stationId);
    }

    /**
     * Requests the planned departures for a station at a given date and time
     *
     * @param listener the listener to be called when the response is received
     * @param stationId the stations EVA number
     * @param date the date in the format yyMMdd
     * @param time the time in the format HH
     */
    public static void requestPlan(IResponseReceived listener, String stationId, String date, String time) {
        sendRequest(listener, String.format("plan/%s/%s/%s", stationId, date, time));
    }

    /**
     * Requests a station with the given name/pattern
     *
     * @param listener the listener to be called when the response is received
     * @param stationName the name or pattern of the station
     */
    public static void requestStation(IResponseReceived listener, String stationName) {
        sendRequest(listener, "station/" + stationName);
    }

    /**
     * Sends a request to the DB API with the given url and calls the listener with the response
     *
     * @param listener the listener to be called when the response is received
     * @param url the url to send the request to
     */
    private static void sendRequest(IResponseReceived listener, String url) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String clientId = BuildConfig.CLIENT_ID;
                    String clientSecret = BuildConfig.CLIENT_SECRET;

                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("https://apis.deutschebahn.com/db-api-marketplace/apis/timetables/v1/" + url)
                            .get()
                            .addHeader("DB-Client-Id", clientId)
                            .addHeader("DB-Api-Key", clientSecret)
                            .addHeader("accept", "application/xml")
                            .build();
                    Response response = client.newCall(request).execute();
                    if (response.code() == 200) {
                        String responseData = response.body().string();
                        listener.onSuccess(responseData);
                    } else {
                        String errorResponse = response.code() + " " + response.body().string();
                        listener.onError(errorResponse);
                    }
                } catch (final Exception e) {
                    String error = e.getMessage();
                    listener.onError(error);
                }
            }
        }).start();
    }
}
