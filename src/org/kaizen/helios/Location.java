/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kaizen.helios;

import java.math.BigDecimal;

/**
 *
 * @author shanew
 */
public class Location {

    private BigDecimal latitude;
    private BigDecimal longitude;

    /**
     * Creates a new instance of <code>Location</code> with the given
     * parameters.
     *
     * @param latitude the latitude, in degrees, of this location. North
     * latitude is positive, south negative.
     * @param longitude the longitude, in degrees, of this location. East
     * longitude is positive, east negative.
     */
    public Location(double latitude, double longitude) {
        this.latitude = new BigDecimal(latitude);
        this.longitude = new BigDecimal(longitude);
    }

    /**
     * @return the latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @return the longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }
}
