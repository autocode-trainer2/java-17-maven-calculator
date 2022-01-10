/*
 * Copyright © 2022 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */
package com.epam;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcServiceTest {
    private static CalcService calcService;

    @BeforeAll
    static void setUp() {
        calcService = new CalcServiceImpl();
    }

    @Test
    void addTest() {
        assertEquals(4, calcService.add(1, 3));
    }

    @Test
    void multiplyTest() {
        assertEquals(16, calcService.multiply(2, 8));
    }

    @Test
    void subtractTest() {
        assertEquals(0, calcService.subtract(2, 2));
    }

    @Test
    void divideTest() {
        assertEquals(3, calcService.divide(6, 2));
        assertEquals(0, calcService.divide(5, 0));
    }
}

