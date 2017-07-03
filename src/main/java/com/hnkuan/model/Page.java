package com.hnkuan.model;

/**
 * Implementation of multiple tiers order key.
 *
 * @author honnamkuan
 */
public class Page {

  private String name;
  private String comparisonKey;

  /**
   * Constructor for {@link Page}
   *
   * @param name {@link Page} Name
   * @param pWeight The weight value
   * @param pParentOrderKey Parent {@link Page} order key
   */
  public Page(String name, long pWeight, String pParentOrderKey) {
    this.name = name;
    comparisonKey =
        pParentOrderKey + (pParentOrderKey.length() > 0 ? "-" : "") + String.format("%07d",
            9999999 - pWeight);
  }

  public String getComparisonKey() {
    return comparisonKey;
  }

  @Override
  public String toString() {
    return name;
  }
}
