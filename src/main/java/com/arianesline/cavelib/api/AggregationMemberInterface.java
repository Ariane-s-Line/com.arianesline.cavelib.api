package com.arianesline.cavelib.api;

import javafx.beans.property.BooleanProperty;

public interface AggregationMemberInterface {

  String getName();

  void setName(String name);

  AggregationMemberType getType();

  void setType(AggregationMemberType type);

  String getErrorMessage();

  void setErrorMessage(String errorMessage);

  boolean getError();

  void setError(boolean value);

  BooleanProperty errorProperty();
}
