package com.yagmur.scanner;

public class ScanResult {
    private int port;
    private boolean isOpen;

    public ScanResult(int port, boolean isOpen) {
        this.port = port;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "[+] Port " + port + " DURUM: AÇIK";

    }
}