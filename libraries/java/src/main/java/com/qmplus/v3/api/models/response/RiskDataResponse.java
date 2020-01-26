package com.qmplus.v3.api.models.response;

/**
 * RiskDataResponse should give list of question.
 *
 * THIS class will generate JSON out for categoryGroupRequest .
 *
 * @author gaurav.chugh
 *
 */
public class RiskDataResponse
{
  private Integer id;

  private Integer scale;

  private Integer dimension;

  private Integer singleDimension; // 0 not in use, 1 first, 2 second.. dimension only shown for the first category in group

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public Integer getScale()
  {
    return scale;
  }

  public void setScale(Integer scale)
  {
    this.scale = scale;
  }

  public Integer getDimension()
  {
    return dimension;
  }

  public void setDimension(Integer dimension)
  {
    this.dimension = dimension;
  }

  public Integer getSingleDimension()
  {
    return singleDimension;
  }

  public void setSingleDimension(Integer singleDimension)
  {
    this.singleDimension = singleDimension;
  }

}
