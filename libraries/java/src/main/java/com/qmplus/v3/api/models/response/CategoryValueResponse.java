package com.qmplus.v3.api.models.response;

/**
 * Class to hold the value of a populated category field.
 * Currently not linked to name of the category.
 *
 * @author Thomas
 *
 */
public class CategoryValueResponse
{
  private int categoryId;
  private double value;
  /**
   * @return the categoryId
   */
  public int getCategoryId()
  {
    return categoryId;
  }
  /**
   * @param categoryId the categoryId to set
   */
  public void setCategoryId(int categoryId)
  {
    this.categoryId = categoryId;
  }
  /**
   * @return the value
   */
  public double getValue()
  {
    return value;
  }
  /**
   * @param value the value to set
   */
  public void setValue(double value)
  {
    this.value = value;
  }


}
