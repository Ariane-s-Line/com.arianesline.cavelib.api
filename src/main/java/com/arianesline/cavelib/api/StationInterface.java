package com.arianesline.cavelib.api;

public interface StationInterface {
  double getLongitude();

  double getLatitude();

  double getAbsoluteElevation();

  double getRelativeElevation();

  double getLocalX();

  double getLocalY();

  int getID();

  String getSection();

  String getComment();
}
