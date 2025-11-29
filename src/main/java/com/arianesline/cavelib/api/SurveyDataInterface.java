package com.arianesline.cavelib.api;

public interface SurveyDataInterface {

    int getID();

    int getFromID();

    int getClosureToID();

    String getName();

    String getSection();

    String getType();

    String getExplorer();

    String getColor();

    String getProfileType();

    String getDate();

    double getLength();

    double getAzimut();

    double getInclination();

    double getDepth();

    double getDepthIn();

    double getDown();

    double getUp();

    double getRight();

    double getLeft();

    double getLongitude();

    double getLatitude();

    String getComment();

    Boolean isLocked();

    String getUuid();

    Boolean isExcluded();

    ProfileShapeInterface getShape();
}
