package com.torryharris.model;

public class Tyre {
    private String tyreName;
    private int size;


    public Tyre(String tyreName, int size) {
        this.tyreName = tyreName;
        this.size = size;
    }
    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
