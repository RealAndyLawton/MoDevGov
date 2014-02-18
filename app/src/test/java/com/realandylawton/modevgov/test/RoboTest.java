package com.realandylawton.modevgov.test;

import com.realandylawton.modevgov.MainActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {
    @Test
    public void testTrueIsTrue() throws Exception {
        assertEquals(true, true);
        ActivityController<MainActivity> activity = Robolectric.buildActivity(MainActivity.class);
        activity.restart();

        assertNotNull(activity);

    }
}