package com.arianesline.cavelib.api;

import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.util.ArrayList;

public interface CaveSurveyInterface {

    String getExtraData();

    void setExtraData(String data);

    ArrayList<SurveyDataInterface> getSurveyDataInterface();

    String getDescription();

    String getGeoCoding();

    String getCaveName();

    default void setCaveName(String name) {
    }

    String getUnit();

    void setUnit(String unit);

    Boolean getUseMagneticAzimuth();

    default void setUseMagneticAzimuth(Boolean mode) {
    }

    ;

    public int addStation(String sectionname, String explorer, LocalDate datetime, String nomstation,
                          double direction, double length, double depthin, double depth, int fromid, int toid, String type, Color color,
                          double longitude, double latitude,
                          double up, double down, double left, double right, String comment, String profiletype, boolean islocked);

}
