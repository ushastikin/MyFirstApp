package com.example.myfirstapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class Utilities {

    // The utility classes shouldn't be initialized
    private Utilities() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @param timestamp the date in milliseconds
     * @param timeZone the time zone to use
     * @return the date with the MEDIUM date and SHORT time formatting styles according to the
     * provided locale and time zone
     * For example, Feb 24, 2018 11:20 AM is case of Locale.US
     */
    static String getDateTimeLabelFromLong(long timestamp,
                                           Locale locale,
                                           TimeZone timeZone) {
        Date dateTimestamp = new Date(timestamp);
        DateFormat dateFormat =
                DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, locale);
        dateFormat.setTimeZone(timeZone);
        return String.format("%s", dateFormat.format(dateTimestamp));
    }
}
