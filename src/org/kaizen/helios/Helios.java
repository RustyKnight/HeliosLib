/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kaizen.helios;

import java.time.ZonedDateTime;

/**
 *
 * @author shanew
 */
public class Helios {

    public static ZonedDateTime getSunRiseTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunriseCalendar(Zenith.OFFICIAL, date);
    }

    public static ZonedDateTime getSunSetTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunsetCalendar(Zenith.OFFICIAL, date);
    }

    public static ZonedDateTime getAstronomicalSunRiseTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunriseCalendar(Zenith.ASTRONOMICAL, date);
    }

    public static ZonedDateTime getAstronomicalSunSetTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunsetCalendar(Zenith.ASTRONOMICAL, date);
    }

    public static ZonedDateTime getNauticalSunRiseTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunriseCalendar(Zenith.NAUTICAL, date);
    }

    public static ZonedDateTime getNauticalSunSetTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunsetCalendar(Zenith.NAUTICAL, date);
    }

    public static ZonedDateTime getCivilSunRiseTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunriseCalendar(Zenith.CIVIL, date);
    }

    public static ZonedDateTime getCivilSunSetTime(Location location, ZonedDateTime date) {
        return new SolarEventCalculator(location).computeSunsetCalendar(Zenith.CIVIL, date);
    }
}
