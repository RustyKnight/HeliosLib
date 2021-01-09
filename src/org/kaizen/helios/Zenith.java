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
public enum Zenith {
    /** Astronomical sunrise/set is when the sun is 18 degrees below the horizon. */
    ASTRONOMICAL(108),
    /** Nautical sunrise/set is when the sun is 12 degrees below the horizon. */
    NAUTICAL(102),
    /** Civil sunrise/set (dawn/dusk) is when the sun is 6 degrees below the horizon. */
    CIVIL(96),
    /** Official sunrise/set is when the sun is 50' below the horizon. */
    OFFICIAL(90.8333);

    private final BigDecimal degrees;

    private Zenith(double degrees) {
        this.degrees = BigDecimal.valueOf(degrees);
    }

    public BigDecimal degrees() {
        return degrees;
    }

}
