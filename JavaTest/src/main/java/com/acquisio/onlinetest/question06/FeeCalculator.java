package com.acquisio.onlinetest.question06;

public class FeeCalculator {
    static double sumFeesWithMargin(Customer ... customers) {
        double monthlyFees = 0.0d;
        for (Customer c : customers) {
            if ("enterprise".equals(c.type)) {
                monthlyFees += (c.monthlyFee * 1.10d); // 10%
            } else if ("professional".equals(c.type)) {
                monthlyFees += (c.monthlyFee * 1.20d); // 20%
            } else if ("private".equals(c.type)) {
                monthlyFees += (c.monthlyFee * 1.30d); // 30%
            }
        }

        return monthlyFees;
    }
}
