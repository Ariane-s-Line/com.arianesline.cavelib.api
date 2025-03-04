package com.arianesline.cavelib.api;


import java.util.ArrayList;

public interface ProfileShapeInterface {

    boolean isHasProfileAzimut();

    boolean isHasProfileTilt();

    double getProfileAzimut();

    double getProfileTilt();

    ArrayList<RadiusVectorInterface> getRadiusCollectionInterface();
}
