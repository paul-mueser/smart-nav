package com.paulmueser.smartnav.data.apidata;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(strict = false, name = "hd")
public class HistoricDelay extends ApiData {
    /**
     * The arrival event. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String ar;

    /**
     * Detailed description of delay cause.
     */
    @Attribute(required = false)
    private String cod;

    /**
     * The departure event. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String dp;

    /**
     * Delay source. * L - LEIBIT LeiBit/LeiDis. * NA - RISNE AUT IRIS-NE
     * (automatisch). * NM - RISNE MAN IRIS-NE (manuell). * V - VDV Prognosen
     * durch dritte EVU über VDVin. * IA - ISTP AUT ISTP automatisch. * IM - ISTP
     * MAN ISTP manuell. * A - AUTOMATIC PROGNOSIS Automatische Prognose durch Prognoseautomat.
     */
    @Attribute(required = false)
    private DelaySource src;

    /**
     * Timestamp. The time, in ten digit 'YYMMddHHmm' format,
     * e.g. '1404011437' for 14:37 on April the 1st of 2014.
     */
    @Attribute(required = false)
    private String ts;


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

    @Override
    public String toString() {
        return "HistoricDelay{" +
                "ar='" + ar + '\'' +
                ", cod='" + cod + '\'' +
                ", dp='" + dp + '\'' +
                ", src=" + src +
                ", ts='" + ts + '\'' +
                '}';
    }
}
