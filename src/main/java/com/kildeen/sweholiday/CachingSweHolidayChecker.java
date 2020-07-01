package com.kildeen.sweholiday;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachingSweHolidayChecker {

    @VisibleForTesting
    Map<Integer, Boolean> holidayCache;
    private SweHolidayChecker checker;

    public CachingSweHolidayChecker(SweHolidayChecker checker) {
        this.checker = checker;
        holidayCache = new ConcurrentHashMap<>();
    }

    public boolean isHolidayOrWeekend(LocalDate date) {
        return holidayCache.computeIfAbsent(date.getDayOfYear(), s -> checker.isSweHoliday(date));
    }

}