package com.arianesline.cavelib.api;

import java.io.File;
import java.util.List;

public interface AggregationInterface {

  String getName();

  String getUnit();

  void setUnit(String unit);

  String getRootFolder();

  File getFile();

  List<? extends AggregationMemberInterface> getAggregationMembers();

  List<String> getClosuresDescriptionList();

  void buildNew(File file);

  void load(File file);

  void save();

  void addClosure(int idFirstInteraction, int idSecondInteraction);

  void removeClosure(int i);

  void resetErrors();

  void addLink(String member, int stationID, int index);

  StationIDLinkInterface getStationSourceIDLink(int stationID);

  String getStationSourceProject(int stationID);

  int getStationSourceID(int stationID);

  int getStationAGGIDFromSource(int stationID, String fileName);
}
