package com.paulmueser.smartnav.data;

public enum ConnectionStatus {
    w, // WAITING This (regular) connection is waiting.
    n, // TRANSITION This (regular) connection CANNOT wait.
    a // ALTERNATIVE This is an alternative (unplanned) connection that has been introduced as a replacement for one regular connection that cannot wait.
}
