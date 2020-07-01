package com.kildeen.sweholiday;

import java.time.LocalDate;

@FunctionalInterface
public interface HolidayMatch {

    boolean isHolidayDate(LocalDate date);


}
