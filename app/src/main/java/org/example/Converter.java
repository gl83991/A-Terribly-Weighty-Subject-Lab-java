package org.example;

public class Converter {
  public String toPounds (int ounces) {
    double pounds = ounces / 16.0;
    return String.format("%.4f %s", pounds, (Math.abs(pounds - 1.0) < 1e-9) ? "lb" : "lbs");
  } // 4 decimal places
  public String toPoundsAndOunces(int ounces) {
    int lbs = ounces / 16;
    int oz = ounces % 16;
    String lbUnit = (lbs == 1) ? "lb" : "lbs";
    return String.format("%d %s and %d oz", lbs, lbUnit, oz);
  }
}
