/*
 * Copyright © 2022 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */
package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceTest {
    @Test
    void addTest() {
        var calcService = new CalcServiceRecord(1, 3);
        assertEquals(4, calcService.add());
    }

    @Test
    void multiplyTest() {
        var calcService = new CalcServiceRecord(2, 8);
        assertEquals(16, calcService.multiply());
    }

    @Test
    void subtractTest() {
        var calcService = new CalcServiceRecord(3, 2);
        assertEquals(1, calcService.subtract());
    }

    @Test
    void divideTest() {
        var calcService = new CalcServiceRecord(6, 2);
        assertEquals(3, calcService.divide());
        calcService = new CalcServiceRecord(5, 0);
        assertEquals(0, calcService.divide());
    }
}

