package com.example.myfirstapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;
import java.util.TimeZone;

import static junit.framework.Assert.assertEquals;

public class UtilitiesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getLastRecordedDateLabelFromLong() throws Exception {
        long timeInMillis = 1519464000000L;  // 02/24/2018 11:20 in GMT+2 (local dev. time zone)
        String result = Utilities.getDateTimeLabelFromLong(timeInMillis,
                Locale.US, TimeZone.getTimeZone("GMT+2"));

        assertEquals("Feb 24, 2018 11:20 AM", result);
    }

}