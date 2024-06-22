package com.paulmueser.smartnav.data;

public class HistoricDelay {
    /** The arrival event. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ar;

    /** Detailed description of delay cause. */
    private String cod;

    /** The departure event. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String dp;

    /** Delay source. * L - LEIBIT LeiBit/LeiDis. * NA - RISNE AUT IRIS-NE
     * (automatisch). * NM - RISNE MAN IRIS-NE (manuell). * V - VDV Prognosen
     * durch dritte EVU über VDVin. * IA - ISTP AUT ISTP automatisch. * IM - ISTP
     * MAN ISTP manuell. * A - AUTOMATIC PROGNOSIS Automatische Prognose durch Prognoseautomat. */
    private DelaySource src;

    /** Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014. */
    private String ts;

    public HistoricDelay(String ar, String cod, String dp, DelaySource src, String ts) {
        this.ar  = ar;
        this.cod = cod;
        this.dp  = dp;
        this.src = src;
        this.ts  = ts;
    }

    // region Getters
    public String getAr() {
        return ar;
    }

    public String getCod() {
        return cod;
    }

    public String getDp() {
        return dp;
    }

    public DelaySource getSrc() {
        return src;
    }

    public String getTs() {
        return ts;
    }
    // endregion
}
