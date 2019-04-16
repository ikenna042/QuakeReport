package com.example.android.quakereport;


public class Earthquake {

    /**Magnitude of the Earthquake*/
    private String mMagnitude;

    /**Location of the Earthquake*/
    private String mLocation;

    /**Date of the Earthquake*/
    private String mTime;

    /**String of the Earthquake*/
    private String mUrl;

    public Earthquake(String magnitude,String location, String time, String url){

        mMagnitude = magnitude;
        mLocation = location;
        mTime = time;
        mUrl = url;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
