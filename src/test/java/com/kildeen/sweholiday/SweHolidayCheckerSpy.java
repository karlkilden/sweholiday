package com.kildeen.sweholiday;

import java.time.LocalDate;

public class SweHolidayCheckerSpy extends SweHolidayChecker {

    private Boolean isHolidayFreeMonthCalled;
    private Boolean isEasterOptimizationUsed;

    @Override
    boolean isHolidayFreeMonth(LocalDate date) {
        return isHolidayFreeMonthCalled = super.isHolidayFreeMonth(date);
    }

    public Boolean getHolidayFreeMonthCalled() {
        return isHolidayFreeMonthCalled;
    }
}
