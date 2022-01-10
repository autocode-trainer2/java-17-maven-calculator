/*
 * Copyright © 2022 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */
package com.epam;

public record CalcServiceRecord(int a, int b) {

    public int add() {
        int first = a;
        int second = b;
        return first + second;

    }

    public int multiply() {
        boolean isNegative;
        if (b > 0) {
            isNegative = true;
        }
        return a * b;

    }

    public int subtract() {
        return a - b;
    }

    public int divide() {
        if (b == 0) {
            return 0;
        }
        int result = a / b;

        return result;


    }
}
