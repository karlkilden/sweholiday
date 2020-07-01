package com.kildeen.sweholiday;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Deque;

public class SweHolidayCheckerMock extends SweHolidayChecker {

    private Deque<Boolean> recorded = new ArrayDeque<>();

    private Boolean fixedResponse;

    @Override
    public boolean isSweHoliday(LocalDate date) {
        if (fixedResponse == null) {
            return recorded.pop();
        } else {
            return fixedResponse;
        }
    }

    public SweHolidayCheckerMock record(boolean value) {
        recorded.add(value);
        return this;
    }

    public void fixedResponse(Boolean fixedResponse) {
        this.fixedResponse = fixedResponse;
    }
}
