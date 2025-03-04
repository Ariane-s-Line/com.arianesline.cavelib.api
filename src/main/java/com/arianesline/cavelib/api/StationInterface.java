package com.arianesline.cavelib.api;

public interface StationInterface {
    double getLongitude();

    double getLatitude();

    double getAbsoluteElevation();

    double getRelativeElevation();

    int getID();

    String getSection();

    String getComment();
}
