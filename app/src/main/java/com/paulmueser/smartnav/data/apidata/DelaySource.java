package com.paulmueser.smartnav.data.apidata;

public enum DelaySource {
    L, // LEIBIT LeiBit/LeiDis.
    NA, // RISNE AUT IRIS-NE (automatisch).
    NM, // RISNE MAN IRIS-NE (manuell).
    V, // VDV Prognosen durch dritte EVU über VDVin.
    IA, // ISTP AUT ISTP automatisch.
    IM, // ISTP MAN ISTP manuell.
    A // AUTOMATIC PROGNOSIS Automatische Prognose durch Prognoseautomat.
}
