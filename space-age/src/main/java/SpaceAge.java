class SpaceAge {
  private double seconds;
  private double earthYears;

  static final double SECONDS_IN_EARTH_YEAR = 31557600.0;
  static final double MERCURY_YEAR_IN_EARTH_YEARS = 0.2408467;
  static final double VENUS_YEAR_IN_EARTH_YEARS = 0.61519726;
  static final double MARS_YEAR_IN_EARTH_YEARS = 1.8808158;
  static final double JUPITER_YEAR_IN_EARTH_YEARS = 11.862615;
  static final double SATURN_YEAR_IN_EARTH_YEARS = 29.447498;
  static final double URANUS_YEAR_IN_EARTH_YEARS = 84.016846;
  static final double NEPTUNE_YEAR_IN_EARTH_YEARS = 164.79132;

  SpaceAge(double seconds) {
    this.seconds = seconds;
    earthYears = seconds / SECONDS_IN_EARTH_YEAR;
  }

  double getSeconds() {
    return seconds;
  }

  double onEarth() {
    return earthYears;
  }

  double onMercury() {
    return earthYears / MERCURY_YEAR_IN_EARTH_YEARS;
  }

  double onVenus() {
    return earthYears / VENUS_YEAR_IN_EARTH_YEARS;
  }

  double onMars() {
    return earthYears / MARS_YEAR_IN_EARTH_YEARS;
  }

  double onJupiter() {
    return earthYears / JUPITER_YEAR_IN_EARTH_YEARS;
  }

  double onSaturn() {
    return earthYears / SATURN_YEAR_IN_EARTH_YEARS;
  }

  double onUranus() {
    return earthYears / URANUS_YEAR_IN_EARTH_YEARS;
  }

  double onNeptune() {
    return earthYears / NEPTUNE_YEAR_IN_EARTH_YEARS;
  }
}
