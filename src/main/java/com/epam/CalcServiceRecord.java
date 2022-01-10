/*
 * Copyright © 2022 EPAM Systems, Inc. All Rights Reserved. All information contained herein is, and remains the
 * property of EPAM Systems, Inc. and/or its suppliers and is protected by international intellectual
 * property law. Dissemination of this information or reproduction of this material is strictly forbidden,
 * unless prior written permission is obtained from EPAM Systems, Inc
 */
package com.epam;

public record CalcServiceRecord(int a, int b) {

    public int add() {
        recursivePrint(1);
        return a + b;
    }

    public int multiply() {
        return a * b;
    }

    public int subtract() {
        return a - b;
    }

    public int divide() {
        if (b == 0) {
            return 0;
        }
        return a / b;

    }

    public void recursivePrint(int num) {
        if (num != 0) {
            recursivePrint(++num);
        }

    }

}
